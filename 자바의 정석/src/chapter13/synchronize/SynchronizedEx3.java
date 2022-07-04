package chapter13.synchronize;

import java.util.ArrayList;

public class SynchronizedEx3 {
    public static void main(String[] args) throws InterruptedException {
        Table table = new Table();

        new Thread(new Cook(table), "COOK").start();
        new Thread(new Customer(table, "donut"), "CUSTOMER1").start();
        new Thread(new Customer(table, "burger"), "CUSTOMER2").start();

        Thread.sleep(5000);
        System.exit(0);
    }
}

class Customer implements Runnable {
    private Table table;
    private String food;

    Customer(Table table, String food) {
        this.table = table;
        this.food = food;
    }

    @Override
    public void run() {
        while (true) {
            try {Thread.sleep(100);} catch (InterruptedException e) {}
            // catch
            String name = Thread.currentThread().getName();

            table.remove(food);
            System.out.println(name + " ate a " + food);
        }//while
    }
}

class Cook implements Runnable {
    private Table table;

    Cook(Table table) {
        this.table = table;
    }

    @Override
    public void run() {
        while (true) {
            // 임의의 요리를 선택해 table에 추가
            int idx = (int) (Math.random() * table.dishNum()); //0 1 2
            table.add(table.dishNames[idx]);
            try {Thread.sleep(10);} catch (InterruptedException e) {}
        }//while
    }//run

}

class Table {
    String[] dishNames = {"donut", "burger", "donut"}; // donut이 더 자주 나온다.
    final int MAX_FOOD = 6; // 테이블에 놓을 수 있는 최대 음식 개수

    private ArrayList<String> dishes = new ArrayList<>();

    public synchronized void add(String dish) {
        // 테이블에 음식이 가득 찼으면, 테이블에 음식 추가 X
        while (dishes.size() >= MAX_FOOD) {
            String name = Thread.currentThread().getName();
            System.out.println(name + " is waiting.");
            try {
                wait(); // COOK 쓰레드를 기다리게 함
            } catch (InterruptedException e) {}
        }
        dishes.add(dish);
        notify(); // 기다리는 CUSTOMER 깨우기
        System.out.println("Dishes: " + dishes);
    }

    public void remove(String dishName) {
        synchronized (this) {
            String name = Thread.currentThread().getName();
            while (dishes.size() == 0) {
                System.out.println(name + " is waiting");
                try {
                    wait(); // CUSTOMER 쓰레드 대기
                    Thread.sleep(500);
                    }catch (InterruptedException e) {}
            }
            while (true) {
                for (int i = 0;i < dishes.size(); i++) {
                    if (dishName.equals(dishes.get(i))) {
                        dishes.remove(i);
                        notify(); //COOK을 깨우기 위해
                        return;
                    }
                }//for
                try {
                    System.out.println(name + " is waiting");
                    wait(); // 원하는 음식 없으면 CUSTOMER 대기
                    Thread.sleep(500);
                } catch (InterruptedException e) {}
            }//while
        }//synchronized
    }
    public int dishNum() {
        return dishNames.length;
    }
}

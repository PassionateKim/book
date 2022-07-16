package practice.ex.chapter13;

import java.util.ArrayList;

public class Chapter13_sync {
    public static void main(String[] args) throws Exception{
        Table table = new Table(); // 여러 쓰레드가 공유하는 객체

        new Thread(new Cook(table), "COOK1").start();
        new Thread(new Customer(table, "donut"), "CUST1").start();
        new Thread(new Customer(table, "burger"), "CUST2").start();

        Thread.sleep(2000);
        System.exit(0);
    }
}

class Cook implements Runnable{
    private Table table;

    Cook(Table table) {
        this.table = table;
    }

    @Override
    public void run() {
        while (true) {
            // 임의의 요리를 하나 선택해서 table에 추가
            int idx = (int) (Math.random() * table.dishNum());
            table.add(table.dishNames[idx]);

            try {
                Thread.sleep(1);
            } catch (Exception e) {}
        }//while
    }//run()
}//Cook

class Customer implements Runnable{
    private Table table;
    private String food;

    public Customer(Table table, String food) {
        this.table = table;
        this.food = food;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(100);
            } catch (Exception e) {}
            String name = Thread.currentThread().getName();
            table.remove(food);
            System.out.println(name + " ate a " + food);
        }
    }//run()
}

class Table {
    String[] dishNames = {"donut", "donut", "burger"};
    final int MAX_FOOD = 6; // 테이블에 놓을 수 있는 최대 음식의 개수

    private ArrayList<String> dishes = new ArrayList<>();

    public synchronized void add(String dish) {
        // 테이블에 음식이 가득찬 경우, 테이블에 음식을 추가하지 않는다.
        while (dishes.size() >= MAX_FOOD) {
            String name = Thread.currentThread().getName();
            System.out.println(name + " is waiting");
            try {
                wait(); //cook 대기
                Thread.sleep(500);
            } catch (Exception e) {}
        }

        dishes.add(dish);
        notify();
        System.out.println("COOK: " + dish + " 추가");
        System.out.println("Dishes: " + dishes.toString());
    }//add()

    public void remove(String dishName) {
        synchronized (this) {
            String name = Thread.currentThread().getName();

            while (dishes.size() == 0) {
                System.out.println(name + " is waiting");
                try {
                    wait();
                    Thread.sleep(500);
                } catch (Exception e) {}
            }

            while (true) {
                for (int i = 0; i < dishes.size(); i++) {
                    if (dishName.equals(dishes.get(i))) {
                        dishes.remove(i);
                        notify();
                        return;
                    }
                }//for

                try {
                    System.out.println(name + " is waiting");
                    wait();
                    Thread.sleep(500);
                } catch (Exception e) {}
            }

        }
    }//remove()

    public int dishNum() {
        return dishNames.length;
    }
}
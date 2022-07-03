package chapter13.multithread;

public class ThreadEx1 {
    public static void main(String[] args) {
        //Thread 클래스 상속
        MyThread myThread = new MyThread();

        //Runnable 인터페이스 구현
        Runnable myThread2 = new MyThread2();
        Thread thread2 = new Thread(myThread2);

        // 쓰레드 시작
        myThread.start();
        thread2.start();


        Thread t = Thread.currentThread();
        String name = t.getName();
        System.out.println(name);

    }
}

class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 15; i++) {
            System.out.println(getName()); // 부모 Thread의 getName()호출
        }
    }
}

class MyThread2 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 15; i++) {
            System.out.println(Thread.currentThread().getName()); // 부모 Thread의 getName()호출
        }
    }
}

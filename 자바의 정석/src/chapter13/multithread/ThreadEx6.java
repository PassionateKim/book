package chapter13.multithread;

public class ThreadEx6 {
    public static void main(String[] args) {
        AThread aThread = new AThread();
        BThread bThread = new BThread();
        aThread.start();
        bThread.start();

        long startTime = System.currentTimeMillis();

        try {
            aThread.join(); // main쓰레드가 aThread 작업 끝까지 기다린다.
            bThread.join(); // main쓰레드가 bThread 작업 끝까지 기다린다.
        } catch (InterruptedException e) {}

        System.out.println("소요시간: " + (System.currentTimeMillis()-startTime));
    }
}

class AThread extends Thread{
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.print("-");
        }
    }//run
}

class BThread extends Thread{
    public void run() {
        for (int i = 0; i < 500; i++) {
            System.out.print("|");
        }
    } //run
}

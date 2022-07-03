package chapter13.synchronize;

import chapter7.modifier.Ex;

public class SynchronizedEx1 {
    public static void main(String[] args) {

    }
}

class SynchronizedEx1_1 {
    public synchronized void showBalance(int money) {
        if (money < 0) {
            System.out.println("잘못된 입력입니다.");
        }
        try {
            Thread.sleep(1000);
        } catch (Exception e) {}
    }
}

class SynchronizedEx1_2 {
    public void showBalance(int money) {

        synchronized (this) {
            if (money < 0) {
                System.out.println("잘못된 입력입니다.");
            }
            try {
                Thread.sleep(1000);
            } catch (Exception e) {}
        }
    }
}
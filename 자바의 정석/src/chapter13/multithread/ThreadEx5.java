package chapter13.multithread;

import javax.swing.*;

/**
 * Interrupt
 */
public class ThreadEx5 {
    public static void main(String[] args) {
        Thread1234 thread1234 = new Thread1234();
        thread1234.start();
        // Interrupted 된 적이 있는지 체크
        System.out.println("thread1234.isInterrupted() = " + thread1234.isInterrupted());

        //main 쓰레드에서 Dialog띄우기
        JOptionPane.showInputDialog("값을 입력해주세요.");

        // Dialog에 입력하고 난 후 thread1234에 interrupt 주기
        thread1234.interrupt();

        // Interrupted 된 적이 있는지 체크
        System.out.println("thread1234.isInterrupted() = " + thread1234.isInterrupted());

        // thread1234가 아닌 main 쓰레드가 interrupted된 적 있는지 체크
        System.out.println("현재 쓰레드(main) interrupted()? : " + Thread.interrupted());
//        System.out.println(thread1234.interrupted());
    }
}

class Thread1234 extends Thread{
    public void run() {
        int i = 10;

        while (i != 0 && !isInterrupted()) {
            System.out.println(i--);
            // 시간 지연
            for(long x=0;x<2500000000L;x++);
            }
        }
    }
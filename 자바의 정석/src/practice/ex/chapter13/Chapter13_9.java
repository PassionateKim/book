package practice.ex.chapter13;

import javax.swing.*;

public class Chapter13_9 {
    public static void main(String[] args) {
        Chapter13_9_1 th1 = new Chapter13_9_1();
        th1.start();

        String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
        System.out.println("입력하신 값은 " + input + "입니다.");
        th1.interrupt();
    }
}

class Chapter13_9_1 extends Thread {
    public void run() {
        int i = 10;
        while (i != 0 && !isInterrupted()) {
            System.out.println(i--);

            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                interrupt();
            }
        }//while
        System.out.println("카운트가 종료되었습니다.");
    }
}

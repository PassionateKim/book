package chapter13.multithread;

import javax.swing.*;

public class ThreadEx2 {
    public static void main(String[] args) {
        myThread123 myThread123 = new myThread123();
        myThread123.start();

        String input = JOptionPane.showInputDialog("값을 입력하세요.");
        System.out.println("입력한 값: " + input);
    }
}

class myThread123 extends Thread{
    @Override
    public void run() {
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
            try {
                sleep(1000);
            } catch (Exception e) {

            }
        }
    }// run
}
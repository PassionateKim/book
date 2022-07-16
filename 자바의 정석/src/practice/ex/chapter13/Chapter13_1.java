package practice.ex.chapter13;

public class Chapter13_1 {
    public static void main(String[] args) {
        Thread thread = new Thread(new Thread1());
    }
}

class Thread1 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.print('-');
        }
    }
}

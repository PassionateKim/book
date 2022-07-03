package chapter13.multithread;

public class ThreadEx3 implements Runnable{
    static boolean autoSave = false;

    public static void main(String[] args) {
        Thread demonThread = new Thread(new ThreadEx3());
        demonThread.setDaemon(true); // 데몬 쓰레드로 설정
        demonThread.start();

        // 메인 쓰레드
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
            System.out.println(i);

            if (i == 5) {
                autoSave = true;
            }
        }
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000 * 3);
            } catch (Exception e) {}
            if (autoSave) {
                System.out.println("파일이 저장되었습니다.");
            }
        }
    }
}
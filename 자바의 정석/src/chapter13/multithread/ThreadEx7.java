package chapter13.multithread;

/**
 * yield
 */
public class ThreadEx7 {
    public static void main(String[] args) {

    }
}

class ThreadEx7_1 implements Runnable {
    boolean stopped = false;
    boolean suspended = false;

    Thread th;

    ThreadEx7_1(String name) {
        th = new Thread(this, name);
    }

    @Override
    public void run() {
        while (!stopped) {
            if (!suspended) {
                /**
                 * 작업 수행
                 */
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
            } else {
                Thread.yield(); // 양보 -> OS에 통보
            }//if
        }//while
    }
}

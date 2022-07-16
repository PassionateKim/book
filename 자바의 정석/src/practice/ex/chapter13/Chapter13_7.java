package practice.ex.chapter13;

public class Chapter13_7 {
    static boolean stopped = false;
    public static void main(String[] args)
    {
        Thread5 th1 = new Thread5();
        th1.start();
        try {
            Thread.sleep(6*1000);
        } catch(Exception e) {}
        stopped = true; // . 쓰레드를 정지시킨다
        th1.interrupt(); // . 일시정지 상태에 있는 쓰레드를 깨운다
        System.out.println("stopped");
    }
}
class Thread5 extends Thread {
    public void run() {
// Exercise13_7.stopped false . 의 값이 인 동안 반복한다
        for(int i=0; !Chapter13_7.stopped; i++) {
            System.out.println(i);
            try {
                Thread.sleep(3*1000);
            } catch(Exception e) {}
        }
    } // run()
}

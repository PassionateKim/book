package chapter14.lambda;

public class LambdaEx1 {
    public static void main(String[] args) {

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });

        Thread thread = new Thread(() -> {
            System.out.println("hello!");
        });
    }
}

class L implements Runnable {

    @Override
    public void run() {
        System.out.println("hello!");
    }
}

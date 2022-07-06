package chapter14.lambda;

public class LambdaEx4 {
    static void execute(MyFunction4 myFunction4) {
        myFunction4.run();
    }

    static MyFunction4 getMyFunction4() {
        MyFunction4 f1 = () -> System.out.println("f1.run");

        return f1;
    }
    public static void main(String[] args) {
        // 람다식으로 구현
        MyFunction4 f1 = () -> System.out.println("f1.run");

        MyFunction4 f2 = new MyFunction4() {
            @Override
            public void run() {
                System.out.println("f2.run");
            }
        };

        MyFunction4 f3 = getMyFunction4();

        f1.run();
        f2.run();
        f3.run();

        execute(()->System.out.println("하하하하"));
    }
}

interface MyFunction4 {
    public abstract void run();
}

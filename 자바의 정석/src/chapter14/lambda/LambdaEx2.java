package chapter14.lambda;

/**
 * 람다와 함수형 인터페이스
 */
public class LambdaEx2 {
    public static void main(String[] args) {

        MyFunction myFunction = (MyFunction) (a,b) -> a < b? a : b;
        MyFunction myFunctionA = (a,b) -> a < b? a : b;

        int min = myFunction.min(3, 5); // 3


        MyFunction2 myFunction2 = () -> {}; /// MyFunction2 myFunction2 = (MyFunction)(()->{});
//        System.out.println(()->{}); 람다식은 객체임에도 Object 타입으로 형변환 불가
        System.out.println((MyFunction2)(()->{}));

    }
}

@FunctionalInterface
interface MyFunction {
    public abstract int min(int a, int b);
}

@FunctionalInterface
interface MyFunction2 {
    public abstract void method();
}

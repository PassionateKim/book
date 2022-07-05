package chapter14.methodreference;

import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReferEx2 {
    public static void main(String[] args) {
//        Supplier<MyClass> supplier = () -> new MyClass();
        Supplier<MyClass> supplier = MyClass::new;
        System.out.println("supplier.get() = " + supplier.get());

//        Function<Integer, MyClass> function = (i) -> new MyClass(i);
        Function<Integer, MyClass> function = MyClass::new;
        MyClass mc = function.apply(100);
        System.out.println("mc.a = " + mc.a);

        Function<Integer, int[]> integerFunction = (i) -> new int[i];
        int[] ints = integerFunction.apply(100);
        System.out.println("ints.length = " + ints.length);

        Function<Integer, int[]> integerFunction2 = int[]::new;
        int[] ints2 = integerFunction2.apply(200);
        System.out.println("ints2.length = " + ints2.length);
    }
    
}

class MyClass {
    int a;
    MyClass() {
        
    }

    MyClass(int a) {
        this.a = a;
    }
}

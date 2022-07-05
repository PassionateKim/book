package chapter14.methodreference;

import java.util.function.Function;

public class MethodReferEx1 {
    public static void main(String[] args) {
//        Function<String, Integer> f = (String s) -> Integer.parseInt(s);
        //클래스 이름::메서드이름
        Function<String,Integer> f = Integer::parseInt;
        System.out.println(f.apply("200")+100);
    }
}

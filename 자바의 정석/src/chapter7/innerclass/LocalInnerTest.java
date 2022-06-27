package chapter7.innerclass;

import java.util.*;

public class LocalInnerTest {

    public static void main(String[] args) {


        LocalInnerTest test = new LocalInnerTest();
        Object obj = test.func();
        System.out.println("obj = " + obj);
        System.out.println("obj = " + obj);
        System.out.println("obj = " + obj);
        System.out.println("obj = " + obj);

    }

    public Object func() {

        final ArrayList<String> list = new ArrayList<String>(10);
        list.add("hello ");

        class LocalInner {
            // 객체 출력 시마다 호출
            public String toString() {

                StringBuilder sb = new StringBuilder();

                for (String s : list) sb.append(s);

                list.add("hi ");
                return sb.toString();
            }

        }
        ; // end of class, LocalInnerTest.func().LocalInner
        return new LocalInner();
    }
}
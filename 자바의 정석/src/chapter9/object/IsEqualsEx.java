package chapter9.object;

public class IsEqualsEx {
    public static void main(String[] args) {
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();

        System.out.println(apple1.equals(apple2));
        
        //false
        apple1 = apple2;

        System.out.println(apple1.equals(apple2));
        //true
    }
}

class Apple {

}

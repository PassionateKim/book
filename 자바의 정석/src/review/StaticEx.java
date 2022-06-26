package review;

public class StaticEx {
    public static void main(String[] args) {
        Static.method(50);
    }
}

class Static {
    static void method(int x) {
        System.out.println(x);
    }
}

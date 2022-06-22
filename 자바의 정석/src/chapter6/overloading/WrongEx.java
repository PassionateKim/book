package chapter6.overloading;

public class WrongEx {
    public static void main(String[] args) {

    }

    long add(int x, long y) {
        return x + y;
    }

    long add(long x, int y) {
        return (x + y);
    }
}

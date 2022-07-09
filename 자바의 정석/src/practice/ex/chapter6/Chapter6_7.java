package practice.ex.chapter6;

import static java.lang.Math.*;

public class Chapter6_7 {
    public static void main(String[] args) {
        MyPoint p = new MyPoint(1, 1);
        System.out.println(p.getDistance(2,2));
    }
}

class MyPoint {
    int x;
    int y;

    MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double getDistance(int x1, int y1) {
        double v = sqrt(pow(abs(x - x1), 2) + pow(abs(y - y1), 2));
        return v;
    }
}

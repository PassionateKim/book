package practice.ex.chapter6;

import static java.lang.Math.*;

public class Chapter6_6 {
    static double getDistance(int x, int y, int x1, int y1) {
        double dis = sqrt(pow(abs(x - x1), 2) + pow(abs(y - y1), 2));
        return dis;
    }
    public static void main(String[] args) {
        System.out.println(getDistance(1,1,2,2));
    }
}

package chapter9.object;

public class CloneEx2 {
    public static void main(String[] args) {
        Circle c1 = new Circle(new Point(1, 1), 2.0);
        Circle c2 = c1.shallowCopy();

        c1.p.x = 9;
        c1.r = 3;

        System.out.println("c1.r = " + c1.r);
        System.out.println("c2.p.x = " + c2.r);
    }
}

class Circle implements Cloneable {
    Point p; // 원점
    double r; // 반지름

    Circle(Point p, double r) {
        this.p = p;
        this.r = r;
    }

    public Circle shallowCopy() {
        Object obj = null;
        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {}
        return (Circle) obj;
    }
}

class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

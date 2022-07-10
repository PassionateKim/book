package practice.ex.chapter7;

public class Chapter7_22 {
    static double sumArea(Shape[] p) {
        double sum = 0;
        for (Shape shape : p) {
            sum += shape.calcArea();
        }
        return sum;
    }
    public static void main(String[] args) {
        Shape[] arr = {new Circle(5.0), new Rectangle(3, 4), new Circle(1)};
        System.out.println("면적의 합:"+sumArea(arr));
    }
}

abstract class Shape {
    Point p;

    Shape() {
        this(new Point(0, 0));
    }

    public Shape(Point p) {
        this.p = p;
    }

    abstract double calcArea();

    Point getPosition() {
        return p;
    }

    void setPosition(Point p) {
        this.p = p;
    }
}

class Circle extends Shape {
    double r; // 반지름

    Circle(double r) {
        this(new Point(0, 0), r); // Circle(Point p, double r)
    }

    Circle(Point p, double r) {
        super(p); //Point 초기화
        this.r = r;
    }

    @Override
    double calcArea() {
        return 3.14 * (Math.pow(r, 2));
    }
}// Circle

class Rectangle extends Shape{
    double width;
    double height;

    Rectangle(double width, double height) {
        this(new Point(0, 0), width, height);
    }

    public Rectangle(Point p, double width, double height) {
        super(p);
        this.width = width;
        this.height = height;
    }

    @Override
    double calcArea() {
        return width * height;
    }

    boolean isSquare() {
        if (width == height) {
            return true;
        } else {
            return false;
        }
    }
}

class Point {
    int x;
    int y;

    public Point() {
        this(0,0);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "[" + x + "," + y + "]";
    }
}
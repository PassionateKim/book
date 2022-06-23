package chapter7.inherent;

public class InherentEx2 {
    public static void main(String[] args) {
        // 꼭지점 배열
        Point[] points = {
                new Point(0,0),
                new Point(5,0),
                new Point(0,5),
                new Point(5,5)
        };

        FourSquare fourSquare = new FourSquare(points);
        fourSquare.PrintPoints();
    }
}

// 꼭지점
class Point {
    int x;
    int y;
    // 생성자
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

// 사각형
class Square {
    Point[] points = new Point[4];

}

// 정사각형
class FourSquare extends Square{
    //Point[] points = new Point[4]; 상속받음
    //생성자
    FourSquare(Point[] points){
        this.points = points;
    }

    void PrintPoints() {
        for (Point point : points) {
            System.out.println("point (x, y) = (" + point.x +"," + point.y +")");
        };
    }
}

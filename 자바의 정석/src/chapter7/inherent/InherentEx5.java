package chapter7.inherent;

public class InherentEx5 {
    public static void main(String[] args) {
        Pointer3d pointer3d = new Pointer3d(1, 2, 3);

    }
}
class Pointer {
    int x,y;

    // 부모 생성자
    Pointer(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Pointer3d extends Pointer{
    int z;

    //자식 생성자
    Pointer3d(int x, int y, int z) {
        super(x,y); // 부모 클래스의 Pointer(int x, int y)를 호출한다.
        this.x = x;
        this.y = y;
        this.z = z;
    }
}

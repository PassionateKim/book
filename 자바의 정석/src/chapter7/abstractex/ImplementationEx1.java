package chapter7.abstractex;

public class ImplementationEx1{
    public static void main(String[] args) {
        Fightable solider1 = new Solider("Kim");
        Solider solider2 = new Solider("Park");

        solider1.move(3,4);
        //x: 3만큼 이동하였습니다.
        //y: 4만큼 이동하였습니다.
        solider1.attack(solider2);
        //Park을 공격했습니다.
    }
}

class Solider implements Fightable {
    String name;
    int x = 0;
    int y = 0;

    Solider(String name) {
        this.name = name;
    }

    /**
     * 리턴타입이 인터페이스라는 것은 메서드가
     * 해당 인터페이스를 구현한 클래스의
     * 인스턴스를 반환한다는 것을 의미한다.
     */
    Fightable method() {
        Solider solider = new Solider("Min");
        return solider;
    }
    @Override
    public void attack(Solider solider) {
        System.out.println(solider.name + "을 공격했습니다.");
    }

    @Override
    public void move(int x, int y) {
        this.x += x;
        this.y += y;
        System.out.println("x: " + x + "만큼 이동하였습니다.");
        System.out.println("y: " + y + "만큼 이동하였습니다.");
    }
}
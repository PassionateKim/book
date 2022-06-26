package chapter7.interface_ex;

/**
 * 스타크래프트 예제
 */
public class InterfaceEx {
    public static void main(String[] args) {
        Scv scv = new Scv();
        DropShip dropShip = new DropShip();
        scv.repair(dropShip);
    }
}

class Unit {
    final int MAX_HP;
    int HealPoint = 0;
    Unit(int max_hp) {
        MAX_HP = max_hp;

    }
}

class GroundUnit extends Unit {

    GroundUnit(int max_hp) {
        super(max_hp);
    }
}

class AirUnit extends Unit {

    AirUnit(int max_hp) {
        super(max_hp);
    }
}

class DropShip extends AirUnit implements Repairable {

    DropShip() {
        super(125);
    }
    @Override
    public String toString() {
        return "DropShip";
    }
}

class Scv extends GroundUnit implements Repairable {

    Scv() {
        super(60);
    }

    void repair(Repairable r) {
        System.out.println(r instanceof DropShip);
        if (r instanceof Unit) {
            ((Unit) r).HealPoint += 10;
            System.out.println(r.toString()+"을 치료하였습니다.");
        }
    }
}
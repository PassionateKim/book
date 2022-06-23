package chapter7.inherent;

/**
 * 오버라이딩
 */
public class InherentEx3 {
    public static void main(String[] args) {
        Monkey monkey = new Monkey();
        monkey.Shout();
    }
}

class Animal {
    protected void Shout() {
        System.out.println("나는 동물입니다.");
    }
}

class Monkey extends Animal {
    public void Shout() {
        //System.out.println("나는 동물입니다.");
        System.out.println("나는 원숭이 입니다.");
    }
}

package chapter6.initialize;

public class InitializeEx3 {
    public static void main(String[] args) {
        Member member1 = new Member();
        Member member2 = new Member("김김김");

        System.out.println("member1.id = " + member1.id);
        //member1.id = 1
        System.out.println("member2.id = " + member2.id);
        //member2.id = 2
    }
}

class Member {
    int id;
    String name;
    static int count;
    // 인스턴스 블럭
    {
        count++;
        this.id = count;
    }
    Member() {
//        count++;
//        this.id = count;
     }

    Member(String name) {
//        count++;
//        this.id = count;
        this.name = name;
    }
}

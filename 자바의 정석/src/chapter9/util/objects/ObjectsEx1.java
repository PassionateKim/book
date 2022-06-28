package chapter9.util.objects;

import java.util.Objects;

public class ObjectsEx1 {
    public static void main(String[] args) {
        Member member = new Member();
        String a = null;
        member.setName(a);
        member.setName("kim");
        System.out.println("member.name = " + member.name);

    }
}

class Member {
    String name;

    public void setName(String name) {
        this.name = Objects.requireNonNull(name, "name must not be null");
    }
}

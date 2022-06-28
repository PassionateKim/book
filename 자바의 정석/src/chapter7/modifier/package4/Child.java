package chapter7.modifier.package4;

import chapter7.modifier.package3.Parent;

public class Child extends Parent {
    void method() {
        System.out.println(super.protectedMember);
    }
}

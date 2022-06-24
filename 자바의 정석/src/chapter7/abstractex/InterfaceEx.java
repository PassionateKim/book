package chapter7.abstractex;

public class InterfaceEx {
    public static void main(String[] args) {
        A a = new A();
        I i = new B();
        I i2 = new C();

        a.methodA(i);
        a.methodA(i2);
    }
}

interface I {
    public abstract void method();
}

class A {
    public void methodA(I i) {
        i.method();
    }
}

class B implements I{

    @Override
    public void method() {
        System.out.println("methodB");
    }
}

class C implements I {
    @Override
    public void method() {
        System.out.println("methodC");
    }
}

package review.package1;

public class SamePackage {
    public static void main(String[] args) {
        /**
         * private만 안된다.
         */
        Modifier modifier = new Modifier();
        modifier.methodPublic();
        modifier.methodProtected();
        modifier.methodDefault();

        ChildModifier childModifier = new ChildModifier();
        childModifier.methodPublic();
        childModifier.methodProtected();
        childModifier.methodDefault();

    }
}

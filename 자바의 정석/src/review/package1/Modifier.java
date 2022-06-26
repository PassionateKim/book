package review.package1;

/**
 * 같은 패키지 내 같은 클래스에서의 접근
 */
public class Modifier {
    public static void main(String[] args) {
        Modifier modifier = new Modifier();
        modifier.methodPublic();
        modifier.methodProtected();
        modifier.methodDefault();
        modifier.methodPrivate();
    }
    public void methodPublic() {

    }

    protected void methodProtected() {

    }
    void methodDefault() {

    }
    private void methodPrivate() {

    }
}

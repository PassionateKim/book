package chapter3;

public class OperatorEx2 {
    public static void main(String[] args) {

        // 후위형
        int i = 5;
        int j = 0;

        j = i++;
        System.out.println("j=i++; 실행 후, i=" + i +", j="+ j);

        // 전위형
        i = 5;
        j = 0;
        j = ++i;
        System.out.println("j=++i; 실행 후, i=" + i +", j="+ j);
    }
}

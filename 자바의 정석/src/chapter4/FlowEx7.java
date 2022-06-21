package chapter4;

/**
 * 이름 붙은 반복문
 * 다중 if문에서 한번에 탈출할 수 있게 해준다.
 */
public class FlowEx7 {
    public static void main(String[] args) {
        loop1 :
        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (j == 5) {
                    break loop1;
                }
                System.out.println(i+"*"+j+"="+i*j);
            }
        }
    }
}

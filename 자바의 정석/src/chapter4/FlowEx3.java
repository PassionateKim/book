package chapter4;

public class FlowEx3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        String[] arr = {"*","**","***","****","*****"};
        for (String tmp : arr) {
            System.out.println("tmp = " + tmp);
        }
    }
}

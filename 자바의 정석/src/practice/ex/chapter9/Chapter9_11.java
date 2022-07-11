package practice.ex.chapter9;

import java.util.Scanner;

public class Chapter9_11 {
    public static void main(String[] args) {
        int from = 0;
        int to = 0;

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] tmp = input.toCharArray();
        from = tmp[0] - '0';
        to = tmp[2] - '0';

        for (int i = from; i <= to; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(i+"*"+j+"="+i*j);
            }
            System.out.println();
        }
    }
}

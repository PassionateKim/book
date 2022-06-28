package chapter9.util.stringtoken;

import java.util.StringTokenizer;

public class StringTokenEx1 {
    public static void main(String[] args) {
        String input = "삼십만삼천백십오";
        System.out.println(input);
        System.out.println(hangulToNum(input));
    }

    public static long hangulToNum(String input) {
        long result = 0;
        long tmpResult = 0;
        long num = 0;

        final String NUMBER = "영일이삼사오육칠팔구";
        final String UNIT = "십백천만억조";
        final long[] UNIT_NUM = {10, 100, 1000, 10000, (long) 1e8, (long) 1e12};

        StringTokenizer stringTokenizer = new StringTokenizer(input, UNIT, true);

        while (stringTokenizer.hasMoreTokens()) {
            String token = stringTokenizer.nextToken();
            int check = NUMBER.indexOf(token);
            System.out.println("token = " + token);
            if (check == -1) { // UNIT 단위인 경우
                if ("만억조".indexOf(token) == -1) {//"십백천"
                    tmpResult += (num != 0 ? num : 1) * UNIT_NUM[UNIT.indexOf(token)];
                } else {//"만억조"
                    tmpResult += num;
                    result += (tmpResult != 0 ? tmpResult : 1) * UNIT_NUM[UNIT.indexOf(token)];

                    tmpResult = 0;
                }
                num = 0;
            } else { // 숫자인 경우
                num = check; // 숫자가 들어온다.
            }
            System.out.println("result = " + result);
            System.out.println("tmpResult = " + tmpResult);
            System.out.println("num = " + num);
        }
        return result + tmpResult + num;
    }
}

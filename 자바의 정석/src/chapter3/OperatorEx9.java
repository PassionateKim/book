package chapter3;

import static java.lang.Integer.toBinaryString;

public class OperatorEx9 {
    public static void main(String[] args) {
        byte p = 11;

        System.out.printf("p = %d     [%32s]\n", p, toBinaryString(p));
        //p = 11     [                            1011]
        System.out.printf("~p = %d   [%16s]\n", ~p, toBinaryString(~p));
        //~p = -12   [11111111111111111111111111110100]
        System.out.printf("~p+1 = %d [%16s]\n", ~p+1, toBinaryString(~p+1));
        //~p+1 = -11 [11111111111111111111111111110101]
    }
}

package chapter3;

import static java.lang.Integer.toBinaryString;

public class OperatorEx8 {
    public static void main(String[] args) {
        int x = 0xAA, y = 0xE;

        System.out.printf("x = %#X  \t\t[%16s]\n", x, toBinaryString(x));
        //x = 0XAA  	[        10101010]
        System.out.printf("y = %#X  \t\t[%16s]\n", y, toBinaryString(y));
        //y = 0XE  		[            1110]
        System.out.printf("%#X | %#X = \t[%16s]\n", x, y, toBinaryString(x|y));
        //0XAA | 0XE = 	[        10101110]
        System.out.printf("%#X & %#X = \t[%16s]\n", x, y, toBinaryString(x&y));
        //0XAA & 0XE = 	[            1010]
        System.out.printf("%#X ^ %#X = \t[%16s]\n", x, y, toBinaryString(x^y));
        //0XAA ^ 0XE = 	[        10100100]
    }
}

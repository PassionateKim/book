package practice.ex.chapter10;

import java.text.DecimalFormat;

/**
 * parse의 쓰임은 두가지
 */
public class Chapter10_3 {
    public static void main(String[] args) {
        String data = "123,456,789.5";

        DecimalFormat df = new DecimalFormat("#,###.#");
        DecimalFormat df2 = new DecimalFormat("#,#");
        DecimalFormat df3 = new DecimalFormat("#");

        try {
            Number num = df2.parse(data);
            Number num2 = df3.parse(data);
            double d = num.doubleValue();
            double d2 = num2.doubleValue();
            System.out.println("d = " + d);
            System.out.println("d2 = " + d2);
            System.out.println("반올림: " + Math.round(d));
            System.out.println("만단위: " + df2.format(d));
        } catch (Exception e) {
            System.out.println("에러발생");
        }

        String pattern = "####,####.##";
        double number = 123456789.123;

        DecimalFormat numberFormat = new DecimalFormat(pattern);

        System.out.println(number);

        System.out.println(numberFormat.format(number));

    }//main
}

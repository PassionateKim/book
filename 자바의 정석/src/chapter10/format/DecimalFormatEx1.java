package chapter10.format;

import java.text.DecimalFormat;

public class DecimalFormatEx1 {
    public static void main(String[] args) {
        double test = 1231414545.6789;
        // 10진수, 빈자리는 0으로 채운다
        DecimalFormat df1 = new DecimalFormat("000000");
        System.out.println(df1.format(test));

        // 10진수, 빈자리는 0으로 채운다.
        DecimalFormat df2 = new DecimalFormat("000000.000000");
        System.out.println(df2.format(test));

        // 10진수, 빈자리는 채우지 않는다.
        DecimalFormat df3 = new DecimalFormat("#");
        System.out.println(df3.format(test));

        // 10진수, 빈자리는 채우지 않는다.
        DecimalFormat df4 = new DecimalFormat("##.###");
        System.out.println(df4.format(test));

        // 통화표시
        DecimalFormat df5 = new DecimalFormat("\u00A4####");
        System.out.println(df5.format(test));

        // 단위구분 표시
        DecimalFormat df6 = new DecimalFormat("###,###");
        System.out.println(df6.format(test));
    }
}

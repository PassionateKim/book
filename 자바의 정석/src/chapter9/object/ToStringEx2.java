package chapter9.object;

import java.util.Date;

/**
 * toString을 오버라이드 했기 때문에
 * 다르게 출력
 */
public class ToStringEx2 {
    public static void main(String[] args) {
        String korea = new String("Korea");
        System.out.println("korea = " + korea);

        Date date = new Date();
        System.out.println("date = " + date);
    }
}

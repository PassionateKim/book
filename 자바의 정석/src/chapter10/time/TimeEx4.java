package chapter10.time;

import java.time.LocalDate;

/**
 * 전후 비교
 */
public class TimeEx4 {
    public static void main(String[] args) {
        LocalDate localDate1 = LocalDate.of(2021,3,5);
        LocalDate localDate2 = LocalDate.of(2021,3,6);

        System.out.println(localDate1.isAfter(localDate1)); // false
        System.out.println(localDate1.isBefore(localDate2)); // true
    }
}

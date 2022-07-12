package practice.ex.chapter10;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Chapter10_7 {
    public static void main(String[] args) {
        int day = 0;
        LocalDate localDate = LocalDate.of(2016, 12, 1);
        System.out.println(localDate.with(TemporalAdjusters.dayOfWeekInMonth(4, DayOfWeek.TUESDAY)));
    }
}

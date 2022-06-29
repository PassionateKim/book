package chapter10.time;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

/**
 * TemporalAdjusters
 */
public class TimeEx3 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();//2022-06-29
        LocalTime localTime = LocalTime.now();

        LocalDate withYear = localDate.withYear(2015);//2015-06-29
        LocalDate plusYear = localDate.plusYears(1); //2023-06-29

        LocalTime minusTime = localTime.minusMinutes(30);

        LocalDate adjusterYear = localDate.with(TemporalAdjusters.firstDayOfYear());
        System.out.println(adjusterYear); // 당 해의 첫째 날
    }
}

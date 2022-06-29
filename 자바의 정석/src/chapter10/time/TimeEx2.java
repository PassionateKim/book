package chapter10.time;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

/**
 * LocalDate, LocalTime getxx 메서드
 */
public class TimeEx2 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now(); // 현재날짜

        int year = localDate.getYear();
        Month month = localDate.getMonth(); // JUNE
        int monthValue = localDate.getMonthValue(); // 6


        LocalTime localTime = LocalTime.now(); // 현재 시간

        int hour = localTime.getHour(); // 시
        int minute = localTime.getMinute(); // 분
        int second = localTime.getSecond(); // 초

    }
}

package chapter10.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * LocalTime, LocalDate 기본
 */
public class TimeEx1 {
    public static void main(String[] args) {
        //now()
        LocalDate localDate = LocalDate.now(); //2022-06-29
        LocalTime localTime = LocalTime.now(); // 21:55:02.6450

        //of()
        LocalDate wantedDate = LocalDate.of(2022, 12, 24); //2022-12-24
        LocalTime wantedTime = LocalTime.of(11, 30, 45);//11시 30분 45초
        // 원하는 날짜의 localDateTime도 만들 수 있다.
        LocalDateTime wantedLocalDateTime = LocalDateTime.of(wantedDate, wantedTime);
    }
}

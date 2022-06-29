package chapter10.time;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
/**
 * to 메서드 사용하기
 */
public class TimeEx7 {
    public static void main(String[] args) {
        //Period
        LocalDate localDate = LocalDate.of(2020, 6, 29);
        LocalDate localDateNow = localDate.now(); //2022-06-29

        Period periodDate = Period.between(localDate, localDateNow);

        long totalMonth = periodDate.toTotalMonths();


        //Duration
        LocalTime localTime = LocalTime.of(10, 30, 25);//10:30:25
        LocalTime localTimeNow = localTime.now();

        Duration durationTime = Duration.between(localTime, localTimeNow);

        long toDays = durationTime.toDays();
        long toHours = durationTime.toHours();
        long toMillis = durationTime.toMillis();
        long toNanos = durationTime.toNanos();

    }
}

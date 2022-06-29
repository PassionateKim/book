package chapter10.time;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 * until
 */
public class TimeEx6 {
    public static void main(String[] args) {
        //localDate
        LocalDate localDate = LocalDate.of(2020, 6, 29);
        LocalDate localDateNow = localDate.now(); //2022-06-29


        Period periodDate = localDate.until(localDateNow); // 그냥 차이
        long pe = localDate.until(localDateNow, ChronoUnit.DAYS); // 숫자로 730일 차이

        //get 으로 값 꺼내오기
        long year = periodDate.get(ChronoUnit.YEARS);
        long month = periodDate.get(ChronoUnit.MONTHS);
        long day = periodDate.get(ChronoUnit.DAYS);

    }
}

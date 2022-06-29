package chapter10.time;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 * get
 */
public class TimeEx5 {
    public static void main(String[] args) {
        //localDate
        LocalDate localDate = LocalDate.of(2020, 6, 29);
        LocalDate localDateNow = localDate.now(); //2022-06-29


        Period periodDate = Period.between(localDate, localDateNow);

        //get 으로 값 꺼내오기
        long year = periodDate.get(ChronoUnit.YEARS); // 2
        long month = periodDate.get(ChronoUnit.MONTHS); // 0
        long day = periodDate.get(ChronoUnit.DAYS); // 0


        //localTime
        LocalTime localTime = LocalTime.of(10, 30, 25);//10:30:25
        LocalTime localTimeNow = localTime.now();

        Duration durationTime = Duration.between(localTime, localTimeNow);

        //get 으로 값 꺼내오기
        //duration은 get으로 꺼낼 수 있는 게 두 개 뿐이다..
        long second = durationTime.get(ChronoUnit.SECONDS);
        long nanos = durationTime.get(ChronoUnit.NANOS);
    }
}

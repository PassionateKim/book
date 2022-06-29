package chapter10.time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * 포맷
 */
public class TimeEx8 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2021, 01, 01);

        //DateTimeFormatter
        String yyyyMMdd = DateTimeFormatter.ISO_LOCAL_DATE.format(localDate); //2021-01-01

        // 직접 형식 만들기
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
        String yyyyMMdd2 = dateTimeFormatter.format(localDate); //2021.01.01


    }
}

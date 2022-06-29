package chapter10.time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * 파싱
 */
public class TimeEx9 {
    public static void main(String[] args) {
        //DateTimeFormatter static 사용
        LocalDate localDate = LocalDate.parse("2022-06-29", DateTimeFormatter.ISO_LOCAL_DATE);

        //DateTimeFormatter ofPattern 사용
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy.MM.dd");
        LocalDate localDate2 = LocalDate.parse("2015.10.22", pattern);

    }
}

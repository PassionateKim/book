package practice.ex.chapter10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

/**
 * localDate 객체 직접 생성하기 - 복습
 */
public class Chapter10_6 {
    public static void main(String[] args) {
        String day = "2001-01-01";
        Date birth = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            birth = sdf.parse(day);
        } catch (ParseException e) {}

        LocalDate birthDay = birth.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        LocalDate today = LocalDate.now();
        System.out.println("birthDay = " + birthDay);
        System.out.println("today = " + today);
        long differ = Math.abs((ChronoUnit.DAYS.between(birthDay, today)));
        System.out.println(differ + " days");

    }
}

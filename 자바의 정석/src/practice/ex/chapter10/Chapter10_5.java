package practice.ex.chapter10;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class Chapter10_5 {
    static int getDayDiff(String yyyymmdd1, String yyyymmdd2) {
        DateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        long diff = 0;
        try {
            Date date1 = sdf.parse(yyyymmdd1);
            Date date2 = sdf.parse(yyyymmdd2);
            LocalDate localDate1 = date1.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            LocalDate localDate2 = date2.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            diff = Math.abs(ChronoUnit.DAYS.between(localDate1, localDate2));

        } catch (ParseException e) {
            diff = 0;
        }
        return (int)diff;
    }

    public static void main(String[] args) {
        System.out.println(getDayDiff("20010103","20010101"));
        System.out.println(getDayDiff("20010103","20010103"));
        System.out.println(getDayDiff("20010103","200103"));

    }
}

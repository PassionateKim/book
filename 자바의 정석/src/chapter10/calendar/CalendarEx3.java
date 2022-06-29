package chapter10.calendar;

import java.util.Calendar;

/**
 * 시간 조작
 */
public class CalendarEx3 {
    public static void main(String[] args) {
        Calendar time = Calendar.getInstance();
        time.set(2022, Calendar.JUNE, 29); // 2022-06-29

        //1일 전
        time.add(Calendar.DATE, -1);
        System.out.println("1일 전 날짜: " + time.get(Calendar.YEAR) +"년 " + (time.get(Calendar.MONTH) + 1) + "월 " + time.get(Calendar.DATE) + "일 ");

        //1년 후
        time.add(Calendar.YEAR, 1);
        System.out.println("1년 후 날짜: " + time.get(Calendar.YEAR) +"년 " + (time.get(Calendar.MONTH)+1) + "월 " + time.get(Calendar.DATE) + "일 ");


    }
}

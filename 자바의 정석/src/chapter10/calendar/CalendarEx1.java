package chapter10.calendar;

import java.util.Calendar;

/**
 * Calendar 클래스 기본
 */
public class CalendarEx1 {
    public static void main(String[] args) {
        // default 는 현재 날짜와 시간으로 설정
        Calendar today = Calendar.getInstance();

        System.out.println("년도: " + today.get(Calendar.YEAR));
        System.out.println("월: " + (today.get(Calendar.MONTH)+1)); // 월은 0부터시작
        System.out.println("년도 기준 몇 째 주: " + today.get(Calendar.WEEK_OF_YEAR));
        System.out.println("요일: " + today.get(Calendar.DAY_OF_WEEK)); // 1: 일요일 ~ 7: 토요일
        System.out.println("이달의 몇 일: " + today.get(Calendar.DAY_OF_MONTH));
        System.out.println("이 년도의 몇 일: " + today.get(Calendar.DAY_OF_YEAR));
        System.out.println("시 분 초: " + today.get(Calendar.HOUR_OF_DAY) + "시 " + today.get(Calendar.MINUTE) + "분 " + today.get(Calendar.SECOND) + "초 ");
        System.out.println("이달의 마지막 날: " + today.getActualMaximum(Calendar.DATE) + "일까지");


    }
}

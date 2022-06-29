package chapter10.calendar;

import java.util.Calendar;

/**
 * 초 차이 ->  xx시 xx분 xx초 차이로 바꾸기
 */
public class CalendarEx2 {
    public static void main(String[] args) {
        final int[] TIME = {3600, 60, 1};
        final String[] TIME_NAME = {"시간 ", "분 ", "초 "};

        Calendar time1 = Calendar.getInstance();
        Calendar time2 = Calendar.getInstance();

        // 10시 20분 30초 설정
        time1.set(Calendar.HOUR_OF_DAY, 10);
        time1.set(Calendar.MINUTE, 20);
        time1.set(Calendar.SECOND, 30);

        // 20시 30분 10초로 설정
        time2.set(Calendar.HOUR_OF_DAY, 20);
        time2.set(Calendar.MINUTE, 30);
        time2.set(Calendar.SECOND, 10);


        // 밀리세컨 차이
        long differenceMills = (time2.getTimeInMillis() - time1.getTimeInMillis())/1000;
        System.out.println("millSecond 차이 = " + differenceMills + "초");

        //xx시 xx분 xx초 변환하기
        String a = "";

        for (int i = 0; i < TIME.length; i++) {
            a += differenceMills / TIME[i] + TIME_NAME[i];
            differenceMills = differenceMills % TIME[i];
        }
        System.out.println("변환 후: " + a);
    }
}

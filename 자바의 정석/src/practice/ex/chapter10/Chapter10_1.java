package practice.ex.chapter10;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Calendar클래스와 SimpleDateFormat클래스를 사용해서 2010년의 매월 두번 째 일요일의 날짜를 출력하시오.
 */
public class Chapter10_1 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2010, Calendar.JANUARY, 1); // cal 2010년 1월 1일 설정
        for (int i = 0; i < 12; i++) {
            int weekDay = calendar.get(Calendar.DAY_OF_WEEK); // 1일의 요일을 구한다.
            int secondSunday = (weekDay == 1) ? 8 : 16 - weekDay;

            // 두번 째 일요일로 cal의 날짜(DAY_OF_MONTH)를 바꾼다.
            calendar.set(Calendar.DAY_OF_MONTH, secondSunday);

            Date d = calendar.getTime();
            System.out.println(new SimpleDateFormat("yyyy-mm-dd은 F번째 E요일입니다. ").format(d));

            // 날짜를 다음달 1일로 변경한다.
            calendar.add(Calendar.MONTH, 1);
            calendar.set(Calendar.DAY_OF_MONTH, 1);
        }

    }
}

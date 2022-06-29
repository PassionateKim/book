package chapter10.format;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class SimpleFormatEx1 {
    public static void main(String[] args) {
        Date today = new Date();
        SimpleDateFormat sf1 = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(sf1.format(today));

        SimpleDateFormat sf2 = new SimpleDateFormat("''yy년 MM월 dd일 E요일");
        System.out.println(sf2.format(today));

        SimpleDateFormat sf3 = new SimpleDateFormat("오늘은 올 해의 D번째 날입니다.");
        System.out.println(sf3.format(today));

        // date 밖에 못쓰니 Calendar -> Date로 변환 후 사용해야한다.
        Calendar calendar = Calendar.getInstance();
        calendar.set(2022, 3, 29); // 6월임
        Date date = calendar.getTime(); // calendar -> date

        System.out.println(sf1.format(date));

        //SimpleFormat -> date 가능
        try {
            Date parse = sf1.parse("2011-10-15");
            System.out.println(parse);
        } catch (Exception e) {
        }

    }
}

package practice.ex.chapter10;

import chapter7.modifier.Ex;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Chapter10_4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
        DateFormat df2 = new SimpleDateFormat("입력하신 날짜는 E요일입니다.");

        Date inDate = null;

        do {
            System.out.println("날짜를 yyyy/MM/dd의 형태로 입력해주세요.(입력예:2007/05/11)");

            try {
                System.out.print(">>");
                String input = scanner.nextLine();
                inDate = df.parse(input);
                System.out.println(df2.format(inDate));
            } catch (Exception e) {}
        } while (true);
    }
}

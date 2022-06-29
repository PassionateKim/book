package chapter10.format;

import java.text.MessageFormat;
import java.util.Scanner;

public class MessageFormatEx1 {
    public static void main(String[] args) throws Exception {
        String tableName = "CUST_INFO";
        String fileName = "data.txt";
        // 원하는 출력 형태
        String msg = "INSERT_INTO " + tableName + " VALUES ({0},{1},{2},{3});";

        // 파싱할 형태
        String pattern = "{0},{1},{2},{3}"; // 스페이스 조심
        MessageFormat messageFormat = new MessageFormat(pattern); // pattern 모양이 하나라도 있어야..

        String line = "Hello I'd like to have some \"cake\",\"ramen\",\"dessert\",\"hamburger\"";
        try {
            Object[] objects = messageFormat.parse(line);
                System.out.println(MessageFormat.format(msg, objects));
        } catch (Exception e) {
            System.out.println("문자열에 parsing 할 수 있는 것이 하나도 없습니다.");
        }

    }
}

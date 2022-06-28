package chapter9.util.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 정규식
 */
public class RegexEx1 {
    public static void main(String[] args) {
        String[] data = {"aaa", "b", "d", "c", "ca", "cde"};

        Pattern pattern = Pattern.compile("c[a-z]*");
        for (String s : data) {
            Matcher matcher = pattern.matcher(s);
            if (matcher.matches()) {
                System.out.print(s+",");
            }
        }

    }
}

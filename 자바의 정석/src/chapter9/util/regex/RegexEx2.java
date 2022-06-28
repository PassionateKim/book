package chapter9.util.regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEx2 {
    public static void main(String[] args) {
        String source = "HP:011-1111-2222, HOME:02-999-9999";
        String pattern = "(0\\d{1,2})-(\\d{3,4})-(\\d{4})";

        Pattern p = Pattern.compile(pattern);
        Matcher matcher = p.matcher(source);

        int i = 0;
        while (matcher.find()) {
            System.out.println(++i+" : " + matcher.group() + " , " + matcher.group(1) + " , " + matcher.group(2) + " , " + matcher.group(3));
        }
    }
}

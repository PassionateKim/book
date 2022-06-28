package chapter9.string;

import java.util.Locale;

public class StringEx3 {

    public static void main(String[] args) {
        String test = "";

        //chatAt() - 지정된 위치에 있는 문자를 알려준다.
        test = "abcd";
        System.out.println(test.charAt(3));
        //index 3에 있는 d를 출력

        //compareTo - 파라미터로 들어온 문자열과 사전순서를 비교한다.
        test = "aaa";
        System.out.println(test.compareTo("bbb"));
        // a보다 사전 순으로 앞이므로- 1을 출력

        //concat - 문자열을 뒤에 덧붙인다.
        String tmp = "bbb";
        System.out.println(test.concat(tmp));
        // aaabbb

        //contains - 지정된 문자열이 포함되어 있는지 검사한다.
        test = "abcddd";
        System.out.println(test.contains("ab"));
        // ab를 포함하므로 true 출력

        //equals 생락

        //indexOf - 주어진 문자가 문자열에 존재하는지 확인하여
        // 그 위치를 반환한다. 없으면 -1 반환
        test = "aaa";
        System.out.println(test.indexOf("a"));
        // a가 여러 개면  가장 맨앞에 있는 것의 위치 출력

        //intern 생략

        //lastIndexOf - 지정된 문자 또는 문자열을
        // 문자열의 오른쪽 끝에서부터 찾아 위치를 반환한다. 없으면 -1 반환
        test = "aaa";
        System.out.println(test.lastIndexOf("a"));
        // 2

        //length - 문자열의 길이 반환
        test = "aaa";
        System.out.println(test.length());
        // 3

        //replace - 특정 문자를 모두 새로운 문자로 변경
        test = "abc";
        System.out.println(test.replace("a","c"));
        // "abc" -> "cbc"

        //split - 문자열을 기준에 맞춰 분리
        test = "a,b,c";
        String[] arr = test.split(",");
        System.out.println(arr[0] + arr[1] + arr[2]);
        //arr = {a,b,c}

        //substring - 파라미터로 들어온 index 사이의 문자열 추출
        test = "aaabbbccc";
        System.out.println(test.substring(3,6));
        // 3에서 시작하여 6 전까지 출력 3,4,5
        //bbb

        //toLowerCase - 소문자로 변환
        test = "ABC";
        System.out.println(test.toLowerCase(Locale.ROOT));
        //abc

        //trim - 좌우 공백 제거
        test = " a ";
        System.out.println(test.trim());

        //valueOf - 파라미터를 String으로 변환해 반환
        int a = 35;
        System.out.println(String.valueOf(a));
        // String 형의 a 출력

    }
}

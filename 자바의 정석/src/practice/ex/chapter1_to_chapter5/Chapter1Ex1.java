package practice.ex.chapter1_to_chapter5;

/**
 * chapter1
 */
public class Chapter1Ex1 {
    public static void main(String[] args) {
        int num = 10;
        System.out.println(num == 0 ? 0 : num > 0 ? "양수" : "음수");

        int tmp = 81;
        System.out.println(10 - tmp % 10);

        int fahrenheit = 100;
        float c = (int)((5/9f) * (fahrenheit - 32) * 100 + 0.5)/100f;
        System.out.println("c = " + c);

        float f = 3/2f;
        System.out.println("f = " + f);

        char ch = 'A' + 2;
        char ch2 = (char) (ch + 32); // 형변환 안하면 에러남

        System.out.println('A' + 2);//67
        System.out.println("ch = " + ch);//C
        System.out.println(ch + 32); //99
        System.out.println(++ch);//D
        char lowerCase = ('A' <= ch && ch <= 'Z') ? (char) (ch + 32) : ch;
    }
}

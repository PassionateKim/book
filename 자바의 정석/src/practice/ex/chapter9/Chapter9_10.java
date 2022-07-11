package practice.ex.chapter9;

public class Chapter9_10 {
    static String format(String str, int length, int alignment) {
        // 1. length의 길이가 str의 길이보다 작으면
        if (length < str.length()) {
            return str.substring(0, length);
        }
        // 2. 공백으로 채운다.
        char[] tmp = new char[length];
        for (int i = 0; i < tmp.length ; i++) {
            tmp[i] = ' ';
        }
        // 3. 정렬조건
        if (alignment == 0) {
            System.arraycopy(str.toCharArray(),0,tmp,0,str.length());
        } else if (alignment == 1) {
            System.arraycopy(str.toCharArray(), 0, tmp, (length - str.length())/2, str.length());
        } else {
            System.arraycopy(str.toCharArray(), 0, tmp, length - str.length(), str.length());
        }
        return new String(tmp);
    }
    public static void main(String[] args) {
        String str = "가나다";

        System.out.println(format(str, 7, 0)); // 왼쪽 정렬
        System.out.println(format(str, 7, 1)); // 가운데 정렬
        System.out.println(format(str, 7, 2)); // 오른쪽 정렬
    }
}

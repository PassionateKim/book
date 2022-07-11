package practice.ex.chapter9;

public class Chapter9_6 {
    static String fillZero(String src, int length) {
        if (src == null || src.length() == length) {
            return src;
        } else if (length <= 0) {
            return "";
        } else if (src.length() > length) {
            return src.substring(0, length);
        }

        char[] tmp = new char[length];
        for (int i = 0; i < length; i++) {
            tmp[i] = '0';
        }
        System.arraycopy(src.toCharArray(), 0, tmp, length - src.length(), src.length());
        return new String(tmp);
    }

    public static void main(String[] args) {
        String src = "12345";

        System.out.println(fillZero(src, 10));
        System.out.println(fillZero(src, -1));
        System.out.println(fillZero(src, 3));
    }
}

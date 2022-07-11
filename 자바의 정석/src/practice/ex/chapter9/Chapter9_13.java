package practice.ex.chapter9;

public class Chapter9_13 {
    public static void main(String[] args) {
        String src = "aabbccAABBCCaa";
        System.out.println(src);
        System.out.println("aa를 " + stringCount(src, "aa") + "개 찾았습니다.");
    }

    static int stringCount(String src, String key) {
        return stringCount(src, key, 0);
    }

    private static int stringCount(String src, String key, int pos) {
        int count = 0;
        int index = 0;

        if (key == null || key.length() == 0) {
            return 0;
        }

        index = pos; // pos 초기화된 위치에서 시작
        while (true) {
            int tmp = src.indexOf(key, index);
            if (tmp == -1) {
                break;
            }
            count++;
            index += (tmp + key.length());
        }

        return count;
    }
}

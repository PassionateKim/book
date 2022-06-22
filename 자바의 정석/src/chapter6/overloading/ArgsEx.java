package chapter6.overloading;

public class ArgsEx {
    public static void main(String[] args) {
        String[] strArr = {"A", "B", "C"};

        System.out.println(concatenate("",strArr));
        //ABC
        System.out.println(concatenate("-",strArr));
        //A-B-C-

        System.out.println(concatenate("-", "A","B"));
        //A-B-
        System.out.println(concatenate("-", new String[]{"A", "B"}));
    }

    static String concatenate(String delim, String... str) {
        String result = "";
        for (String s : str) {
            result += s + delim;
        }
        return result;
    }
}

package practice.ex.chapter9;

public class Chapter9_3 {
    public static void main(String[] args) {
        String fullPath = "C:\\jdk1.8\\work\\PathSeparateTest.java";
        String path = "";
        String fileName = "";

        int idx = fullPath.lastIndexOf("\\");

        path = fullPath.substring(0, idx);
        fileName = fullPath.substring(idx + 1);
        System.out.println("fullPath = " + fullPath);
        System.out.println("path = " + path);
        System.out.println("fileName = " + fileName);
    }
}

package chapter8;

import java.io.File;

public class ExceptionEx5 {
    public static void main(String[] args) {
        try {
            File file = createFile("");
            System.out.println(file.getName() + " 파일이 성공적으로 생성되었습니다."); // Exception이면 코드 안 읽힘
        } catch (Exception e) {
            System.out.println(e.getMessage() + " 다시 입력해주세요");
        }

        try {
            File file = createFile("text.txt");
            System.out.println(file.getName() + " 파일이 성공적으로 생성되었습니다."); // Exception이면 코드 안 읽힘
        } catch (Exception e) {
            System.out.println(e.getMessage() + " 다시 입력해주세요");
        }
    }
    static File createFile(String fileName) throws Exception {
        if (fileName == null || fileName.equals("")) {
            throw new Exception("파일 이름이 유효하지 않습니다.");
        }
        File file = new File(fileName);
        file.createNewFile();
        return file;
    }
}

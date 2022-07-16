package practice.ex.chapter13;

import java.util.Scanner;
import java.util.Vector;

public class Chapter13_8 {

    Vector<String> words = new Vector<>();
    String[] data = {"태연", "유리", "윤아", "효연", "수영", "서현", "티파니", "써니", "제시카"};
    int interval = 2 * 1000; // 2초

    WordGenerator wg = new WordGenerator();

    public static void main(String[] args) {
        Chapter13_8 game = new Chapter13_8();
        game.wg.start();

        Vector<String> words = game.words;
        while (true) {
            System.out.println(words);

            String prompt = ">>";
            System.out.print(prompt);

            // 화면으로부터 라인 단위로 입력받는다.
            Scanner s = new Scanner(System.in);
            String input = s.nextLine().trim();

            int index = words.indexOf(input);

            if (index != -1) {
                words.remove(index);
            }
        }
    }

    class WordGenerator extends Thread {
        public void run() {
            while (true) {
                int rand = (int) (Math.random() * data.length);
                words.add(data[rand]);

                try {
                    Thread.sleep(2000); // 2초 동안 쉰다.
                } catch (Exception e) {}
            }
        }//run()
    }//WordGenerator
}



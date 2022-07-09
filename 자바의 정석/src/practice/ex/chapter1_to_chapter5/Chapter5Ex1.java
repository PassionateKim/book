package practice.ex.chapter1_to_chapter5;

import java.util.Scanner;

/**
 * chapter5
 */
public class Chapter5Ex1 {
    public static void main(String[] args) {
        int input = 3510;
        int[] coinUnit = {500, 100, 50, 10};
        int[] coin = {5, 5, 5, 5};

        for (int i = 0; i < coinUnit.length; i++) {
            int coinNum = 0;

            coinNum = input / coinUnit[i]; //6
            if (coinNum > coin[i]) {
                coinNum = coin[i];
                coin[i] = 0;
            } else {
                coin[i] = coin[i] - coinNum;
            }
            input = input - (coinUnit[i] * coinNum);
            System.out.println(coinUnit[i] + "원: " + coinNum);
        }
        if (input > 0) {
            System.out.println("거스름 돈이 부족합니다.");

        }
        System.out.println("-남은 동전의 개수-");
        for (int i = 0; i < coinUnit.length; i++) {
            System.out.println(coinUnit[i] + "원:" + coin[i]);
        }

        //[5-8]
        int[] answer = {1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2};

        int[] counter = new int[4];
        for (int i = 0; i < answer.length; i++) {
            counter[answer[i]-1]++;
        }
        for (int i = 0; i < counter.length;i++) {
            System.out.print(counter[i]);
            for (int j = 0; j < counter[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }//end

        //[5-9]
        char[][] star = {
                {'*','*',' ',' ',' '},
                {'*','*',' ',' ',' '},
                {'*','*','*','*','*'},
                {'*','*','*','*','*'}
        };

        char[][] result = new char[star[0].length][star.length];
        for (int i = 0; i < star.length; i++) {
            for (int j = 0; j < star[i].length; j++) {
                System.out.print(star[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < star.length; i++) {
            for (int j = 0; j < star[i].length; j++) {
                result[j][star.length-1 - i] = star[i][j];
            }
        }

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j]);
            }
            System.out.println();
        }//end

        int[][] score = {
                {100,100,100},
                {20,20,20},
                {30,30,30},
                {40,40,40},
                {50,50,50}
        };

        int[][] result2 = new int[score.length + 1][score[0].length + 1];

        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
               result2[i][j] = score[i][j];
               result2[i][score.length] += score[i][j];
               result2[score.length][j] += score[i][j];
               result2[score.length][score.length] += score[i][j];
            }
        }

        for (int i = 0; i < result2.length; i++) {
            for (int j = 0; j < result2[i].length; j++) {
                System.out.printf("%4d", result2[i][j]);
            }
            System.out.println();
        }//end

        //[5-13]
        String[] words = {"television", "computer", "mouse", "phone"};
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < words.length; i++) {
            char[] question = words[i].toCharArray();

            for (int j = 0; j < question.length; j++) {
                int randomNum = (int)(Math.random() * question.length);
                char tmp = question[j];
                question[j] = question[randomNum];
                question[randomNum] = tmp;
            }//for
            System.out.printf("Q%d. %s의 정답을 입력하세요.>", i + 1, new String(question));
            String answer1 = scanner.nextLine();
            if (words[i].equals(answer1.trim())) {
                System.out.println("맞았습니다.");
            } else {
                System.out.printf("틀렸습니다.");
            }
        }

    }//main
}//class

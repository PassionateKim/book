package chapter10.format;

import java.text.ChoiceFormat;

public class ChoiceFormatEx1 {
    public static void main(String[] args) {
        // 낮은 값부터 적기 - 경계값 포함
        double[] standard = {70, 80, 90};
        String[] grades = {"C", "B", "A"};

        int[] score = {90, 10, 80, 88, 91};

        ChoiceFormat choiceFormat = new ChoiceFormat(standard, grades);
        for (int i = 0; i < score.length; i++) {
            System.out.println(score[i] +" : " + choiceFormat.format(score[i]));
        }
        System.out.println();
        // 한번에 하기 - 경계값 포함
        String pattern = "70#C|80#B|90#A";
        ChoiceFormat choiceFormat2 = new ChoiceFormat(pattern);
        for (int i = 0; i < score.length; i++) {
            System.out.println(score[i] + " : " + choiceFormat2.format(score[i]));
        }
        System.out.println();
        // 한번에 하기 - 경계값 미포함
        String pattern2 = "70<C|80<B|90<A";
        ChoiceFormat choiceFormat3 = new ChoiceFormat(pattern2);
        for (int i = 0; i < score.length; i++) {
            System.out.println(score[i] + " : " + choiceFormat3.format(score[i]));
        }
    }
}

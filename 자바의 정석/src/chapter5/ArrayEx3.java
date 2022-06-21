package chapter5;

public class ArrayEx3 {
    public static void main(String[] args) {
        int[] number = {1,2,3,4,5};
        // 2배 크기의 배열 만들기
        int[] number2 = new int[number.length];

        for (int i = 0; i < number.length; i++) {
            number2[i] = number[i];
        }
        number = number2; // 새로운 number2 배열이 기존의 number를 가리키게 한다.
    }
}

package chapter6;

public class MethodEx {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = calculator.returnAdd(3, 5);
        System.out.println("result = " + result);
    }
}

class Calculator {
    // 메서드
    int returnAdd (int x, int y){
        int answer = x + y;
        return answer;
    }

    void returnNone() {
        return;
    }
}

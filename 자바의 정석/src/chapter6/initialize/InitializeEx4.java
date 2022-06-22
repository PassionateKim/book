package chapter6.initialize;

public class InitializeEx4 {
    public static void main(String[] args) {
        int[] arr = StaticBlock.arr;
        for (int i=0;i<arr.length;i++) {
            System.out.println("arr["+i+"] : " + arr[i]);
        }
    }
}

class StaticBlock {
    static int[] arr = new int[10];

    // 클래스 초기화 블럭
    static {
        for (int i=0;i<arr.length;i++) {
            arr[i] = (int) (Math.random() * 10) + 1;
        }
    }
}

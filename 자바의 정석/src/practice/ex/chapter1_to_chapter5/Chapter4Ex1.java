package practice.ex.chapter1_to_chapter5;

/**
 * chapter4
 */
public class Chapter4Ex1 {
    public static void main(String[] args) {
        int sum = 0;
        int tmp = 1;

        while (true) {
            sum += tmp;
            // 탈출
            if (sum >= 100) {
                System.out.println(tmp);
                break;
            }

            if (tmp > 0) {
                tmp += 1;
            } else {
                tmp -= 1;
            }
            tmp = -tmp;
        }
        //[4-5]
        int i = 0;
        while (i <= 10) {
            int j = 0;
            while (j <= i) {
                System.out.print("*");
                ++j;
            }
            System.out.println();
            ++i;
        }

        //[4-6]
        for (int z = 1; z <= 6; z++) {
            for (int k = 1; k <= 6; k++) {
                if (z + k == 6) {
                    System.out.println(z + "+" + k + "=6");
                }
            }
        }//end

        //[4-8]
        for (int x = 0; x <= 10; x++) {
            for (int y = 0; y <= 10; y++) {
                if (2 * x + 4 * y == 10) {
                    System.out.println("x: " + x + " y: " + y);
                }
            }
        }//end

        //[4-9]
        String str = "12345";
        int sum2 = 0;
        for (int q = 0; q < str.length(); q++) {
            sum2 += str.charAt(q) - '0';
        }
        System.out.println(sum2);

        //[4-10]
        int num = 12345;
        sum = 0;
        while (num > 0) {
            sum += num % 10;
            num = num / 10;
        }
        System.out.println("sum = " + sum);

        //[4-12]
        for (i = 1; i <= 9; i++) {
            for (int j = 1; j <= 3; j++) {
                int x = (j+1) + (i-1)/3*3;
                int y = i % 3 == 0 ? 3 : i % 3;
                if (x >= 10) {
                    break;
                }
                System.out.print(x +"*" + y + "=" + x*y + "\t");
            }
            System.out.println();
            if (i % 3 == 0) {
                System.out.println();
            }
        }//end

        //[4-13]
        String value = "12o34";
        char ch = ' ';
        boolean isNumber = true;

        // 반복문과 charAt(int i)를 이용해 문자열의 문자를
        // 하나씩 읽어서 검사한다.
        for (i = 0; i < value.length(); i++) {
            if ('0' <= value.charAt(i) && value.charAt(i) <= '9') {

            } else {
                isNumber = false;
            }
        }

        if (isNumber) {
            System.out.println("숫자입니다");
        } else {
            System.out.println("숫자가 아닙니다.");
        }//end

        //[4-14]
//        int answer = (int) (Math.random() * 100) + 1;
//        int input = 0;
//        int count = 0;
//
//        Scanner scanner = new Scanner(System.in);
//        while (true) {
//            count += 1;
//            System.out.println("1과 100사이의 값을 입력하세요!");
//            input = scanner.nextInt();
//
//            if (input == answer) {
//                System.out.println("맞췄습니다");
//                System.out.println("시도횟수는 " + count + "번입니다.");
//                break;
//            } else if (input > answer) {
//                System.out.println("더 작은 수를 입력하세요.");
//            } else {
//                System.out.println("더 큰 수를 입력하세요.");
//            }
//        }//end

        //[4-15]
        int number = 121321;
        tmp = number;

        int result = 0; // 변수 number를 거꾸로 담을 변수

        while (tmp != 0) {
            result = result * 10 + tmp % 10;
            tmp /= 10;
        }
        if (number == result) {
            System.out.println(number + "는 회문수 입니다.");
        } else {
            System.out.println(number + "는 회문수가 아닙니다.");
        }

    }//main
}//class

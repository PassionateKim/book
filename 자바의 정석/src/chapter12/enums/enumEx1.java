package chapter12.enums;

public class enumEx1 {
    public static void main(String[] args) {
        FoodEnum.Fruit e1 = FoodEnum.Fruit.APPLE;
        FoodEnum.Fruit e2 = FoodEnum.Fruit.APPLE;
        FoodEnum.Fruit e3 = FoodEnum.Fruit.BANANA;

        // 비교하기
        System.out.println("e1==e2 = " + (e1==e2));
        System.out.println("e1==e2 = " + (e1==e3));

        System.out.println("e1.compareTo(e3) = " + e1.compareTo(e3));


        FoodEnum.Fruit[] values = FoodEnum.Fruit.values();
        for (FoodEnum.Fruit value : values) {
            System.out.println("value.val, value.name() = " + value.val + ", " + value.name());
        }

        System.out.println("할인된 가격: " + FoodEnum.Fruit.APPLE.price(1000));
        System.out.println("할인된 가격: " + FoodEnum.Fruit.BANANA.price(0));
        System.out.println("할인된 가격: " + FoodEnum.Fruit.CHEERY.price(500));

    }
}

class FoodEnum {
    enum Fruit {
        APPLE(3000){
            // 추상 메서드 구현
            int price(int sale) {
                return val - sale;
            }
        },
        BANANA(4000){
            // 추상 메서드 구현
            int price(int sale) {
                return val - sale;
            }

        },
        CHEERY(1000){
            // 추상 메서드 구현
            int price(int sale) {
                return val - sale;
            }
        };

        final int val;

        Fruit(int val) {
            this.val = val;
        }

        // 추상 메서드
        abstract int price(int sale);
    }
}

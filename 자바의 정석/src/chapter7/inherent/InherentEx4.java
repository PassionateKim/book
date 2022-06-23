package chapter7.inherent;

public class InherentEx4 {
    public static void main(String[] args) {
        DriedRamen driedRamen = new DriedRamen();
        driedRamen.print();
    }
}

class Ramen {
    int calorie = 540;
}

class DriedRamen extends Ramen {
    int calorie = 340; // 건면은 칼로리 340

    void print() {
        System.out.println("this.calorie = " + this.calorie);
        // this.calorie = 340
        System.out.println("super.calorie = " + super.calorie);
        // super.calorie = 540
    }
}


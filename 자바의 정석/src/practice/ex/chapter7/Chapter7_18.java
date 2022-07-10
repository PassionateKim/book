package practice.ex.chapter7;

public class Chapter7_18 {
    static void action(Robot robot) {
        if (robot instanceof DanceRobot) {
            ((DanceRobot) robot).dance();
        } else if (robot instanceof SingleRobot) {
            ((SingleRobot) robot).sing();
        } else if(robot instanceof DrawRobot){
            ((DrawRobot) robot).draw();
        }
    }

    public static void main(String[] args) {
        Robot[] arr = {new DanceRobot(), new SingleRobot(), new DrawRobot()};
        for (int i = 0; i < arr.length; i++) {
            action(arr[i]);
        }
    }//main
}

class Robot {}

class DanceRobot extends Robot {
    void dance() {
        System.out.println("춤을 춥니다.");
    }
}

class SingleRobot extends Robot {
    void sing() {
        System.out.println("노래를 합니다.");
    }
}

class DrawRobot extends Robot {
    void draw() {
        System.out.println("그림을 그립니다.");
    }
}
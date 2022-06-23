package chapter7.inherent.publicex;

public class Time {
    // 멤버 변수에 public 접근 제어자가 있어 다른 어떤 곳에서든 접근이 가능함.
    private int hour;
    private int minute;

    //메서드는 외부에서 값을 넣을 수 있도록 열어둔다
    public void setHour(int hour) {
        if (!(0 <= hour && hour <= 24)) {
            System.out.println("0에서 24범위의 수만 입력해주세요");
            return;
        }
        this.hour = hour;
    }
    public void setMinute(int minute) {
        if (!(0 <= minute && minute <= 60)) {
            System.out.println("0에서 60범위의 수만 입력해주세요");
            return;
        }
        this.minute = minute;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }
}


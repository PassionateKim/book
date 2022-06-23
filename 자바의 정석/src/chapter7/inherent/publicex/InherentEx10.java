package chapter7.inherent.publicex;

public class InherentEx10 {
    public static void main(String[] args) {
        Time time = new Time();
        // 메서드로 우회해서 값을 넣거나 얻어올 수 있다.
        time.setHour(25);
        //0에서 24범위의 수만 입력해주세요
        time.setHour(24); //
        System.out.println("time.hour = " + time.getHour());

        time.setMinute(70);
        //0에서 60범위의 수만 입력해주세요
        time.setMinute(55);
        System.out.println("time.getMinute() = " + time.getMinute());
    }
}


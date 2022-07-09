package practice.ex.chapter6;

public class Chapter6_2 {
    public static void main(String[] args) {
        Student s = new Student("홍길동",1,1,100,60,76);

        System.out.println("이름:" + s.name);
        System.out.println("총점:" + s.getTotal());
        System.out.println("평균:" + s.getAverage());
        System.out.println(s.info());
    }
}

class Student {
    String name; // 학생이름
    int ban; // 반
    int no; // 번호
    int kor; // 국어점수
    int eng; // 영어점수
    int math; // 수학점수

    public Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public int getTotal() {
        return kor + eng + math;
    }

    public float getAverage() {
        float tmp = (kor + eng + math) / (float)(3);
        tmp = (int)((tmp * 10) + 0.5) / 10.0f;
        return tmp;
    }
    public String info() {
        return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," + getTotal() + "," + getAverage();
    }
}

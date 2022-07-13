package practice.ex.chapter11;

import java.util.*;

public class Chapter11_6 {
    static int getGroupCount(TreeSet tset, int from, int to) {
        Student2 s1 = new Student2("", 0, 0, from, from, from);
        Student2 s2 = new Student2("", 0, 0, to, to, to);

        return tset.subSet(s1, s2).size();
    }
    public static void main(String[] args) {
        TreeSet<Student2> set = new TreeSet<Student2>(new Comparator<Student2>() {
            @Override // 평균으로 set에 넣을지 말지 비교한다.
            public int compare(Student2 o1, Student2 o2) {
                return (int)(o1.getAverage() - o2.getAverage());
            }
        });

        set.add(new Student2("홍길동", 1, 1, 100, 100, 100));
        set.add(new Student2("남궁성", 1, 2, 90, 70, 80));
        set.add(new Student2("김자바", 1, 3, 80, 80, 90));
        set.add(new Student2("이자바", 1, 1, 70, 90, 70));
        set.add(new Student2("안자바", 1, 5, 60, 100, 80));

        Iterator<Student2> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("[60~69] :" + getGroupCount(set, 60, 70));
        System.out.println("[70~79] :" + getGroupCount(set, 70, 80));
        System.out.println("[80~89] :" + getGroupCount(set, 80, 90));
        System.out.println("[90~100] :" + getGroupCount(set, 90, 101));


    }//main
}

class Student2{
    String name;
    int ban;
    int no;
    int kor, eng, math;

    public Student2(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    int getTotal() {
        return kor + eng + math;
    }

    float getAverage() {
        return (int) ((getTotal() / 3f) * 10 + 0.5) / 10f;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", ban=" + ban +
                ", no=" + no +
                ", kor=" + kor +
                ", eng=" + eng +
                ", math=" + math +
                ", 총점" + getTotal() + ", 평균" + getAverage()+"}";
    }

}

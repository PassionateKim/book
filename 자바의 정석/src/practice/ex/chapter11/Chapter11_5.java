package practice.ex.chapter11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Chapter11_5 {
    public static void main(String[] args) {
        ArrayList<student> list = new ArrayList<>();
        list.add(new student("홍길동", 1, 1, 100, 100, 100));
        list.add(new student("남궁성", 1, 2, 90, 70, 80));
        list.add(new student("김자바", 1, 3, 80, 80, 90));
        list.add(new student("이자바", 1, 1, 100, 100, 70));
        list.add(new student("안자바", 1, 5, 60, 100, 80));

        Collections.sort(list);

        Iterator<student> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }//main
}

class student implements Comparable{
    String name;
    int ban;
    int no;
    int kor, eng, math;

    public student(String name, int ban, int no, int kor, int eng, int math) {
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

    @Override
    public int compareTo(Object o) {
        student tmp = (student) o;
        return name.compareTo(tmp.name);
    }
}


package practice.ex.chapter11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Chapter11_8 {
    public static void calculateSchoolRank(List<Student3> list) {
        Collections.sort(list);

        int prevRank = -1; // 이전 전교등수
        int prevTotal = -1; // 이전 총점
        int length = list.size();

        for (int i = 0; i < length; i++) {
            // 1. 반복문을 이용해서 list에 저장된 Student 객체를 하나씩 읽는다.
            Student3 student3 = list.get(i);


            if (student3.total == prevTotal) {
                student3.schoolRank = prevRank;
            } else { // 총점이 서로 다르면
                student3.schoolRank = i+1;
            }
            // 1.3 총점과 등수를 이전총점과 이전 등수에 저장한다.
//            prevRank += 1;
            prevRank = student3.schoolRank;
            prevTotal = student3.total;
        }//for
        for (Student3 student3 : list) {
            System.out.println("student3 = " + student3);
        }
    }

    public static void main(String[] args) {
        ArrayList<Student3> list = new ArrayList<Student3>();
        list.add(new Student3("이자바", 2, 1, 70, 90, 70));
        list.add(new Student3("안자바", 2, 2, 60, 100, 80));
        list.add(new Student3("홍길동", 1, 3, 100, 100, 100));
        list.add(new Student3("남궁성", 1, 1, 90, 70, 80));
        list.add(new Student3("김자바", 1, 2, 80, 80, 90));

        calculateSchoolRank(list);
    }
}
class Student3 implements Comparable<Student3>{
    String name;
    int ban;
    int no;
    int kor, eng, math;

    int total; // 총점
    int schoolRank; // 전교 등수

    public Student3(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        
        total = kor + eng + math;
    }

    int getTotal() {
        return total;
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
                ", 총점 " + getTotal() + 
                ", 평균 " + getAverage()+
                ", 등수 " + schoolRank + "}";
    }

    @Override
    public int compareTo(Student3 o) {
        int diff = getTotal() - o.getTotal();
        return diff * (-1);
    }
}

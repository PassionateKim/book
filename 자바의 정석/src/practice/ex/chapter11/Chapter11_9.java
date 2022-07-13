package practice.ex.chapter11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Chapter11_9 {
    public static void calculateClassRank(List<Student4> list) {
        // . 먼저 반별 총점기준 내림차순으로 정렬한다
        Collections.sort(list, new ClassTotalComparator());
        int prevBan = -1;
        int prevRank = -1;
        int prevTotal = -1;
        int length = list.size();
        for(int i=0, n=0; i < length; i++, n++) {
            // 1. list Student4 . 반복문을 이용해서 에 저장된 객체를 하나씩 읽는다
            Student4 s = (Student4)list.get(i);
            // 1.1 ,(ban prevBan ) 반이 달라지면 와 이 다르면
            // 이전 등수 와 이전 총점 을 초기화 한다 (prevRank) (prevTotal) .
            if(s.ban!=prevBan) {
                prevRank = -1;
                prevTotal = -1;
                n = 0;
            }
            // 1.2 (total) (prevTotal) 총점 이 이전총점 과 같으면
            // (prevRank) (classRank) . 이전 등수 를 등수 로 한다
            if(s.total==prevTotal) {
                s.classRank = prevRank;
            } else {
            // 1.3 , 총점이 서로 다르면
            // (classRank) . 등수 의 값을 알맞게 계산해서 저장한다
            // , . 이전에 동점자였다면 그 다음 등수는 동점자의 수를 고려해야한다
                s.classRank = n + 1;
            }
            // 1.4 (prevBan), 현재 반과 총점과 등수를 이전 반
            // (prevTotal), (prevRank) . 이전 총점 이전 등수 에 저장한다
            prevBan = s.ban;
            prevRank = s.classRank;
            prevTotal = s.total;
        }
    } // public static void calculateClassRank(List list)
    public static void calculateSchoolRank(List<Student4> list) {
        Collections.sort(list); // list . 먼저 를 총점기준 내림차순으로 정렬한다
        int prevRank = -1; // 이전 전교등수
        int prevTotal = -1; // 이전 총점
        int length = list.size();
        for(int i=0;i < length; i++) {
            Student4 s = (Student4)list.get(i);
            if(s.total==prevTotal) {
                s.schoolRank = prevRank;
            } else {
                s.schoolRank = i + 1;
            }
            prevRank = s.schoolRank;
            prevTotal = s.total;
        } // for
    }

    public static void main(String[] args) {
        ArrayList<Student4> list = new ArrayList<Student4>();
        list.add(new Student4("이자바", 2, 1, 70, 90, 70));
        list.add(new Student4("안자바", 2, 2, 60, 100, 80));
        list.add(new Student4("홍길동", 1, 3, 100, 100, 100));
        list.add(new Student4("남궁성", 1, 1, 90, 70, 80));
        list.add(new Student4("김자바", 1, 2, 80, 80, 90));

        calculateSchoolRank(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("-------------------");
        calculateClassRank(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
class Student4 implements Comparable<Student4>{
    String name;
    int ban;
    int no;
    int kor, eng, math;

    int total; // 총점
    int schoolRank; // 전교 등수
    int classRank; // 반 등수

    public Student4(String name, int ban, int no, int kor, int eng, int math) {
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
        return "Student4{" +
                "name='" + name + '\'' +
                ", ban=" + ban +
                ", no=" + no +
                ", kor=" + kor +
                ", eng=" + eng +
                ", math=" + math +
                ", 총점 " + getTotal() +
                ", 평균 " + getAverage() +
                ", 전교 등수 " + schoolRank +
                ", 반 등수 " + classRank + "}";
    }

    @Override
    public int compareTo(Student4 o) {
        int diff = getTotal() - o.getTotal();
        return diff * (-1);
    }
}//end
// 음수 -> 오름차순
class ClassTotalComparator implements Comparator<Student4> {
    @Override
    public int compare(Student4 o1, Student4 o2) {

        int result = o1.ban - o2.ban; // 오름차순
        if (result == 0) {
            result = o2.getTotal() - o1.getTotal(); // 내림차순
        }

        return result ;
    }
}

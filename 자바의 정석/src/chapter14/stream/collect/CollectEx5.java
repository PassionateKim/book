package chapter14.stream.collect;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

/**
 * groupingBy()
 */
public class CollectEx5 {
    public static void main(String[] args) {
        Student[] studentArr = {
                new Student("김수박", 1, 5, 100),
                new Student("최수박", 1, 1, 200),
                new Student("이수박", 1, 2, 300),
                new Student("명수박", 2, 3, 400),
                new Student("맹수박", 2, 6, 50),
                new Student("시수박", 2, 1, 250),
                new Student("계수박", 3, 2, 350),
                new Student("남궁수박", 3, 3, 450)
        };


        System.out.println("--단순하게 학년 별로 그룹화 하기--");
        Stream<Student> stream1 = Stream.of(studentArr);
        Map<Integer, List<Student>> stuByYear = stream1.collect(groupingBy((Student s) -> s.getYear()));
        for (Integer key : stuByYear.keySet()) {
            System.out.println(key + "학년: " + stuByYear.get(key));
        }//끝

        System.out.println();
        System.out.println("--성적별로 그룹화 하기--");
        Stream<Student> stream2 = Stream.of(studentArr);
        Map<Student.Level, List<Student>> stuByLevel = stream2.collect(groupingBy((Student s) -> {
            if (s.getScore() >= 200)      return Student.Level.HIGH;
            else if (s.getScore() >= 100) return Student.Level.MID;
            else                          return Student.Level.LOW;
        }));

        for (Student.Level key : stuByLevel.keySet()) {
            System.out.println("[" + key + "]");
            for (Student s : stuByLevel.get(key)) {
                System.out.println("학생 = " + s);
            }
            System.out.println();
        }//끝

        System.out.println();
        System.out.println("--다중 그룹화 하기 학년 && 반--");
        Stream<Student> stream3 = Stream.of(studentArr);
        Map<Integer, Map<Integer, List<Student>>> stuByYearClassNum = stream3.collect(groupingBy(s->s.getYear(), groupingBy(s->s.getClassNum())));

        for (Integer year : stuByYearClassNum.keySet()) {
            System.out.println("[" + year + "학년" + "]");

            Map<Integer, List<Student>> integerListMap = stuByYearClassNum.get(year);

            for (Integer classNum : integerListMap.keySet()) {
                System.out.println(classNum + "반 " + integerListMap.get(classNum));
            }
            System.out.println();
        }
    }
}

class Student {
    String name;
    int year; // 학년
    int classNum; // 반
    int score; // 점수

    public Student(String name, int year, int classNum, int score) {
        this.name = name;
        this.year = year;
        this.classNum = classNum;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public int getClassNum() {
        return classNum;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", classNum=" + classNum +
                ", score=" + score +
                '}';
    }

    enum Level {HIGH, MID, LOW}
}
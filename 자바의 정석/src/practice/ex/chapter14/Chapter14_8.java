package practice.ex.chapter14;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class Chapter14_8 {
    public static void main(String[] args) {
        Student[] stuArr = {
                new Student("나자바", true, 1, 1, 300),
                new Student("김지미", false, 1, 1, 250),
                new Student("김자바", true, 1, 1, 200),
                new Student("이지미", false, 1, 2, 150),
                new Student("남자바", true, 1, 2, 100),
                new Student("안지미", false, 1, 2, 50),
                new Student("황지미", false, 1, 3, 100),
                new Student("강지미", false, 1, 3, 150),
                new Student("이자바", true, 1, 3, 200),

                new Student("나자바", true, 2, 1, 300),
                new Student("김지미", false, 2, 1, 250),
                new Student("김자바", true, 2, 1, 200),
                new Student("이지미", false, 2, 2, 150),
                new Student("남자바", true, 2, 2, 100),
                new Student("안지미", false, 2, 2, 50),
                new Student("황지미", false, 2, 3, 100),
                new Student("강지미", false, 2, 3, 150),
                new Student("이자바", true, 2, 3, 200)
        };


        Stream<Student> stream = Stream.of(stuArr);
        Map<Boolean, Map<Boolean, Long>> failedStudBySex = stream.collect
                                                                    (groupingBy((Student s) -> s.isMale,
                                                                    groupingBy((Student s) -> s.getSCore() < 150, counting())));
        Long failedMaleStuNum = failedStudBySex.get(true).get(true);
        Long failedFemaleStuNum = failedStudBySex.get(false).get(true);
        System.out.println("불합격[남자]: " + failedMaleStuNum + "명");
        System.out.println("불합격[여자]: " + failedFemaleStuNum + "명");


        //[14-9]
        Stream<Student> stream2 = Stream.of(stuArr);
        Map<Integer, Map<Integer, Integer>> ss = stream2.collect(groupingBy(s -> s.hak,
                groupingBy((Student s) -> s.ban, summingInt(s -> s.getSCore())
                )));

        for (Map.Entry<Integer, Map<Integer, Integer>> e : ss.entrySet()) {
            System.out.println(e);
        }
    }

}

class Student {
    String name;
    boolean isMale;
    int hak; // 학년
    int ban; //반
    int score;

    public Student(String name, boolean isMale, int hak, int ban, int score) {
        this.name = name;
        this.isMale = isMale;
        this.hak = hak;
        this.ban = ban;
        this.score = score;
    }

    String getName() {
        return name;
    }

    boolean isMale() {
        return isMale;
    }

    int getHak() {
        return hak;
    }

    int getBan() {
        return ban;
    }

    int getSCore() {
        return score;
    }

    @Override
    public String toString() {
        return String.format("[%s, %s, %d학년, %d반, %3d점]", name, isMale ? "남" : "여", hak, ban, score);
    }
    //groupBy()에서 사용
    enum Level{HIGH, MID, LOW} // 성적을 상 중 하 세 단계로 분류
}
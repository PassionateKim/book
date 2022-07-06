package chapter14.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Stream 중간 연산 map()
 */
public class StreamEx8 {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Apple", "Cherry", "Orange");
        Stream<String> stream = list.stream();

        stream.map(s->s.toUpperCase()).forEach(System.out::println);

        Member[] members = {
                new Member("김"),
                new Member("최"),
                new Member("박"),
                new Member("이")
        };

        Stream<Member> memberStream = Stream.of(members);

        memberStream.map(member -> member.getName())
                    .forEach(System.out::println);

    }
}
class Member {
    private String name;

    public Member(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
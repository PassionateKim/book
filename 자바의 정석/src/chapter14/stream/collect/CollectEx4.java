package chapter14.stream.collect;

import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

/**
 * 그룹화와 분할 - partitioningBy()
 */
public class CollectEx4 {
    public static void main(String[] args) {
        Member[] memberList = {
                new Member("김수박", true, 1000),
                new Member("최수박", true, 2000),
                new Member("이수박", false, 100),
                new Member("류수박", true, 2500),
                new Member("상수박", false, 300),
                new Member("강수박", true, 5000)
        };

        /**
         * 기본 사용 예제
         */
        // stream으로 변환
        Stream<Member> memberStream = Stream.of(memberList);

        //partitionBy로 구분하기 vip인 사람과 아닌 사람
        Map<Boolean, List<Member>> isVipMap = memberStream.collect(partitioningBy((Member member) -> member.isVip));

        //key로 꺼내기
        List<Member> vipList = isVipMap.get(true);
        List<Member> notVipList = isVipMap.get(false);
        System.out.println("vip인 사람과 아닌 사람");
        // 요소 출력
        for (Member vip : vipList) {
            System.out.println("vip = " + vip);
        }
        for (Member notVip : notVipList) {
            System.out.println("notVip = " + notVip);
        }

        /**
         * Collector 추가 사용 예제
         */
        //stream으로 변환
        Stream<Member> memberStream2 = Stream.of(memberList);

        //partitionBy로 구분하기 vip인 사람과 아닌 사람의 수
        Map<Boolean, Long> longMap = memberStream2.collect(partitioningBy((Member member) -> member.isVip, counting()));
        System.out.println("vip인 사람과 아닌 사람의 수");
        System.out.println("vip 수: " + longMap.get(true));
        System.out.println("notVip 수: " + longMap.get(false));

        /**
         * partition 안에 partiton
         */
        //stream으로 변환
        Stream<Member> memberStream3 = Stream.of(memberList);

        //partition 안에 partition vip이면서 point가 3000 미만인 사람
        Map<Boolean, Map<Boolean, List<Member>>> pInP = memberStream3.collect(partitioningBy((Member m) -> m.isVip,
                                                                              partitioningBy((Member s) -> s.point < 3000)));
        List<Member> members = pInP.get(true).get(true);
        System.out.println("vip이면서 point가 3000 미만인 사람");
        for (Member member : members) {
            System.out.println("member = " + member);
        }
    }
}

class Member {
    String name;
    boolean isVip;
    long point;

    public Member(String name, boolean isVip, long point) {
        this.name = name;
        this.isVip = isVip;
        this.point = point;
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", isVip=" + isVip +
                ", point=" + point +
                '}';
    }
}//Member
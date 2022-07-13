package practice.ex.chapter11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Chapter11_7 {
    public static void main(String[] args) {
        ArrayList<Student2> list = new ArrayList<Student2>();
        list.add(new Student2("이자바", 2, 1, 70, 90, 70));
        list.add(new Student2("안자바", 2, 2, 60, 100, 80));
        list.add(new Student2("홍길동", 1, 3, 100, 100, 100));
        list.add(new Student2("남궁성", 1, 1, 90, 70, 80));
        list.add(new Student2("김자바", 1, 2, 80, 80, 90));


        Collections.sort(list, new BanNoAscending());
        Iterator<Student2> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }//main
}

class BanNoAscending implements Comparator<Student2> {

    @Override
    public int compare(Student2 o1, Student2 o2) {
        int i = (o1.ban) - (o2.ban);
        if (i == 0) {
            return (o1.no) - (o2.no);
        } else {
            return i;
        }
    }
}
package chapter11.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx1 {
    public static void main(String[] args) {
        ArrayList arrayList1 = new ArrayList(); // 값이 없으면 최대 길이가 10인 배열을 생성
        ArrayList arrayList2 = new ArrayList(5); // 최대 길이가 5인 배열을 생성


        arrayList1.add(4);
        arrayList1.add(5);
        arrayList1.add(3);
        arrayList1.add(2);
        arrayList1.add(1);
        //[4, 5, 3, 2, 1]

        //1 이상 3미만인 index의 arrayList1 값을 가진 ArrayList 생성
        ArrayList arrayList3 = new ArrayList(arrayList1.subList(1, 3));
        //[5, 3]

        // 정렬
        Collections.sort(arrayList3);
        //[3, 5]

        //add 활용
        arrayList3.add(1, "A"); // index 1 자리에 A 원소 넣기
        //[3, A, 5]

        //contains
        if (arrayList3.contains(arrayList1.get(2))) { // arrayList1의 index 2의 원소 3가 있으면
            arrayList3.remove(arrayList1.get(2));
            //[A, 5]
        }
    }
}

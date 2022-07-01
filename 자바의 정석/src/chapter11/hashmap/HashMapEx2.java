package chapter11.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx2 {
    static HashMap phoneBook = new HashMap();

    public static void main(String[] args) {
        addPhoneNo("친구", "김김김", "010-1111-1111");
        addPhoneNo("친구", "이이이", "010-2222-2222");
        addPhoneNo("친구", "최최최", "010-3333-3333");

        addPhoneNo("가족", "박박박", "010-4444-4444");
        addPhoneNo("가족", "효효효", "010-5555-5555");

        printList();
    }// main

    // 그룹에 전화번호를 추가하는 메서드
    static void addPhoneNo(String groupName, String name, String tel) {
        addGroup(groupName);
        HashMap group = (HashMap) phoneBook.get(groupName);
        group.put(tel, name); // 참조변수이므로 기존의 값인 해시맵 자체가 변경
    }
    // 그룹 추가 메서드
    static void addGroup(String groupName) {
        if (!phoneBook.containsKey(groupName)) {
            phoneBook.put(groupName, new HashMap());
        }
    }

    // 전화번호부 전체 출력
    static void printList() {
        Set set = phoneBook.entrySet(); //phoneBook
        Iterator iterator = set.iterator(); //collection의 요소를 참조하기 위한 iterator

        while (iterator.hasNext()) {
            Map.Entry e = (Map.Entry) iterator.next();
            Set entrySet = ((HashMap) e.getValue()).entrySet(); //group
            Iterator groupIterator = entrySet.iterator();

            System.out.println(e.getKey() + " [" + entrySet.size() + "] ");

            while (groupIterator.hasNext()) {
                Map.Entry e2 = (Map.Entry)groupIterator.next();
                System.out.println("이름: " + e2.getValue() + " 번호: " + e2.getKey());
            }
        }
    }
}

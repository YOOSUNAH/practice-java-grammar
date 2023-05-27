package chap_09;

import java.util.LinkedList;

public class _05_LinkedList {
    public static void main(String[] args) {
        // 링크드 리스트
        LinkedList<String> list = new LinkedList<>();
        list.add("유재석");
        list.add("조세호");
        list.add("김종국");
        list.add("박명수");
        list.add("강호동");

        // 데이터 조회 (인덱스)
        System.out.println(list.get(0));
        System.out.println(list.get(1));

        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        System.out.println("-------------------");

        // 추가
        list.addFirst("서장훈"); // 맨 처음에 데이터 추가
        for (String s : list){
            System.out.println(s);
        }
        System.out.println("-------------------");

        list.addLast("김희철"); // 맨 마지막에 추가
        for (String s : list){
            System.out.println(s);
        }

        System.out.println("-------------------");

        System.out.println("학생 추가 전 : " + list.get(1));
        list.add(1,"김영철"); // Linked List, Array List 둘다 가능
        // 원하는 인덱스 위치 앞에, 원하는 값을 추가
        System.out.println("학생 추가 후 : " +list.get(1)); // 원래는 유재석인데 김영철로 바뀜
        System.out.println("학생 추가 후 : " +list.get(2)); // 유재석은 김영철 다음으로 순서가 밀림

    }
}

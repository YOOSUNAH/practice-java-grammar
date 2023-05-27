package chap_09;

import java.util.ArrayList;
import java.util.Collections;

public class _04_Arraylist {
    public static void main(String[] args) {


        //컬렉션 프레임워크 (List, Sat, Map) _(List : Array List, LinkedList)
        //많은 데이터를 쉽고 편리하게 효과적으로 관리하기 위해서 자바에서 제공해주는 class들의 모음

        //그냥 배열 array
        // int[] array = new int[3]; // 크기가 고정되어있어서 데이터를 추가하려면 새로운 배열을 만들고 데이터를 옮기는 작업이 필요함

        // 컬렉션 프레임워크는 원하는 데이터를 얼마든지 추가하거나, 추가된 데이터를 삭제가능,
        // 컬렉션 내 데이터가 포함되어 있는지 검색 하거나, 정렬 하는 등 다양한 기능을 제공


        // 컬렉션 프레임워크_Array List
        ArrayList<String> list = new ArrayList<>();  //<> 안에 어떤 형의 데이터를 넣ㅇ르지 정의

        // 데이터 추가
        list.add("유재석");
        list.add("조세호");
        list.add("김종국");
        list.add("박명수");
        list.add("강호동");

        // 데이터 조회 (인덱스)
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));

        System.out.println("--------------------");

        // 삭제 (박명수씨가 이사)
        System.out.println("신청 학생 수 (이사 전) : " + list.size()); //5 _삭제 전
        list.remove("박명수");
        System.out.println("신청 학생 수 (이사 전) : " + list.size()); //4 _삭제 후
        System.out.println(list.get(3));// 강호동이 3 인덱스에 해당하게 됨

        System.out.println("--------------------");

        System.out.println("남은 학생 수 (제외 전) : " +  list.size()); //4
        list.remove(list.size() - 1); // 마지막 데이터
        System.out.println("남은 학생 수 (제외 후) : " +  list.size()); //3

        System.out.println("--------------------");

        // 순회
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("--------------------");

        // 변경 (수강권 양도)
        System.out.println("수강권 양도 전 : " + list.get(0));
        list.set(0,"이수근");  // set(몇번째 인덱스에 값을, 어떤 값으로 바꿀지 바꿀 데이터값)
        System.out.println("수강권 양도 후 : " + list.get(0));

        System.out.println("--------------------");

        // (위치) 확인
        System.out.println(list.indexOf("김종국")); // list.indexof(찾으려는 데이터)를 넣으면 몇번째에 있는지 알수있음

        // 선착순 5명 내에 포함되었는가?
        // 포함 여부 확인 _ 포함 시 true_contains메소드를 활용
        if (list.contains("김종국")){
            System.out.println("수강 신청 성공");
        } else {
            System.out.println("수강 신청 실패");
        }
        System.out.println("--------------------");

        // 전체 삭제 _모든 데이터를 한번에 삭제
        list.clear();
        // 리스트가 비어있는지 확인 list.isEmpty면 true
        if(list.isEmpty()){
            System.out.println("학생 수 : " +  list.size());
            System.out.println("리스트가 비었습니다.");
        }
        System.out.println("--------------------");

        // 다음 학기에 새로 공부 시작
        list.add("유재석");
        list.add("조세호");
        list.add("김종국");
        list.add("박명수");
        list.add("강호동");

        // 정렬 _가나다 순으로 정렬
        Collections.sort(list); // sort안에 정렬하고 싶은 데이터를 넣기
        for (String s : list) {
            System.out.println(s);
        }
    }
}

package chap_09;

import java.util.HashMap;

public class _07_HashMap {
    public static void main(String[] args) {
        // 맵 (Key, Value) 쌍으로 이루어진 형태를 의미한다.
        // 맵 : 중복 X, 순서 보장 X_ 순서 보장하고 싶으면 LinkedHashMap 사용함.
        HashMap<String, Integer> map = new HashMap<>(); // <Key값형태, Value값형태>_key값을 통해서 value값을 가져오거나 설정할수있음

        // 데이터 추가
        map.put("유재석", 10); // add없음 _ 유재석 값을 키로 넣고 10잔 만큼 포인트 누적
              // 유재석 키로 열수있는 사물함 속에는 10이라는 값이 들어있다.
        map.put("박명수", 5);
        map.put("김종국" ,3);
        map.put("서장훈", 15);

        System.out.println("총 고객 수 : " + map.size());
        System.out.println("----------------------");

        // (데이터) 조회
        // 포인트가 몇점있는 지 조회
        System.out.println("유재석님의 포인트 : " + map.get("유재석")); //map.get(key값을 입력)
        System.out.println("박명수님의 포인트 : " + map.get("박명수"));
        System.out.println("----------------------");

        // 확인
        if (map.containsKey("서장훈")){  // 서장훈씨 가 있는지 확인하고
            int point = map.get("서장훈"); // 있다면 기존 서장훈씨 데이터를 가지고 와서
            map.put("서장훈", ++point);    // point를 추가해준다.
            System.out.println("서장훈님의 누적 포인트 : " + map.get("서장훈"));
        }else {                  // 서장훈님 기존에 없다면
            map.put("서장훈", 1); //  새로 추가
            System.out.println("서장훈님 신규 등록 (포인트 1)");
        }
        System.out.println("----------------------");

        // 삭제
        map.remove("유재석");
        System.out.println(map.get("유재석"));  // null
        System.out.println("----------------------");

        // 전체 삭제
        map.clear();
        if (map.isEmpty()){
            System.out.println("남은 고객 수 : " + map.size());
            System.out.println("가게 접자");
        }
        System.out.println("----------------------");

        // 다시 고객들이 막 찾아옴
        map.put("유재석", 10);
        map.put("박명수", 5);
        map.put("김종국" ,3);
        map.put("서장훈", 15);

        // key 확인  _ HashMap도 순서 보장X , key값 중복 허용X
        for (String key : map.keySet()){
            System.out.println(key);
        }
        System.out.println("----------------------");

        // value 확인
        for (int value : map.values()){
            System.out.println(value);
        }
        System.out.println("----------------------");

        // Key & Value 함께 확인
        for (String key : map.keySet()){
            System.out.println("고객 이름 : " + key + "\t포인트 :" + map.get(key)); // map.get(key)를 통해서 value값을 가져와
        }
        System.out.println("----------------------");

        // 맵 : 중복 X, 순서 보장 X
        map.put("김종국" , 10);
        map.put("김종국" , 30);
        map.put("김종국" , 50); // 최종적으로 업데이트 된 값, 이 하나만 추가 됨.
        for (String key : map.keySet()){
            System.out.println("고객 이름 : " + key + "\t포인트 :" + map.get(key)); // map.get(key)를 통해서 value값을 가져와
        }
        System.out.println("----------------------");


    }
}

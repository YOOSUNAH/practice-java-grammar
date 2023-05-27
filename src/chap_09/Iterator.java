package chap_09;

import java.util.*;

public class Iterator {
    public static void main(String[] args) {
        // iterator(이터레이터) _list 와 set 같은 데이터를 순회하는 것, 커서에 해당하는 위치와 그다음 한글자 한글 가져옴.
        // 데이터를 확인하다가 필요없으면 그자리에서 삭제도 용이
        List<String> list = new ArrayList<>();
        // 맨 앞에 List 는 인터페이스_ArrayList는 그냥 clas_ list 인터페이스를 구현하고 있음.
        // List<String> list2 = new LinkedList<>();
        // List 인터페이스 구현을 해서, 최소한 List 인터페이스에서 제공해주는 메소드를 사용할 수 이싿.

        list.add("유재석");
        list.add("(알 수 없음)");
        list.add("김종국");
        list.add("(알 수 없음)");
        list.add("강호동");
        list.add("(알 수 없음)");
        list.add("박명수");
        list.add("(알 수 없음)");
        list.add("조세호");

        for (String s :list) {
            System.out.println(s);
        }
        System.out.println("------------------------");

        // list.iterator(); 작성 후 _(반환형을 가지는 메소드의 경우에) iterator에 커서를 올리고
        // command + option + v 하면 아래와 같이 됨

        java.util.Iterator<String> it = list.iterator();
        System.out.println(it.next());  // 맨 처음 데이터  // 유재석
        System.out.println(it.next());  //  그 다음     // (알 수 없음)
        System.out.println(it.next());  //  그 다음     // 박명수
        System.out.println(it.next());  //  그 다음     // (알 수 없음)

        System.out.println("------------------------");
        it = list.iterator(); // 커서를 처음 위치로 이동
        while (it.hasNext()){  // 인덱스가 없으니 while 사용 _
            // 데이터가 있으면 true로 계속 가다가, 데이터가 없으면 false로 반복문을 탈출할 것이다.
            System.out.println(it.next());
        }
        System.out.println("------------------------");

        // 삭제  _ "(알 수 없음)"만 삭제
        it = list.iterator(); // 커서를 처음 위치로 이동
        while(it.hasNext()){
            String s = it.next();
            if (s.contains("(알 수 없음)")){
                it.remove(); // 삭제
            }
        }
        it = list.iterator(); // 커서를 처음 위치로 이동
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("------------------------");

        HashSet<String> set = new HashSet<>(); // 순서 보장 X,
        set.add("유재석");
        set.add("박명수");
        java.util.Iterator<String> itSet = set.iterator();
        while(itSet.hasNext()){
            System.out.println(itSet.next());
        }

        HashMap<String, Integer> map = new HashMap<>();
        map.put("유재석" , 10);
        map.put("박명수" , 5);

       // map.iterator() // 제공되지 않음
        // key를 iterator를 통해서 순회하고, value를 iterator를 통해서 순회하는 식으로 처리
        // map.key().iterator(); -> command +option +v
        java.util.Iterator<String> itMapKey = map.keySet().iterator();
        while(itMapKey.hasNext()){
            System.out.println(itMapKey.next());
        }
        System.out.println("------------------------");

        // map.values().iterator(); -> command +option +v
        java.util.Iterator<Integer> itMapValue = map.values().iterator();
        while(itMapValue.hasNext()){
            System.out.println(itMapValue.next());
        }
        System.out.println("------------------------");
    //key와 value를 함께 : map.entrySet().iterator()
        java.util.Iterator<Map.Entry<String, Integer>> itMap = map.entrySet().iterator();
        while(itMap.hasNext()){
            System.out.println(itMap.next());
        }

    }
}

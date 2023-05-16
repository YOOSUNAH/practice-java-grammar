package chap_05;

public class _02_ArrayLoop {
    public static void main(String[] args) {
        // 배열의 순회
        String[] coffees = {"아메리카노", "카페모카", "라떼", "카푸치노"};

        // for 반복문 순회
        for (int i = 0; i < 4; i++) {
            System.out.println(coffees[i] + "하나");
        }
        System.out.println("주세요");

        System.out.println("----------");

        // 배열의 길이를 이용한 순회  // 인덱스 값을 이용해서 해결해야한다면 for i를 사용하고
        for (int i = 0; i < coffees.length; i++) {
            System.out.println(coffees[i] + "하나");
        }
        System.out.println("주세요");

        System.out.println("----------");

        // enhanced for (for-each) 반복문   //배열의 모든 요소를 순회하면서 해결하려면 enhanced for를사용
//        for (String coffee : coffees) { //coffeess라는 배열에 있는 값들을 순회하는데, 순서대로 순회하는데, 그때마다 순회하는 것들을 coffee라는 이름으로 받아서 사용하겠다.
//            System.out.println(coffee + "하나");
//        }
//        System.out.println("주세요");

        for (String coffee :
                coffees) {
            System.out.println(coffee + "하나");
        }
        System.out.println("주세요");


    }
}

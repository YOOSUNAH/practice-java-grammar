package chap_09;

import chap_09.coffee.Coffee;
import chap_09.coffee.CoffeeByName;
import chap_09.coffee.CoffeeByNickname;
import chap_09.coffee.CoffeeByNumber;

public class _02_GenericClass {
    public static void main(String[] args) {
        // 재네릭 클래스
        CoffeeByNumber c1 = new CoffeeByNumber(33);
        c1.ready();

        CoffeeByNickname c2 = new CoffeeByNickname("유재석");
        c2.ready();

        System.out.println("------------");

        CoffeeByName c3 = new CoffeeByName(34);
        c3.ready();

        CoffeeByName c4 = new CoffeeByName("박명수");
        c4.ready();

        System.out.println("------------");
        int c3Name = (int) c3.name;
        System.out.println("주문 고객 번호 : " + c3Name);

        String c4Name = (String) c4.name;
        System.out.println("주문 고객 이름 : " + c4Name);

        //c4Name = (String) c3.name _정수를 문자로 못바꿈.
        System.out.println("------------");

        Coffee<Integer> c5 = new Coffee<>(35); // 35 대신 "조세호"를 넣으면 오류, <Integer> 를 받기로 했기 떄문
        c5.ready();
        int c5Name = c5.name; // 따로 형 변환없이 값을 집어 넣을 수 있다.
        System.out.println("주문 고객 번호 : " + c5Name);

        Coffee<String> c6 = new Coffee<>("조세호"); // 36이라는 정수를 넣을 수 없음.
        c6.ready();
        String c6Name = c6.name;
        System.out.println("주문 고객 이름 : " + c6Name);


    }
}

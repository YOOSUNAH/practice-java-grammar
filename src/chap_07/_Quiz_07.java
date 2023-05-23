package chap_07;

import java.util.logging.Handler;

public class _Quiz_07 {
    public static void main(String[] args) {


        HamBurger[] hamburgers = new HamBurger[3];
        hamburgers[0] = new HamBurger();
        hamburgers[1] = new CheeseBurger();
        hamburgers[2] = new ShrimpBurger();

        System.out.println("주문하신 메뉴를 만듭니다.");
        System.out.println("--------------");
        for (HamBurger hamBurger : hamburgers) {
            hamBurger.cook();
            System.out.println("----------");
        }
        System.out.println("메뉴 준비가 완료되었습니다.");

    }
}

class HamBurger {
    public String name;  // name 변수 정의

    public HamBurger() {   // 생성자를 하나 만들기
        this("햄버거");  // 햄버거라는 값을 넣어주면 밑에 생성자2를 호출이 됨
    }

    public HamBurger(String name) {  // 생성자2
        this.name = name;
    }

    public void cook() {   // cook() 메소드 정의
        System.out.println(this.name + "를 만듭니다.");
        System.out.println("빵 사이에 들어가는 재료는?");
        System.out.println("> 양상추");
        System.out.println("+ 패티");
        System.out.println("+ 피클");
    }

}

class CheeseBurger extends HamBurger {
    public CheeseBurger(){
        super("치즈버거");
    }
    public void cook() {
        super.cook();    // 부모클래스의 cook 메소드를 쓰면됨
        System.out.println("+ 치즈");

    }
}

class ShrimpBurger extends HamBurger {

    public ShrimpBurger(){  // 생성자
        super("새우버거");  //super로 부모클래스에 있는 생성자의 name 정보를 전달 받아가지고
                                // this.name = name; 값을 업데이트 해주는
                                 // 생성자2를 호출해주는
    }
    public void cook() {
        super.cook();
        System.out.println("+ 새우");

    }
}
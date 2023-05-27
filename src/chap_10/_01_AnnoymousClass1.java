package chap_10;

public class _01_AnnoymousClass1 {
    public static void main(String[] args) {
        // 익명 클래스 : 이름이 없는 클래스
        Coffee c1 = new Coffee();
        c1.order("아메리카노");

        System.out.println("-------------");

        Coffee c2 = new Coffee();
        c2.order("라떼");
        System.out.println("-------------");

        // 굉장히 친한 친구가 방문  : 익명 클래스
        Coffee specialCoffee = new Coffee() {
            @Override
            public void order(String coffee) {
                super.order(coffee);
                System.out.println("(귓속말) 딸기 케이크는 서비스에요.");
            } // specialCoffee만 (객체 하나) 위해 order라는 메소드를 재정의 할 수 있다._ 일회성

            @Override
            public void returnTray() {
                System.out.println("(귓속말) 자리에 두시면 제가 치울게요");
            }
        }; // 세미콜론 위치가 다름
        specialCoffee.order("바닐라 라떼");
        specialCoffee.returnTray();
    }
}

class Coffee {
    public void order(String coffee) {
        System.out.println("주문하신 " + coffee + " 나왔습니다.");
    }

    public void returnTray() {
        System.out.println("커피 반납이 완료되었습니다.");
    }
}





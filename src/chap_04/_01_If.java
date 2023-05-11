package chap_04;

public class _01_If {
    public static void main(String[] args) {
        //조건문 If
        int hour = 15; //오후 3시

        // if문 내에서 하나의 문장을 실행할 때는 { } 생략 가능
        if ( hour < 14 )
            System.out.println("아이스 아메리카노 +1");

        if ( hour < 14 ) {
            System.out.println("아이스 아메리카노 +1");//if 조건이 true면 그다음 명령을 실행함
            System.out.println("샷 추가");
        } //if 뒤에 명령문이 한개 이상이면 {}로 표시해야함.
        System.out.println("커피 주문 완료");


    }
}

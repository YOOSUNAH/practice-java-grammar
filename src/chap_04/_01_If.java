package chap_04;

public class _01_If {
    public static void main(String[] args) {
        //조건문 If
        int hour = 15; //오후 3시

        // if문 내에서 하나의 문장을 실행할 때는 { } 생략 가능
        if (hour < 14)
            System.out.println("아이스 아메리카노 +1");

        if (hour < 14) {
            System.out.println("아이스 아메리카노 +1");//if 조건이 true면 그다음 명령을 실행함
            System.out.println("샷 추가");
        } //if 뒤에 명령문이 한개 이상이면 {}로 표시해야함.
        System.out.println("커피 주문 완료 #1");

        // 오후 2시 이전, 모닝 커피를 마시지 않은 경우? (조건이 2가지니, &&로 연결)
        hour = 10;
        boolean morningCoffee = false; //모닝 커피
        // if (hour < 14 && !morningCoffee)   !를 붙이면 논리 부정연산자 로 같은 결과가 나옴
        if (hour < 14 && morningCoffee == false){
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("커피 주문 완료 #2");

        //오후 2시 이후이거나 모닝 커피를 마신 경우?
        hour = 15;
        morningCoffee = true;
        //if(hour >= 14 || morningCoffee)  (모닝커피가 true여서 동일한 결과)
        if(hour >= 14 || morningCoffee == true){
            System.out.println("아이스 아메리카노(디카페인) +1");
        }
        System.out.println("커피 주문 완료 #3");
    }
}

package chap_04;

public class _04_SwitchCase {
    public static void main(String[] args) {
        // Switch Case

        // 석차에 따른 장학금 지급
        // 1등 : 전액 장학금
        // 2등 : 반액 장학금
        // 3등 : 반액 장학금
        // 그 외 : 장학금 대상 아님

        // If Else 문을 이용 (여러 조건 또는 범위에 해당하는 조건)
        int ranking = 4; //1등
        if (ranking == 1){
            System.out.println("전액 장학금");
        } else if (ranking == 2 || ranking ==3){
            System.out.println("반액 장학금");
        } else {
            System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료 #1");

        // Switch Case 문을 이용 (명확한 케이스가 있는 경우)
        // 범위일때는 if 명확한 case 값일 경우에는 switch
        // switch _예시_ 온라인 쇼핑몰 구매하는데 에러 코드에 따라 알림을 다르게
        // 에러코드 100 일때, 단종된 상품입니다.
        // 에러코드 200 일때, 일시 품절입니다.
        // 에러코드 300 일때, 구매가능 시간이 아닙니다.

        ranking = 1;
        switch (ranking){
            case 1:
                System.out.println("전액 장학금");
                break;
            case 2:
                System.out.println("반액 장학금");
                break;
            case 3:
                System.out.println("반액 장학금");
                break;
            default :
                System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료 #2");

        //case 2와 3을 통합
        ranking = 3;
        switch (ranking){
            case 1:
                System.out.println("전액 장학금");
                break;
            case 2:
            case 3:
                System.out.println("반액 장학금");
                break;
            default :
                System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료 #3");

        // 중고상품의 등급에 따른 가격을 책정 (1급 : 최상, 4급 : 최하)
        int grade = 1; // 등급
        int price = 7000; // 기본 가격
        switch (grade){
            case 1:
                price += 1000; // price = price + 1000;
            case 2:
                price += 1000;
            case 3:
                price += 1000;
                break;
        }
        System.out.println(grade + "등급 제품의 가격 : " + price + "원");
        // 1등급 제품의 가격 : 10000원 _7천원 더하긴 천원하고 break가 없어서 천원 천원 더 더해
        // 2등급 제품의 가격 : 9000원



    }
}

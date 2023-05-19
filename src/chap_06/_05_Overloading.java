package chap_06;

public class _05_Overloading {
    public static int getPower(int number){
        int result = number * number;
        return result;
        // return = number * number; 로 할 수 도 있음
    }

    public static int getPower(String strNumber){
        int number = Integer.parseInt(strNumber); // String을 int 정수로 변환
       return number * number;
    }

    public static int getPower(int number, int exponent){
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }
    public static void main(String[] args) {
        // 메소드 오버로딩 : 이름이 같은 메소드를 여러개를 만드는 것
        // 같은 이름의 메소드를 여러번 선언
        // 조건
        // 1. 전달값의 타입이 다르거나
        // 2. 전달값의 갯수가 다르거나
        // 전달값의 타입이 다르거나(즉, 자료형이 다르거나) 또는 전달값의 개수가 다르면 메소드 오버로딩이 가능하다.
        // 반응형이 다른건 상관없음
        //public static int getPower(int number){}  여기에서 int getPower 를 double로 바꾸는건 안됨
        // 괄호안에 (int number) 전달값의 타입이나 갯수가 달라야 함
        System.out.println(getPower(3)); // 3 * 3 = 9
        System.out.println(getPower("4")); // 4 * 4 = 16
        System.out.println(getPower(3, 3)); // 3 * 3 * 3 = 27



    }
}

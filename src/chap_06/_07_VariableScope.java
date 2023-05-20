package chap_06;

public class _07_VariableScope {
    public static void methodA(){  // methodA() 괄호 안에 int number를 써서 전달값을 정의해주면, 사용 가능
        //System.out.println(number);  // 메인 영역 내에서 선언된 변수(number)는 메인영역에서만 쓸 수 있음.
    }
    public static void methodB(){
        int result = 1; // 지역 변수 : 변수가 선언된 그 영역 내에서만 사용할 수 있음.
    }
    public static void main(String[] args) {
        int number = 3;

       // System.out.println(result); // methodB에서 만든 변수(result) 다른 곳에서 사용할 수 없다.
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
       // System.out.println(i); //for 문에서 선언된 i 는 선언된 중괄호 내에서만 사용 가능 (for문 밖에서는 사용 못함


    }
}

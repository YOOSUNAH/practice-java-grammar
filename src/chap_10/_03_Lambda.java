package chap_10;

public class _03_Lambda {
    public static void main(String[] args) {
        // 람다식 : 아주 간결한 형태의 코드 뭉치.
        // (전달값1, 전달값2, ...) -> { 코드 }

        // 람다식 예제
    }

//    public void print(){
//        String s = "test";
//        System.out.println(s);
//    }

// 위 코드를 람다식으로 바꿔보자
// 람다식 public 필요없고, 이름도 필요없어서 print 생략 가능, 자동으로 return 타입 정해줘서 void도 필요없음
    // -> 이 기호는 꼭 있어야 함.

//      () -> {
//        String s = "test";
//        System.out.println(s);
//    }

//----------------------------------------
//    public void print(String s) {
//        System.out.println(s);
//    }

// 위 코드를 람다식으로 바꿔보다
    // 접근제어자 필요없음(public삭제), 메소드명필요없음(print삭제), 반환형필요없음(void삭제)
    // 한 문장이면 {} 중괄호 없앨 수 있고, 한문장이면 ;세미클론도 없앨 수 있음
    // 전달되는 값이  String형태라는 것도 미리 알수있어서 생략 가능
    // 전달 값이 한개면 (s) 이 ()괄호가 없어도 됨

//      s -> System.out.println(s)

//----------------------------------------

//    public int add(int x, int y){
//        return x +y;
//    }

// 위 코드를 람다식으로 바꿔보다

    // 아무리 문장이 한 줄이어도, return이 포함되어 있으면 괄호를 생략할수없다.
//    (x,  y) -> {return x +y;}
    // return 제외하면 중괄호 없앨 수 있음

//      (x,  y) -> x + y


}

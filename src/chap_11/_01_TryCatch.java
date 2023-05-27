package chap_11;

public class _01_TryCatch {
    public static void main(String[] args) {
        // 예외처리
        // 오류 : 컴파일 오류, 런타임 오류 (에러 error, 예외 exception)
        // 컴파일 오류
        // int i  = "문자열";

        // 런타임 오류 (에러 error, 예외 exception)
        // 에러 _우리가 작성한 코드를 통해서 수습 x
        // 예외 _우리가 작성한 코드를 통해서 수습 가능
        // int[] arr = new int[3];
        // arr[5] = 100;

//        S s = null;
//        s.methodA();

        //try{ 시도하려는 소스코드 } catch () { try에서 시도하려는 소스코드가 문제가있을 경우 catch문 내에서 처리가 됨}
        try{

            //System.out.println(3 / 0);

//            int[] arr = new int[3];
//            arr[5] = 100;

            Object obj = "test";
            System.out.println((int) obj);

        } catch (Exception e){
            System.out.println("이런 문제가 발생했어요  => " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("프로그램 정상 종료"); // 출력이 안되면 그냥 이 문장 안 나오고 끝나버림

    }
}

//     class S{
//     public void methodA(){
//        this.methodA();
//    }
// }
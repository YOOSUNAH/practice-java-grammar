package chap_02;

public class _01_Operator1 {
    public static void main(String[] args) {
        //산술 연산자

        //일반 연산
        System.out.println(4 + 2); //6
        System.out.println(4 - 2); //2
        System.out.println(4 * 2); //8
        System.out.println(4 / 2); //2
        System.out.println(5 / 2); //2.5가 아닌 2만 나옴
        System.out.println(2 / 4); //0.5가 아닌 0만 나옴
        System.out.println(4 % 2); //4를 2로 나눴을 때의 나머지, 0이 나옴
        System.out.println(5 % 2); //5를 2로 나눴을 때의 나머지, 1이 나옴

//        우선 순위 연산
        System.out.println(2 + 2 * 2); // 6. 곱하기 연산 먼저 함.
        System.out.println((2 + 2) * 2); //8. 괄호 먼저 계산 해줌.

        // 변수를 이용한 연산
        int a = 20;
        int b = 10;
        int c ;
        c = a + b;
        System.out.println(c); //30
        c = a - b;
        System.out.println(c); //10
        c = a * b;
        System.out.println(c); //200
        c = a / b;
        System.out.println(c); //2
        c = a % b;
        System.out.println(c); //0

        //증감 연산 ++, --
        int val;
        val = 10;
        System.out.println(val); //10
        System.out.println(++val); // 11   , 1이 먼저 더해진 다음에
        System.out.println(val); //11  , 문장이 수행됨

        val = 10;
        System.out.println(val); //10
        System.out.println(val++); // 10 , val 문장 수행이 먼저 된 다음에
        System.out.println(val); // 11 ,    1 이 더해짐

//        val = val + 1;
//        val++; //문장이 수행이 먼저 된 다음에, 1이 더해짐.
//        ++val;  //val에 1이 더해진 다음에 , 다른 문장이 수행이 됨

        val = 10;
        System.out.println(val); //10
        System.out.println(--val); //9
        System.out.println(val); //9

        val = 10;
        System.out.println(val); //10
        System.out.println(val--); //10
        System.out.println(val); //9

        //은행 대기표
        int waiting = 0;
        System.out.println("대기 인원 : " + waiting++); // 대기 인원 : 0
        System.out.println("대기 인원 : " + waiting++); // 대기 인원 : 1
        System.out.println("대기 인원 : " + waiting++); // 대기 인원 : 2
        System.out.println("총 대기 인원 :" + waiting); //총 대기인원 : 3



    }
}

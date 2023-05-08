package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        //문자열 변수
        String name;  //변수를 선언하고,
        name = "나도코딩"; //값을 대입하는 방법 이 있고 ,
         //String name = "나도코딩";변수를 선언하면서 동시에 초기화할수도 있다.
        //=은 오른쪽에 있는 어떤 값을 왼쪽에 변수 또는 객체에 집어넣겠다.

        int hour = 15; //정수형 변수는 int로 만들기,숫자는 ""필요없음.

        System.out.println(name + "님, 배송이 시작됩니다. " + hour + "시에 방문 예정입니다.");
        System.out.println(name + "님, 배송이 완료되었습니다.");

        double score = 90.5; //실수값은 double로
        char grade = 'A';//딱 한 글자 표현 시 char로 ''작은따옴표로
        name = "강백호"; //값을 업데이트할수도 있다.
        System.out.println(name + "님의 평균 점수는 " + score + "점입니다.");
        System.out.println("학점은 " + grade + "입니다.");

        //참과 거짓을 뜻하는 boolean
        boolean pass = true;
        System.out.println("이번 시함에 합격했을까요? " + pass);

        double d = 3.14123456789;
        float f =  3.14123456789f; //float변수에 넣을떄는 실수값 뒤에 f를 넣어야 함
        //float는 소숫점 아래 7번까지만 나옴
        System.out.println(d);
        System.out.println(f);

        long l = 100000000000L; //int보다 큰 범위에는 long으로 뒤에L붙여야 함.
        System.out.println(l);
    }
}


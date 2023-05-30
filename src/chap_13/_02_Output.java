package chap_13;

public class _02_Output {
    public static void main(String[] args) {
        //System.out.format();
        //System.out.printf();


        System.out.println("-------- 정수 --------");
        //souf 치면 자동완성
        //System.out.printf("포맷", 값1, 값2, 값3, ....);
        System.out.printf("%d%n", 1); //정수값 출력후 줄바꿈 // 1
        // \n줄바꿈(os마다 차이가 있어서)-> %n으로 줄바꿈을 표시
        System.out.printf("%d %d %d%n", 1, 2, 3); // 1 3 4
        System.out.printf("%d%n", 1234); //1234
        System.out.printf("%6d%n", 1234); // __1234 6자리의 공간을 확보하고 나서 1234출력
        // %6d 정수를 출력하는 6만큼의 공간을 만든 다음에 그 공간에 맞춰서 1234 넣겠다
        System.out.printf("%06d%n", 1234); // 001234 6자리의 공간을 확보 후 1234 출력하는 빈공간을 0으로 채움.
        System.out.printf("%6d%n", -1234); //_-1234 6자리 공간을 확보하고 -1234출력
        System.out.printf("%+6d%n", 1234); // _+1234
        System.out.printf("%,15d%n", 1000000000); // __1,000,000,000
        System.out.printf("%-6d%n", 1234); // 1234__ (6자리 공간을 확보하고 나서 왼쪽 정렬 1234출력)

        System.out.println("-------- 실수 --------"); // %f (floating-point: 부동 소수점 형식)
        System.out.printf("%f%n", Math.PI); // 3.14593 (일반출력) //PI = 3.141593...
        System.out.printf("%.2f%n", Math.PI); // 3.14  %2f 소수점 둘째 자리까지, 세째자리에서 반올림
        System.out.printf("%6.2f%n", Math.PI); // __3.14 6자리만큼 공간을 마련하고 나서 소수점 둘째자리까지 실수값을 출력
        System.out.printf("%-6.2f%n", Math.PI); // 3.14__ // 마이너스 붙이면 왼쪽 정렬
        System.out.printf("%06.2f%n", Math.PI); // 003.14 //6자리 공간확보, 소수점둘째자리까지 출력, 빈자리는 0을로 출력
        System.out.printf("%+6.2f%n", Math.PI); //_+3.14  // 항상+-기호표시 //원래 양수면 플러스 기호 생략하는데 표시하려면 + 붙임

        System.out.println("-------- 문자열 --------");
        System.out.printf("%s%n", "Java"); //Java (일반출력)
        System.out.printf("%6s%n", "Java"); // __Java (6자리 공간 확보하고 우측 정렬)
        System.out.printf("%-6s%n", "Java"); // Java__ (6자리 공간 확보하고 좌측 정렬)
        System.out.printf("%6.2s%n", "Java"); // ____Ja (6자리 공간 확보하고 우측 정렬해서 2글자 출력) // .2 앞에서 두글자만 출력
        System.out.printf("%-6.2s%n", "Java"); //Ja____ (6자리 공간 확보하고 좌측 정렬해서 2글자 출력)

        System.out.println("-------- 응용1 --------");
        System.out.println("이름 영어 수학 평균");
        System.out.println("강백호 " + 90 + " " + 80 + " " + 85.0); // 강백호 90 80 85.0
        System.out.println("서태웅 " + 100 + " " + 100 + " " + 100.0); // 서태웅 100 100 100.0
        System.out.println("채치수 " + 95 + " " + 100 + " " + 97.5); // 채치수 95 100 97.5

        System.out.println("-------- 응용2 --------");
        System.out.println("이름      영어   수학   평균"); // 공백이 각각 6, 3, 3 칸으로 구분
        System.out.printf("%-6s %4d %4d %6.1f%n", "강백호", 90, 80, 85.0);
        System.out.printf("%-6s %4d %4d %6.1f%n", "서태웅", 100, 100, 100.0);
        System.out.printf("%-6s %4d %4d %6.1f%n", "채치수", 95, 100, 97.5);

        System.out.println("-------- 참고 --------");
        System.out.println("ABCDEFG");
        System.out.println("가나다라마바사");
        System.out.println("가 나 다 라");


    }
}

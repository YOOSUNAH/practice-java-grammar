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

    }
}

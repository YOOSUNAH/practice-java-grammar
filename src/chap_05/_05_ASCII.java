package chap_05;

public class _05_ASCII {
    public static void main(String[] args) {
        // 아스키 코드 (ANSI) : 미국 표준 코드
        // 알파벳 대문자(A)는 65 부터 시작, 소문자(B)는 97부터 시작, 숫자(0)는 48부터 시작

        char c = 'A';  //48
        System.out.println(c); // A
        System.out.println((int)c); // 형 변환 후 출력 하면 65

        c = 'B';
        System.out.println(c); // B
        System.out.println((int)c); // 형 변환 후 출력 하면 66

        c++;
        System.out.println(c);  // C
        System.out.println((int)c); // 67

        String[][] seats3 = new String[10][15];
        char ch = 'A';
        for (int i = 0; i < seats3.length; i++) { //세로
            for (int j = 0; j <seats3[i].length ; j++) {
                seats3[i][j] = String.valueOf(ch) + (j + 1);
            }
            ch++;
        }
        // 영화관 좌석 번호 확인
        for (int i = 0; i < seats3.length; i++) { //세로
            for (int j = 0; j < seats3[i].length; j++) { //가로
                System.out.print(seats3[i][j] + " "); // A1 A2 A3
            }
            System.out.println();
        }

    }
}

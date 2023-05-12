package chap_04;

public class _05_For {
    public static void main(String[] args) {
        // 반복문 For
        // 옷을 사러 매장에 방문했다. 매장직원이 인사를 건넨다.
        // 나코 매장
        System.out.println("어서오세요. 나코입니다.");
        // 또다른 손님이 들어오면?
        System.out.println("어서오세요. 나코입니다.");
        System.out.println("어서오세요. 나코입니다.");
        System.out.println("어서오세요. 나코입니다.");
        System.out.println("어서오세요. 나코입니다.");
        System.out.println("어서오세요. 나코입니다.");
        System.out.println("어서오세요. 나코입니다.");
        System.out.println("어서오세요. 나코입니다.");
        //만약에 인사 법이 바뀌면?
        System.out.println("환영합니다. 나코입니다.");
        System.out.println("환영합니다. 나코입니다.");
        System.out.println("환영합니다. 나코입니다.");
        // 매장 이름이 바뀌면?
        // 나코 -> 코나
        System.out.println("환영합니다. 코나입니다.");
        System.out.println("환영합니다. 코나입니다.");
        System.out.println("환영합니다. 코나입니다.");

        System.out.println(" ---- 반복문 사용 ---- ");

        // 반복문 사용  For
       // for (선언; 조건; 증감 ) {  ... 수행 명령 ...}
        for (int i = 0; i < 10; i++ ){
            //i라는 값은 처음에 0이었고, i가 10보다 작을 동안, i를 1을 반복하면서 아래 문장을 반복한다.
            //System.out.println("어서오세요. 나코입니다. " + i);
            System.out.println("환영합니다. 나코입니다. " + i);
        }
        // 짝수만 출력 (fori만 적고 엔터)
        // 0, 2, 4, 6, 8
        for (int i = 0; i < 10; i += 2) {
            System.out.print(i); // ln은 줄바꿈, 없이 print만 쓰면 줄바꿈 없이 연속적으로 값이 나옴
        }

        System.out.println(); //그냥 줄바꿈만 추가

        // 홀수만 출력
        // 1, 3, 5, 7, 9
        for (int i = 1; i <10 ; i += 2) {
            System.out.print(i);
        }

        System.out.println();

        // 거꾸로 숫자
        // 5, 4, 3, 2, 1
        for (int i = 5; i > 0; i--) { //i가 0보다 크다는 조건을 만족하는 동안 함.
             System.out.print(i);
        }
        System.out.println();

        // 1부터 10까지의 수들의 합
        // 1 + 2 + 3 ... + 10 =55
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
            System.out.println("현재까지 총합은 " + sum + "입니다.");
        }
        System.out.println("1부터 10까지의 모든 수의 총합은" + sum + "입니다.");

    }
}

package chap_06;

public class _08_MainMethod {
    // 메인 메소드
    // void 라서 변환값은 없고
    // 전달값은 args라는 String[] 스트링 배열이 넘어오게 되는
    public static void main(String[] args) {
        for (String s : args) {
            System.out.println(s);
        }
        // 1. 도서 조회
        // 2. 도서 대출
        // 3. 도서 반납
        if (args.length == 1) {
            switch (args[0]) {
                case "1" :
                    System.out.println("도서 조회 메뉴입니다.");
                    break;
                case "2" :
                    System.out.println("도서 대출 메뉴입니다.");
                    break;
                case "3" :
                    System.out.println("도서 반납 메뉴입니다.");
                    break;
                default:
                    System.out.println("잘못 입력하셨습니다.");
            }
        } else {
            System.out.println("사용법) 1 ~ 3 메뉴 중 하나를 입력하세요");
        }

    }
}

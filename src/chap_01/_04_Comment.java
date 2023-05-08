package chap_01;

public class _04_Comment {
    public static void main(String[] args) {
        //사용 용도 1: 이미 사람들이 앉아있어서 말할 필요없어서 삭제하려고
        System.out.println("(10분 전) 잠시 후 결혼식 시작 예정이오니 참석 부탁드립니다.");
        //System.out.println("(5분 전) 잠시 후 결혼식 시작 예정이오니 참석 부탁드립니다.");
        System.out.println("지금부터 결혼식을 시작하겠습니다.");

        //사용 용도 2: 다른 개발자가 모를수있으니 메모, 또는 과거에 기록보려고
        int size = 120;
        size = size + 10; //어린이는 발이 빨리 자라기 때문에 사이즈 10만큼 더 큰 신발을 구매
        System.out.println("신발 사이즈 " + size + "으로 보여주세요.");

        //여러줄을 주석처리할 때는 /*으로 시작해서 */으로 끝낼수도있음.
        //한 줄 주석 단축키 : command + /
        //여러줄 주석 단축키 : command + shift + /
        /*int a = 10;
        int b = 20;
        System.out.println(a + b); */

    }
}
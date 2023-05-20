package chap_07;

public class BlackBox {

    // main method 필요없고 바로 변수 정의 하면 됨.
    // static 없이 그냥 작성한 변수는 인스턴스
    // 서로 다른 객체에서 서로 다른 값을 가짐.
    String modelName; // 모델명
    String resoultion; // 해상도
    int price; // 가격
    String color; // 색상

    // static 을 붙이면 class 변수라고 함. class 내에 class 변수
    // 이 class로 부터 만들어지는 모든 객체에 똑같이 적용이 됨
    // class 로 부터 만들어진 객체에다가 공통적으로 적용해야 하는 상황이 있다면, 그 변수는 인스턴스 변수가 아니고 class 변수로 사용

    static boolean canAutoReport = false; // 자동 신고 기능

    void autoReport() {
        if (canAutoReport) {
            System.out.println("충돌이 감지되어 자동으로 신고합니다.");
        } else {
            System.out.println("자동 신고 기능이 지원되지 않습니다.");
        }
    }  // 자동 신고 기능하는 메소드

    void insertMemoryCard(int capacity) {
        System.out.println("메모리 카드가 삽입되었습니다.");
        System.out.println("용량은 " + capacity + "GB 입니다.");
    }   // 전달값 있는 메소드

    // 전달값 과 반환값도 있는 메소드
    int getVideoFileCount(int type) {
        if (type == 1) {// 일반 영상
            return 9;
        } else if (type == 2) {
            return 1;
        }
        return 10;
    }

    // showDateTime : 날짜정보 표시여부
    // showSpeed : 속도정보 표시여부
    // min : 영상 기록 단위(분)
    void record(boolean showDateTime, boolean showSpeed, int min) {
        System.out.println("녹화를 시작합니다.");
        if (showDateTime) {
            System.out.println("영상에 날짜정보가 표시됩니다.");
        }
        if (showSpeed) {
            System.out.println("영상에 속도정보가 표시됩니다.");
        }
        System.out.println("영상은 " + min + "분 단위로 기록됩니다.");
    }

    void record() {
        record(true, true, 5);
    };

}

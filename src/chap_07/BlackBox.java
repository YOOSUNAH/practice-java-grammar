package chap_07;

public class BlackBox {

    // main method 필요없고 바로 변수 정의 하면 됨.
    // static 없이 그냥 작성한 변수는 인스턴스
    // 서로 다른 객체에서 서로 다른 값을 가짐.
    String modelName; // 모델명
    String resoultion; // 해상도
    int price; // 가격
    String color; // 색상
    int serialNumber; // 시리얼 번호

    static int counter = 0; // 시리얼 번호를 생성해주는 역할 (처음엔 0이었다가 ++ 연산을 통해 값을 증가)

    // static 을 붙이면 class 변수라고 함. class 내에 class 변수
    // 이 class로 부터 만들어지는 모든 객체에 똑같이 적용이 됨
    // class 로 부터 만들어진 객체에다가 공통적으로 적용해야 하는 상황이 있다면, 그 변수는 인스턴스 변수가 아니고 class 변수로 사용
    static boolean canAutoReport = false; // 자동 신고 기능

    //생성자 _ 클래스명과 똑같이 만들어주면 됨, 반환형이 따로 없음.
    BlackBox() {
//        System.out.println("기본 생성자 호출");
//        this.serialNumber = ++counter;
//        System.out.println("새로운 시리얼 넘버를 발급받았습니다. : " + this.serialNumber);
    }

    BlackBox(String modelName, String resoultion, int price, String color) {
//        this(); // 기본생성자 호출 기본 생성자를 바로 접근 , 위에 같은 색깔의 BlackBox 생성자 동작을 바로 실행
//
//        System.out.println("사용자 정의 생성자 호출");
//        this.modelName = modelName;
//        this.resoultion = resoultion;
//        this.price = price;
//        this.color = "블랙";
    }


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
    }

    static void callServiceCenter() {
        System.out.println("서비스 센터(1588-0000)로 연결합니다.");
        //(불가능) modelName = "test;  // 인스턴스 변수는 객체가 만들어져야 만들어지는 변수이기 때문에, static 메소드에서는 직접접근이 불가능하다.
        //(가능) canAutoReport = false;  // static으로 선언한 class 변수는 static 메소드에서 바로 사용할수 있다.

    }

    void appendModelName(String modelName) {
        this.modelName += modelName; // class가 가지고 있는 인스턴스 변수에 modelName을 명시하고 싶으면 this. 을 붙이면 됨. 그럼 class내 인스턴스 변수에 직접 접근하게 됨
        // this. 이 없는 modelName은 파라미터로 전달 받은 (String modelName)에서 modelName
    }

    // Getter & Setter
    // Getter 는 값을 가지고 오는 메소드
    // Setter 는 값을 설정하는 메소드
    String getModelName() {  // get으로 시작하는 getter
        return modelName;
    }

    void setModelName(String modelName) {  //(전달받는 값)  // set으로 시작하는 setter
        this.modelName = modelName;
    }

    String getResoultion() {
        if (resoultion == null || resoultion.isEmpty()) {
            return "판매자에게 문의하세요.";
        }
        return resoultion;  // resoultion 값이 없었어
    }

    void setResoultion(String resoultion) {
        this.resoultion = resoultion;
    }

    int getPrice() {
        return price;
    }

    void setPrice(int price) {
        if (price < 100000) {
            this.price = 100000;
        } else {
            this.price = price;
        }
    }
    String getColor(){
        return color;
    }
    void setColor(String color){
        this.color = color;
    }
}

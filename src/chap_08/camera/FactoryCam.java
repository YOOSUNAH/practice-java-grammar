package chap_08.camera;

public class FactoryCam extends Camera {  // Camera 클래스를 상속해야 하니 extends Camera를 적음
    // 메소드를 정의 implement methods 해야 한다고 알려줘서 그걸 클릭하니 아래처럼 만들어줌.
    @Override
    public void showMainFeature() {
        System.out.println("화재 감지");

    }
    // 화재 감지 메소드 정의
    public void detect(){
        System.out.println("화재를 감지합니다.");
    }

    public void report(){
        System.out.println("화재 신고를 진행합니다.");
    }
}

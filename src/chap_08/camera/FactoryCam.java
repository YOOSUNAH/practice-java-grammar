package chap_08.camera;

public class FactoryCam extends Camera {  // Camera 클래스를 상속해야 하니 extends Camera를 적음
    // 메소드를 정의 implement methods 해야 한다고 알려줘서 그걸 클릭하니 아래처럼 만들어줌.
    @Override
    public void showMainFeature() {
        System.out.println("화재 감지");

    }
}

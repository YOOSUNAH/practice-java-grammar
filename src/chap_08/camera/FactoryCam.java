package chap_08.camera;

import chap_08.dector.Detectable;
import chap_08.reporter.Reportable;

public class FactoryCam extends Camera implements Detectable, Reportable {  // Camera 클래스를 상속해야 하니 extends Camera를 적음
    // 메소드를 정의 implement methods 해야 한다고 알려줘서 그걸 클릭하니 아래처럼 만들어줌.
    private Detectable detector;
    private Reportable reporter; // 인터페이스 변수 만듦

    public void setDetector(Detectable detector) {
        this.detector = detector;
    }

    public void setReporter(Reportable reporter) {
        this.reporter = reporter;
    }

    @Override
    public void showMainFeature() {
        System.out.println("화재 감지");

    }

    @Override
    public void detect() {
        detector.detect();
    }

    @Override
    public void report() {
        reporter.report();
    }
    // 화재 감지 메소드 정의
//    public void detect(){
//        System.out.println("화재를 감지합니다.");
//    }
//
//    public void report(){
//        System.out.println("화재 신고를 진행합니다.");
//    }

    // Detectable , Reportable 인터페이스를 구현하도록 하기
    // Camera 클래스 뒤에 implements Detectable, Reportable 이걸 추가하기


}

package chap_08;

import chap_08.camera.FactoryCam;
import chap_08.dector.AdvancedFireDetector;
import chap_08.dector.Detectable;
import chap_08.dector.FireDetector;
import chap_08.reporter.NormalReporter;
import chap_08.reporter.Reportable;
import chap_08.reporter.VideoReporter;
// import chap_08.reporter.* 로 해도 됨 *은 모두 다 라는 뜻

public class _02_Interface {
    public static void main(String[] args) {
        // 인터페이스
        // 추상클래스는 미완성된 클래스, 인터페이스는 뼈대만 제공하는 구조.
        // 단일상속 (extends) : 부모를 하나만 가질 수 있다. -> 이걸 인터페이스로 해결 가능

        // 인터페이스
        Reportable normalReporter = new NormalReporter(); //인터페이스를 구현하는 모든 클래스들을 인터페이스 자체를 통해서 참조할수있다.
        normalReporter.report();  // 인터페이스 안에 있는 똑같은 report 메소드는 항상 구현되어 있음.

        Reportable videoReporter = new VideoReporter();
        videoReporter.report();
        // 메소드를 호출해봄

        System.out.println("----------------");

        // 객체를 만들어서 테스트 해보자
        Detectable fireDetector = new FireDetector();
        fireDetector.detect();

        Detectable advancedFireDetector = new AdvancedFireDetector();
        advancedFireDetector.detect();

        System.out.println("----------------");
        FactoryCam factoryCam = new FactoryCam();
        factoryCam.setDetector(fireDetector);
        factoryCam.setReporter(normalReporter);

        factoryCam.detect();
        factoryCam.report();
    }
}

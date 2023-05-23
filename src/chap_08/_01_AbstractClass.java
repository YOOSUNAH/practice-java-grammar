package chap_08;

import chap_08.camera.Camera;
import chap_08.camera.FactoryCam;
import chap_08.camera.SpeedCam;

public class _01_AbstractClass {
    public static void main(String[] args) {
        // 추상 클래스
        // 데이터 추상화 (Data Abstraction) _굳이 몰라도 되는 디테일은 숨기고, 꼭 필요한 정보만 공개하는 과정
        // abstract
        // 추상 클래스 (아직 완성되지 않은 클래스)_ 객체 생성 X, 상속받은 자식클래스는 객체 생성 O
        // 추상 메소드 (추상 클래스 또는 인터페이스에서 사용가능한, 껍데기만 있는 메소드)
        // 추상메소드가 추상클래스에 있으면, 자식클래스에서 추상메소드를 반드시 구현해야 함

        // Camera camera = new Camera(); // 객체를 만들려고 하는데, 추상클래스는 객체가 생성될 수 없음.

        // 추상클래스를 상속한 자식클래스인 FactoryCam에서는 객체를 만드는데 문제가 없음
        FactoryCam factoryCam = new FactoryCam(); // Camera factoryCam = new FactoryCam(); 로 해도 가능
        factoryCam.showMainFeature();

        SpeedCam speedCam = new SpeedCam(); // Camera speedCam = new SpeedCam(); 로 해도 가능
        speedCam.showMainFeature();


    }
}

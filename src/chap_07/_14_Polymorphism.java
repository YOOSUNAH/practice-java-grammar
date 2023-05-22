package chap_07;

import chap_07.camera.Camera;
import chap_07.camera.FactoryCam;
import chap_07.camera.SpeedCam;

public class _14_Polymorphism {
    public static void main(String[] args) {
        // 다형성

        // class Person : 사람
        // class Student extends Person : 학생 (학생은 사람이다. Student is a person)
        // person 이라는 부모클래스를 상속합니다.
        // class Teacher extends Person : 선생님 (선생님은 사람이다. Teacher is a person)

        Camera camera = new Camera();  // 부모 클래스는 부모클래스 객체

        //FactoryCam factoryCam = new FactoryCam();
        Camera factoryCam = new FactoryCam(); //부모 클래스인 Camera로 해도 가능
        // 부모 클래스(Camera)는 이 class를 상속하는 자식 클래스(FactoryCam) 객체(factoryCam)를 만들 수 있다.

        //SpeedCam speedCam = new SpeedCam();
        Camera speedCam = new SpeedCam();

        camera.showMainFeature();
        factoryCam.showMainFeature();
        speedCam.showMainFeature();

        System.out.println("--------------------");

        Camera[] cameras = new Camera[3]; // 3개의 크기를 가진 배열을 만들자
        cameras[0] = new Camera();
        cameras[1] = new FactoryCam();
        cameras[2] = new SpeedCam();

        for (Camera cam : cameras) {
            cam.showMainFeature();
        }

        System.out.println("------------------");
        // Camera라는 이름의 부모 클래스로 정의했기 때문에, 부모클래스에 있는 메소드만 접근할수있음.
        // 아래처럼 자식 클래스에 있는 건 바로 호출 할 수 없음. 이럴땐?
        // factoryCam.detectFire();
        // speedCam.checkSpeed();
        // speedCam.recognizeLicensePlate();

        if (camera instanceof Camera){
            System.out.println("카메라입니다.");
        }
        if (factoryCam instanceof FactoryCam){
            ((FactoryCam)factoryCam).detectFire(); // factoryCam 객체는 Factory클래스로 형변환
                                                   // (double)3; 3이라는 자료를 double 형태로 변환
        }

        if (speedCam instanceof SpeedCam){
            ((SpeedCam) speedCam).checkSpeed();
            // instance of 와 형변환을 통해 점 뒤에 쓴 접근하고 싶은 메소드에 접근 가능해짐
            ((SpeedCam)speedCam).recognizeLicensePlate();
        }

        // 우리도 모르게 Object를 상속하고 있다.
        // 기본적으로 자바에선 Object 클래스를 상속하고 있다.
        // 그래서 Object 배열을 쓰면, 어떤형태이든 간에 모든 클래스 객체를 집어넣을 수 있어, 한꺼번에 관리 할 수 있다.

//        Object[] objs = new Object[3];
//        objs[0] = new Camera();
//        objs[1] = new FactoryCam();
//        objs[2] = new SpeedCam();
    }
}

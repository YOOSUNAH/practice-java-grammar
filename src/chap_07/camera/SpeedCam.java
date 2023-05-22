package chap_07.camera;

public class SpeedCam extends Camera { // 자식 클래스


    public SpeedCam() {
        this.name = "과속단속 카메라";
    }



    public void checkSpeed() {
        // 속도 체크
        System.out.println("속도를 측정합니다.");
    }
    public void recognizeLicensePlate(){
        // 번호 인식
        System.out.println("차량 번호를 인식합니다.");
    }

    @Override // annotaion (주석)
    // 소스 코드를 컴퓨터가 알아 볼수있게 바꾸는 것 : 컴파일, 그 역할을 해주는 것 컴파일러
    // 컴파일러에게 이 메소드는 부모클래스의 메소드를 오버라이딩 하고 있다고 알려주는 것
    public void showMainFeature() {
        System.out.println(this.name + "의 주요 기능 : 속도 측정, 번호 인식");
    }
}

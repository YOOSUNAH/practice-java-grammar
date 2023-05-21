package chap_07.camera;

public class FactoryCam extends Camera { // 자식 클래스. 부모는 한개만 설정할수있음


    public FactoryCam(){
        this.name = "공장카메라";
    }


    public void detectFire(){
        // 화재 감지
        System.out.println("화재를 감지합니다.");
    }
}

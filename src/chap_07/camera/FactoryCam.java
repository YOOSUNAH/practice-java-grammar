package chap_07.camera;

public class FactoryCam extends Camera { // 자식 클래스. 부모는 한개만 설정할수있음


    public FactoryCam(){
        this.name = "공장카메라";
    }
// 부모클래스에 있는 name, 사진 촬영메소드, 동영상녹화는 상속받으니 삭제함

    public void detectFire(){
        // 화재 감지
        System.out.println("화재를 감지합니다.");
    }
    public void showMainFeature() {
        System.out.println(this.name + "의 주요 기능 : 화재 감지 ");
    // showMainReature메소드가 camera의 부모클래스인 이 메소드를 사용못하고, 메소드를 새롭게 재정의

    }
}

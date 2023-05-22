package chap_07.camera;


import jdk.jshell.execution.JdiExecutionControl;

// FactoryCam is a Camera.  (Is-A 관계)
public class FactoryCam extends Camera { // 자식 클래스. 부모는 한개만 설정할수있음


    public FactoryCam(){

        // this.name = "공장카메라";
        super("공장 카메라");
        // super() 부모클래스 생성자에 바로 접근하는 것
        //super. 부모클래스에 변수나 메소드에 접근하는것
    }
// 부모클래스에 있는 name, 사진 촬영메소드, 동영상녹화는 상속받으니 삭제함

    public void recordVideo() {
        super.recordVideo(); // 부모클래스에 있는 recordVideo 동작을 수행하고 나서
         detectFire(); // 거기다가 추가로, 자식 클래스에서 제공하는 화재감지 기능을 함께 수행
        // 부모클래스에서 recordVideo 메소드를 바꾼다고 해도,자식 클래스에서는 따로 무엇을 하지 않아도, 호출만 하면
        // 변경된 내용이 적용됨
    }

    public void detectFire(){
        // 화재 감지
        System.out.println("화재를 감지합니다.");
    }
    public void showMainFeature() {
        System.out.println(this.name + "의 주요 기능 : 화재 감지 ");
    // showMainReature메소드가 camera의 부모클래스인 이 메소드를 사용못하고, 메소드를 새롭게 재정의

    }
}

package chap_08.camera;

public abstract class Camera {  //abstract 을 넣음_ Camera라고 하는 추상 클래스가 만들어짐.
                                //abstract을 넣어서 객체를 못 만들게 할 수도 있다.
    public void takePicture(){
        System.out.println("사진을 촬영합니다.");
    }
    public void recordVideo(){
        System.out.println("동영상을 녹화합니다.");
    }


    //추상 메소드 정의 _주요기능을 출력해주는 메소드 만들기
    // 추상메소드는 이름만 적어주고, 메소드를 선언만 함
    // Camera라는 클래스를 상속하는 자식클래스에서 아래 showMainFeature메소드를 구현하도록 해줌
    public abstract void showMainFeature(); // 구현해야 하는 메소드


}

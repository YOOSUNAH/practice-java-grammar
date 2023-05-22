package chap_07.camera;

public class Camera { // 부모 클래스
    public String name;

    public Camera() {
        this("카메라");
    }
    protected Camera(String name){ // 같은 패키지 내에서 접근 가능, 다른 패키지에서는 자식클래스에서 접근 할 수있다.
        this.name = name;
    }

    public void takePicture() {
        // 사진 촬영 메소드
        System.out.println(this.name + " : 사진을 촬영합니다.");
    }

    public void recordVideo() {
        // 동영상 녹화
        System.out.println(this.name + " : 동영상을 녹화합니다.");
    }

    public void showMainFeature() {
        System.out.println(this.name + "의 주요 기능 : 사진 촬영, 동영상 녹화 ");


    }
}

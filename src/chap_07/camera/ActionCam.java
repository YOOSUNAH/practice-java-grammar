package chap_07.camera;

public final class ActionCam extends Camera { //final을 추가하면 이 ActionCam 클래스를 아예 상속능 수 없다.
    public String lens = "광각렌즈";

    public ActionCam() {
        super("액션 카메라");
    }

    public final void makeVideo() { // final을 추가하면, 자식클래스에서는 오버라이딩을 할수가 없다.
        System.out.println(this.name + " : " + this.lens + "로 촬영한 영상을 통해 멋진 비디오를 제작합니다. ");
    } // 무조건 이걸 써야 하는경우에는 final 키워드를 쓸 수 있다.
}

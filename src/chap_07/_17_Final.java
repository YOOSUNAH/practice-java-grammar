package chap_07;

import chap_07.camera.ActionCam;
import chap_07.camera.SlowActionCam;

public class _17_Final {
    public static void main(String[] args) {
        //Final
        // (상수 공부시) 어떤 변수를 final로 선언하면 선언과 동시에 사용하고, 이후에 값 사용은 가능, 값 변경은 불가능.

        // final 역할
        // class,변수,메소드 앞에 final을 붙여서 오버라이딩을 못하게 하고, 값도 못고치게 하고, class를 상속할수없도록 한다.
        // 위치
        // public (final) class ...
        // public (final) void ...
        // public > abstract > static > final > ...

        ActionCam actionCam = new ActionCam();
        //actionCam.lens = "표준렌즈";
        actionCam.recordVideo();
        actionCam.makeVideo();

        System.out.println("--------------------");

        SlowActionCam slowActionCam = new SlowActionCam();
        slowActionCam.makeVideo();




    }
}

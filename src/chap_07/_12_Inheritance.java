package chap_07;

import chap_07.camera.Camera;
import chap_07.camera.FactoryCam;
import chap_07.camera.SpeedCam;

public class _12_Inheritance {
    public static void main(String[] args) {
        // 상속
        Camera camera = new Camera();
        FactoryCam factorycam = new FactoryCam();
        SpeedCam speedCam = new SpeedCam();

        System.out.println(camera.name);
        System.out.println(factorycam.name);
        System.out.println(speedCam.name);

        camera.takePicture();
        factorycam.recordVideo();
        speedCam.takePicture();

        factorycam.detectFire();
        speedCam.checkSpeed();
        speedCam.recognizeLicensePlate();


    }
}

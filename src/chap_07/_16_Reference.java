package chap_07;

import chap_07.camera.Camera;

public class _16_Reference {
    public static void main(String[] args) {
        // 참조
        // 기본 자료형 (Primitive Data Types) : int, float, double, long, boolean, ...
        // 따로 값을 지정하지 않아도, 0 이나 0.0같은 기본 값을 항상 가지게 됨
        // 메소드를 가지지 않는다.
        // 소문자로 시작
        int[] i = new int[3];
        System.out.println(i[0]); // 0
        // i[0]. 까지 작성하면 메소드가 안 뜬다. => 기본 자료형은 메소드를 가지지 않는다.
        double[] d = new double[3];
        System.out.println(d[0]); // 0.0

        // 참조 자료형 (Non-Primitive, Reference Data Types) : String, (사용자 정의클래로 부터 만들어진 객체들) Camera, FactoryCam, SpeedCam, ...
        // 따로 값을 지정하지 않으면 null이 들어감.
        // 메소드를 가질 수도 있다.
        // 대문자로 시작
        String[] s = new String[3];
        System.out.println(s[0]); // null

        Camera[] c = new Camera[3];
        System.out.println(c[0] == null); // null    (true 면 null)
        // c[0]. 뒤에 메소드가 뜬다. => 참조 자료형은 메소드를 가질 수도 있다.

        ///////////////////////////////
        System.out.println("--------------");
        int a = 10;
        int b = 20;
        b = a;
        System.out.println(a);
        System.out.println(b);
        b = 30;
        System.out.println(a);
        System.out.println(b);
        // a와 b는 서로 상관없음. 서로 별도로 움직임

        System.out.println("--------------");
        Camera c1 = new Camera();
        Camera c2 = new Camera();
        c1.name = "카메라1";
        c2.name = "카메라2";
        System.out.println(c1.name);
        System.out.println(c2.name);
        c2 = c1;  // c1의 값을 복사해서 c2에 넣어주는게 아니고, c1이 참조하고있는 내용을 c2도 참조하게 해줌.
        System.out.println(c1.name);
        System.out.println(c2.name);
        c2.name = "고장난 카메라";
        System.out.println(c1.name);
        System.out.println(c2.name);
        System.out.println("-----------------");
        // c2라는 객체는 어딘가에 만들어진 걸 참조만 해, new Camera() 를 풍선이라 생각하면 그걸 손을 뻗어서 잡고있음.
        // c2에 c1에 넣으면, c1이 가리키는 풍선(new Camera())을 c2도 함께 가리키게 됨.
        // 이게 바로 참조임.
        // 가리키는 대상이 달라짐 중요!
        changeName(c2);
        System.out.println(c1.name);
        System.out.println(c2.name);

        c2 = null; // 벗어나는 법
       // System.out.println(c2.name); 출력하려 하면 NullPointerException 문제 발생
    }

    public static void changeName(Camera camera) {
        camera.name = "잘못된 카메라";


    }
}

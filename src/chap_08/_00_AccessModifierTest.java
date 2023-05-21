package chap_08;


import chap_07.BlackBoxRefurbish;
// chap_07이라는 다른패키지에 있는 BlackBoxRefurbish라는 class를 사용하겠다
// imort chap_07.*;  //이렇게 점*을 붙이면 chap_07에 있는 모든 class를 갔다 쓰겠다

public class _00_AccessModifierTest {
    public static void main(String[] args) {
        BlackBoxRefurbish b1 = new BlackBoxRefurbish();
        b1.modelName = "까망이"; // public. 만 접근 가
        // b1.getResoultion = "FHd"; // default 는 같은 패키지 내에서만 접근 가능, 패키지가 달라 접근 불가능
        // b1.getPrice = 200000; // private. 도 사용 불가능
        // b1.color ="블랙"; // protected. 같은 패키지 내에서, 다른 패키지인 경우 자식 클래스에서 접근 가능



    }
}

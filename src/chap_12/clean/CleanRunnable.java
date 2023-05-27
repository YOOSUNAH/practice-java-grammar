package chap_12.clean;

public class CleanRunnable implements  Runnable{

    //Runnable 이라는 인터페이스를 구현_여러번 구현 가능 _다중상속개념가능
    @Override
    public void run() {
        System.out.println("-- 직원 청소 시작 (Runnable) --");
        for (int i = 2; i <= 10; i+= 2){
            System.out.println("(직원) " + i + "번방 청소 중");
        }
        System.out.println("-- 직원 청소 끝 (Runnable)  --");
    }
}

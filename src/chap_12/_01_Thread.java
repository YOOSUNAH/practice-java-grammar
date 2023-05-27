package chap_12;

import chap_12.clean.CleanThread;

public class _01_Thread {
    public static void main(String[] args) {
        // 하나의 프로세스 (Process)
        // 쓰레드 (Thread)
        // 프로그램을 실행하면, 실행되어 돌아가고 있는 상태를 프로세스 라 한다.
        // 프로세스의 자원을 활용해서 실제로 작업을 수행하는 것 쓰레드라고 함.
        // 쓰레드르 쓰기 위해서는 쓰레드라 클래스를 상속해야함

        // 1 3 5 7 9
        // 2 4 6 8 10

//        cleanBySelf();
        CleanThread cleanThread = new CleanThread(); //먼저 객체를 만들고
//        cleanThread.run(); // 직원 청소_메소드 호출  -> 이렇게 직접 호출하면 직원과 사장이 동시에 청소가 아니라,  직원 청소 다하고, 사장 청소 다하고.
        cleanThread.start(); // start라는 메소드를 호출해야, 이 과정에서 새로운 thread를 만들어서
                             // cleanThread 내에 run 메소드가 돌아가게 되고
                            // 원래가지고 있던 메인 thread 내에서 이 작업을 함

        cleanByBoss(); // 사장 청소_메소드 호출

    }

    public static void cleanBySelf() {
        System.out.println("-- 혼자 청소 시작 --");
        for (int i = 1; i <= 10; i++) {
            System.out.println("(혼자) " + i + "번방 청소 중");
        }
        System.out.println("-- 혼자 청소 끝  --");
    }

    public static void cleanByBoss() {
        System.out.println("-- 사장 청소 시작 --");
        for (int i = 1; i <= 10; i += 2) {
            System.out.println("(사장) " + i + "번방 청소 중");
        }
        System.out.println("-- 사장 청소 끝  --");
    }
}

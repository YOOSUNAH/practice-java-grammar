package chap_04;

public class _06_While {
    public static void main(String[] args) {
        //반복문 While
        //팔벌려 뛰기 10회 시작 ->for 문
        //반복문 while <-수영장 레일 25미터 발차기 몇번? 횟수가 사람마다 다름, 25미터 다 다를 떄까지
        //수영장에서 수영을 하는 모습
        int distance = 25; // 전체 거리 25m
        int move = 0; // 현재 이동 거리 0m
       // while(조건){}
        while(move < distance){ //현재 이동거리가 전체 거리보다 작다는 조건이 참인 동안 반복 수행
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리 : " + move);
            move += 3; //3미터 이동  //이게 없으면 무한루프가 됨 move가 계속 0이니깐
        }
        System.out.println("도착 하였습니다.");

        //무한 루프
        move = 0;
        while(move < distance){ //현재 이동거리가 전체 거리보다 작다는 조건이 참인 동안 반복 수행
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리 : " + move);
        }
        System.out.println("도착 하였습니다.");
    }
}

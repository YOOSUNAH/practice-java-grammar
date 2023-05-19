package chap_06;

public class _06_WhenToUse {
    public static int getPower(int number){
        return getPower(number, 2);
    }
    public static int getPower(int number, int exponent){
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }
    public static void main(String[] args) {
        // 메소드가 필요한 이유
        // 같은 동작을 하는데, 활용되는 값만 일부 다른 경우에, 메소드를 만들면 코드의 중복을 줄일 수 있다.

        // 2의 2승을 구하기
        System.out.println(getPower(2, 2)); // 2 * 2 = 4

        // 3의 3승을 구하기
        System.out.println(getPower(3,3)); // 3 * 3 * 3 = 27

        // 4의 2승을 구하기
        System.out.println(getPower(4,2)); // 4 * 4 = 16


    }
}

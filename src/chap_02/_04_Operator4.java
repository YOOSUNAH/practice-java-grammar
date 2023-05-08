package chap_02;

public class _04_Operator4 {
    public static void main(String[] args) {
        //논리 연산자
        boolean 김치찌개 = true;
        boolean 계란말이 = true;
        boolean 제육볶음 = true;

        System.out.println(김치찌개 || 계란말이 || 제육볶음); // or. 하나라도 true이면 true (괜찮은 식당)
        System.out.println(김치찌개 && 계란말이 && 제육볶음); // and. 모두 true이명 true (최고의식당)

        //And 연산
        System.out.println((5>3) && (3 > 1)); //두 식이 모두 true이면 true. 5는 3보다 크고, 3은 1보다 크다 를 맞는지 보는 것 (true)
        System.out.println((5 > 3) && (3 < 1)); // 5는 3보다 크고, 3은 1보다 작다 (false),뒤에는 틀려서 false
        //Or 연산
        System.out.println((5 > 3) || (3 > 1)); //5는 3보다 크거나, 3은 1보다 크다 (true)
        System.out.println((5 > 3) || (3 < 1)); //5는 3보다 크거나, 3은 1보다 작다 (true)  하나라도true라면 true
        System.out.println((5 < 3) || (3 < 1)); //5는 3보다 작거나, 3은 1보다 작다 (false) 둘다 false이니 false

       // System.out.println(1 < 3 < 5); 불가능한 코드

       //논리 부정 연산자
        System.out.println(!true); // false. true의 반대 값
        System.out.println(!false); //true
        System.out.println(!(5 == 5)); //false. true(5는 5와 같다)의 반대인 false가 나옴
        System.out.println(!(5 == 3)); //true. false(5는 3과 같다)의 반대인 true 가 나옴.
    }
}



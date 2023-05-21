package chap_07;

import java.util.Random;

public class _11_Package {
    public static void main(String[] args) {
        // 패키지 (랜덤 클래스) // 패키지: 어떤 폴더 구조, 자바 클래스들을 비슷한 것들끼리 정리해주는 하나의 폴더
        Random random = new Random();
        System.out.println("랜덤 정수 : " +  random.nextInt()); // int의 범위 내에서 정수형 값 반환 (음수도 포함)
        System.out.println("랜덤 정수 (범위) : " + random.nextInt(10)); // 0 이상 10 미만의 정수형 값
        System.out.println("랜덤 실수 : " + random.nextDouble()); // 0.0이상 1.0미만의 실수값
        //System.out.println("랜덤 실수 (범위) : " + random.nextDouble(10.0)); // 못씀

        // 만약 5.0 이상 10.0 미만의 실수를 뽑으려면?
        double min = 5.0;
        double max = 10.0;
        System.out.println("랜덤 실수 (범위) : " + (min + max - min)* random.nextDouble());

        System.out.println("랜덤 boolean : " + random.nextBoolean());

        // 로또 번호를 랜덤으로 뽑으려면? 1 ~ 45
        System.out.println("로또번호 : " + (random.nextInt(45) + 1));
        // nextInt(45) : 0 이상 45 미만의 수
        // nextInt(45) + 1 : 1 이상 46 미만의 수 = 1 이상 45 이하의 수

        // 랜덤 외에도 여러 가지 클래스가 제공된다.
        // Math(수학계산관련), Scanner(사용자로부터입력을받아오는),
        // (문자열 관련) StringBuilder, StringBuffer, StringTokenizer
        // BigInteger(큰수 연산), BigDecimal(오차없는 실수 계산)
        // LocalDate(날짜관련클래스), LocalTime, LocalDateTime, DateTimeFormatter(날짜 포맷을 지정하는), ...
    }
}

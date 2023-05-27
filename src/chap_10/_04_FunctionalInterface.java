package chap_10;

import chap_10.converter.*;

public class _04_FunctionalInterface {
    public static void main(String[] args) {
        KRWConverter converter = new KRWConverter();
        // converter.convert(2);

        // convertUSD((USD) -> System.out.println(USD + " 달러 = " + (USD * 1400) + "원"), 1);

        //interface -> 이런 인터페이스를 함수형인터페이스라고 함
        //인터페이스 조건: 딱 하나의 추상 메소드가 존재해야 한다.
        // (함수: 클래스 밖에서 기능을 하는 것)
        // (매소드: 클래스 내에서 기능들을 하는 것)
        Convertible convertible = (USD) -> System.out.println(USD + " 달러 = " + (USD * 1400) + " 원");
        convertUSD(convertible, 2);

        // 전달값이 하나도 없다면?
        ConvertibleWithNoParams c1 = () -> System.out.println("1 달러 = 1400 원");
        c1.convert();

        // 두 줄 이상의 코드가 있다면? { } 안에 두면 됨
        c1 = () -> {
            int USD = 5;
            int KRW = 1400;
            System.out.println(USD + " 달러 = " + (USD * KRW) + " 원");
        };
        c1.convert();

        // 전달값이 2개인 경우?
        //  달러를 뜻하는 d, 원을 뜻하는 w _ (USD, KRW) 해도 됨
        ConvertibleWithTwoParams c2 = (d, w) -> System.out.println(d + " 달러 = " + (d * w) + " 원");
        c2.convert(10,1400);

        // 반환값이 있는 경우?
        ConvertibleWithReturn c3 = (d, w) ->  d * w;
       int result = c3.convert(20,1400);
        System.out.println("20 달러 = " + result + " 원" );

    }
    public static void convertUSD(Convertible converter, int USD) {
        converter.convert(USD);

    }
}
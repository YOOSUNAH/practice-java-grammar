package chap_10.converter;

@FunctionalInterface
//인터페이스 조건: 딱 하나의 추상 메소드가 존재해야 한다.
// 실수로 추상메소드를 더 만들지 않기 위해서 @FunctionalInterface작성해둠
public interface Convertible {
    void convert(int USD);


}

package chap_09;

public class _03_WrapperClass {
    public static void main(String[] args) {
        // 래퍼(Wrapper) 클래스
        // int double float char 와 같은 기본 자료형을 객체형태로 만들어서 사용할 수 있게 해둠
        // int -> Integer
        // float -> Float
        // char -> Character
        // double -> Double

        Integer i = 123; // int i = 123;
        Double d = 1.0; // double d = 1.0;
        Character c = 'A'; // char c = 'A'
        System.out.println(i);
        System.out.println(d);
        System.out.println(c);

        System.out.println("----------------");

        System.out.println(i.intValue());
        System.out.println(d.intValue()); //실수를 int로 바꿔서 형변환된 데이터를 볼 수 있음
        System.out.println(c.charValue());

        System.out.println("----------------");
        String s = i.toString(); // 정수로 되어있던 걸 문자로 바꿔서 s 에 넣어준다
        System.out.println(s);

    }
}

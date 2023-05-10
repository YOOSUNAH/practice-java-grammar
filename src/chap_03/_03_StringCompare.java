package chap_03;

public class _03_StringCompare {
    public static void main(String[] args) {
        //문자열 비교
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals("Java"));//문자열 내용이 같으면 true, 다르면 false
        //s1데이터와 괄호 속 데이터가 같은지 비교

        System.out.println(s2.equals("python"));
        //대소문자 구분하기 때문에 false

        System.out.println(s2.equalsIgnoreCase("python")); //true
        //대소문자 구분 없이 문자열 내용이 같은지 여부를 체크

        //문자열 비교 심화
        s1 = "1234"; //벽에 붙은 메모지의 비밀번호 정보 (참조)
        s2 = "1234";
        System.out.println(s1.equals(s2)); //true. (내용)을 비교
        System.out.println(s1 == s2); //true. (참조)를 비교

        s1 = new String("1234");  //메모지 1
        s2 = new String("1234");  //메모지 2
        System.out.println(s1.equals(s2)); //true
        System.out.println(s1 == s2); //false.
        //



    }
}

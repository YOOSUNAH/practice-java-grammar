package chap_03;

public class _04_EscapeSequence {
    public static void main(String[] args) {
        //특수문자, 이스케이프 문자 (Escape Sequence, Escape Character, Special Character)
        // \n \t \\ \" \'
        System.out.println("자바가");
        System.out.println("너무");
        System.out.println("재밌어요");

        // \n : 줄바꿈
        System.out.println("자바가\n너무\n재밌어요");
        // \t : 탭
        // 해물파전		9000원
        // 김치전		8000원
        // 부추전		8000원
        System.out.println("해물파전\t\t9000원");
        System.out.println("김치전\t\t8000원");
        System.out.println("부추전\t\t8000원");
        // \\: 역슬래시 (두번 적어야 한개로 인식함). 폴더경로나 파일같은걸 표현할때 역슬래시 두번써야 한다.
        System.out.println("C:\\Program Files\\Java"); //C:\Program Files\Java

        // \" : 큰따옴표
        // 단비가 "냐옹" 이라고 했어요
        System.out.println("단비가 \"냐옹\" 이라고 했어요");

        // \' : 작은따옴표  (특수문자가 되어서 나옴)
        // 단비가 '뭘 봐?' 라는 표정을 지었어요
        System.out.println("단비가 \'뭘 봐?\' 라는 표정을 지었어요");
        System.out.println("단비가 '뭘 봐?' 라는 표정을 지었어요");
        // 작은따온표만 써도 문제 없다. 그럼 언제 필요할까?

        // 하나의 문자를 저장하는 자료형인 char에 작은따옴표라는 한글자만 넣고싶을때
        char c = 'A';
        c = '\'';
        System.out.println(c);


    }
}

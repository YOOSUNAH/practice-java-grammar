package chap_01;

public class _07_TypeCasting {
    public static void main(String[] args) {
        //형변환 TypeCasting
        //정수형에서 실수형으로
        //실수형에서 정수형으로

        //int to float, double
        int score = 93;
        System.out.println(score); //93
        System.out.println((float)score); //93.0
        System.out.println((double)score); //93.0

        //float , double to int
        float score_f = 93.3F;
        double score_d = 98.8;
        System.out.println((int)score_f);  //93
        System.out.println((int)score_d);  //98

        //정수 + 실수 연산
        score = 93 + (int)98.8; //93+98
        System.out.println(score); //191

        score_d = (double)93 + 98.8; // 93.0 + 98.8
        System.out.println(score_d);

        //변수에 형변환된 데이터 집어넣기
        double convertedScoreDouble = score; //191 -> 191.0 정수형 데이터가 자동으로 형변환이 됨.
        //int -> long -> float -> double 점점 커지는 범위로 갈때는 자동으로 형변환 됨

        int convertedScoreInt = (int)score_d; // 191.8 ->191
        //double -> float -> long -> int  (수동으로 형변환 해줘야함)

        //숫자를 문자열로
        String s1 = String.valueOf(93);
        //String이라는 class가 제공해주는 valueOf라는 기능으로 93을 문자열로 바꿔준다.
        s1 = Integer.toString(93);//integer로 바꾸는 방법
        System.out.println(s1); //93

        //실수
        String s2 = String.valueOf(98.8); //첫번째방법 String.valueOf
        s2 = Double.toString(98.8);  //두번째 방법
        System.out.println(s2); //98.8

        //문자열을 숫자로
        int i = Integer.parseInt("93");
        System.out.println(i); //93

        double d = Double.parseDouble("98.8");
        System.out.println(d); // 98.8

        //괄호 속에 데이터가 올바른 정수나 실수가 아닐 때
       // int error = Integer.parseInt("자바"); //오류뜸


    }
}

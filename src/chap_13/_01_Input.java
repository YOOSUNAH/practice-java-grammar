package chap_13;

import java.util.Scanner;

public class _01_Input {
    public static void main(String[] args) {
        // 사용자 입력
        Scanner sc = new Scanner(System.in);
//        System.out.println("이름을 입력하세요");
//        String name = sc.next();  // sc.next() 를 통해 사용자로 부터 입력받은 값을 String 형태로 name에 넣는다.
//        System.out.println("혈액형을 입력하세요");
//        String bloodType = sc.next();
//        System.out.println("키를 입력하세요");
//        // int height = Integer.parseInt(sc.next()); //sc.next()는 항상 string으로 반환해줌
//        // 그래서 Integer.parseInt()로 바꿔줘야함.
//        int height = sc.nextInt(); // 정수형 값으로 입력받고 싶다. -> 반드시 정수값으로 입력받아야 한다.
//        System.out.println("몸무게를 입력하세요");
//       // double weight = Double.parseDouble(sc.next());
//        double weight = sc.nextDouble();
//
//        System.out.println("입력하신 정보는 다음과 같습니다.");
//        System.out.println("이름 : " + name);
//        System.out.println("혈액형 : " + bloodType);
//        System.out.println("키 : " + height);
//        System.out.println("몸무게 : " + weight);


        System.out.println("무슨 프로그래밍 언어를 배웠나요?");
        String lang = sc.next(); // 한 단어 (자바)
//       String lang = sc.nextLine(); // 한 줄
        System.out.println("언어 : " + lang);

        sc.nextLine(); // 불필요한 문장을 삭제하는 처리를 함 _"자바를 배웠어요" 치면 "배웠어요"가 삭제

        System.out.println("배우고 나니 기분이 어땠나요?");
        String feeling = sc.next();  // 한 문장 (재밌었어요)
//        String feeling = sc.nextLine();
        System.out.println("기분 : " + feeling);



    }
}

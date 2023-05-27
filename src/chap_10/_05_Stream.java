package chap_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _05_Stream {
    public static void main(String[] args) {
        // 스트림_ 한번 쓰고 난 스트림은 재사용 불가, 매번 데이터를 준비한 상태에서 새롭게 필터링한다고 생각하기
        // 스트림 생성

        // (1) Array.stream()
        int[] scores = {100, 95, 90, 85, 80};
        IntStream scoreStream = Arrays.stream(scores); // Arrays.stream(scores); 에서 stream에 커서 두고 cm+op +v

        String[] langs = {"python", "java", "javascript", "c", "c++", "c#"};
        Stream<String> langstream = Arrays.stream(langs); //Arrays.stream(langs); 에서 stream에 커서 두고 cm+op +v

        // (2) Collection.stream() _ 컬렉션 List 이용
        List<String> langList = new ArrayList<>();
//         langList.add("python");
//         langList.add("java");
        langList = Arrays.asList("python", "java", "javascript", "c", "c++", "c#");
//        System.out.println(langList.size());
        //컬렉션에서 스트림 만들기
        Stream<String> langListstream = langList.stream(); // langList.stream(); 에서 stream에 커서 두고 cm+op +v

        // (3) Stream.of()
        // ()괄호 안에 값들을 가지는 스트림이 만들어짐
        // Stream.of("python", "java", "javascript", "c", "c++", "c#"); 에서 stream에 커서 두고 cm+op +v
        Stream<String> langListOfStream = Stream.of("python", "java", "javascript", "c", "c++", "c#");

        // 스트림 사용
        // 중간 연산 (Intermediate Operation) : filter, map, sorted, distinct, skip..._갯수 제한없이 여러번 쓸수 있음
        // 최종 연산 (Terminal Operation) : count, min, max, sum, forEach, anyMatch, allMatch..._ 딱한번만 사용가능

        // 90점 이상인 점수만 출력
        Arrays.stream(scores).filter(x -> x >= 90).forEach(x -> System.out.println(x));
        // Arrays.stream(scores).filter(x -> x >= 90).forEach(System.out::println); // 위 코드와 결과 동일
        System.out.println("---------------------");

        // 90점 이상인 사람의 수
        // Arrays.stream(scores).filter(x -> x >= 90).count()
        //count가 long으로 받아서 아래 두가지 방법으로 가능
        // long count = Arrays.stream(scores).filter(x -> x >= 90).count()
        int count = (int) Arrays.stream(scores).filter(x -> x >= 90).count();
        System.out.println(count);
        System.out.println("---------------------");

        // 90점 이상인 점수들의 합
        // Arrays.stream(scores).filter(x -> x >= 90).sum(); // sum 은 int로 받으니
        int sum = Arrays.stream(scores).filter(x -> x >= 90).sum();
        System.out.println(sum);
        System.out.println("---------------------");

        // 90점 이상인 점수들을 정렬 (sorted)   _sout c : System.out::println
        Arrays.stream(scores).filter(x -> x >= 90).sorted().forEach(System.out::println);
        System.out.println("---------------------");

        // "python", "java", "javascript", "c", "c++", "c#"
        // c로 시작하는 프로그래밍 언어
        Arrays.stream(langs).filter(x -> x.startsWith("c")).forEach(System.out::println);
        System.out.println("---------------------");

        // java 라는 글자를 포함하는 언어
        Arrays.stream(langs).filter(x -> x.contains("java")).forEach(System.out::println);
        System.out.println("---------------------");

        // 4글자 이하의 언어를 정렬해서 출력
        langList.stream().filter(x -> x.length() <= 4).sorted().forEach(System.out::println);
        System.out.println("---------------------");

        // 4글자 이하의 언어 중에서 c라는 글자를 포함하는 언어
        langList.stream()
                .filter(x -> x.length() <= 4)
                .filter(x -> x.contains("c"))
                .forEach(System.out::println);
        System.out.println("---------------------");

        // 4글자 이하의 언어 중에서 c라는 글자를 포함하는 언어가 하나라도 있는지 여부 (anyMatch)
        boolean anyMatch = langList.stream()
                .filter(x -> x.length() <= 4)
                .anyMatch(x -> x.contains("c")); // anyMatch는 boolean이라서 boolean anyMatch = 앞에 추가함
        System.out.println(anyMatch);      // true
        System.out.println("---------------------");

        // 4글자 이하의 언어들은 모두 c라는 글자를 포함하는지 여부
        boolean allMatch = langList.stream()
                .filter(x -> x.length() <= 4)  // 길이를 3이하로 바꾸면 true로 나옴
                .allMatch(x -> x.contains("c"));  //allmatch
        System.out.println(allMatch);     // false
        System.out.println("---------------------");

        // 4글자 이하의 언어 중에서 c라는 글자를 포함하는 언어 뒤에 (어려워요) 라는 글자를 함께 출력
        // map _ 사용하는 데이터를 원하는 형태로 가공하거나,
        // (그 데이터 중에서 객체라고 하면)객체 중에서 내가 꺼내고 싶은 어떤 인스턴스 변수를 지정해주는 역할을 함
        langList.stream()
                .filter(x -> x.length() <= 4)
                .filter(x -> x.contains("c"))
                .map(x -> x + "(어려워요)")
                .forEach(System.out::println);
        System.out.println("---------------------");

        // c라는 글자를 포함하는 언어를 대문자로 출력
        langList.stream()
                .filter(x -> x.contains("c"))
                .map(String::toUpperCase)
                .forEach(System.out::println);
        System.out.println("---------------------");

        // c라는 글자를 포함하는 언어를 대문자로 변경하여 리스트로 저장
//        langList.stream()
//                .filter(x -> x.contains("c"))
//                .map(String::toUpperCase)
//                .collect(Collectors.toList()); ->여기서 collect 에다가 cm + op + v
        //아래처럼 List<String>된 이름은 변경함
        List<String> langListStartWithC = langList.stream()
                .filter(x -> x.contains("c"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        langListStartWithC.stream().forEach(System.out::println);


    }
}

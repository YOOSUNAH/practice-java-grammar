package chap_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _05_Stream {
    public static void main(String[] args) {
        // 스트림

        // (1) Array.stream()
        int[] scores = {100, 95, 90, 85, 80};
        IntStream scoreStream = Arrays.stream(scores); // Arrays.stream(scores); 에서 stream에 커서 두고 cm+op +v

        String[] langs = {"python", "java", "javascript", "c", "c++", "c#"};
        Stream<String>langstream = Arrays.stream(langs); //Arrays.stream(langs); 에서 stream에 커서 두고 cm+op +v

        // (2) Collection.stream() _ 컬렉션 List 이용
        List<String> langList = new ArrayList<>();
//         langList.add("python");
//         langList.add("java");
        langList = Arrays.asList("python", "java", "javascript", "c", "c++", "c#");
        System.out.println(langList.size());
        //컬렉션에서 스트림 만들기
        Stream<String> langListstream = langList.stream(); // langList.stream(); 에서 stream에 커서 두고 cm+op +v

        // (3) Stream.of()
        // ()괄호 안에 값들을 가지는 스트림이 만들어짐
        // Stream.of("python", "java", "javascript", "c", "c++", "c#"); 에서 stream에 커서 두고 cm+op +v
        Stream<String> langListOfStream = Stream.of("python", "java", "javascript", "c", "c++", "c#");

    }
}

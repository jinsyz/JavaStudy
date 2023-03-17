package chap_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _05_Stream {
    public static void main(String[] args) {
        //스트림
        int[] scores = {100, 95, 90, 85, 80};
        IntStream scoreStream = Arrays.stream(scores);

        String[] langs = {"python", "java", "javascript", "c", "c++", "c#"};
        Stream<String> langStream = Arrays.stream(langs);

        List<String> langList = new ArrayList<>();
        langList = Arrays.asList("python", "java", "javascript", "c", "c++", "c#");
        Stream<String> langListStream = langList.stream();

        Stream<String> langListOfStream = Stream.of("python", "java", "javascript", "c", "c++", "c#");

        //스트림 사용
        //중간 연산
        //최종 연산

        Arrays.stream(scores).filter(x -> x >= 90).forEach(x -> System.out.println(x));
        Arrays.stream(scores).filter(x -> x >= 90).forEach(System.out::println);

        int count = (int)Arrays.stream(scores).filter(x -> x>=90).count();
        System.out.println(count);

        int sum = Arrays.stream(scores).filter(x -> x >= 90).sum();
        System.out.println(sum);

        Arrays.stream(scores).filter(x -> x >= 90).sorted().forEach(System.out::println);

        Arrays.stream(langs).filter(x -> x.startsWith("c")).forEach(System.out::println);

        Arrays.stream(langs).filter(x -> x.contains("java")).forEach(System.out::println);

        langList.stream().filter(x -> x.length() <=4).sorted().forEach(System.out::println);

        langList.stream().filter(x -> x.length() <=4).filter(x-> x.contains("c")).forEach(System.out::println);

        boolean anyMatch = langList.stream().filter(x -> x.length() <=4).anyMatch(x -> x.contains("c"));
        System.out.println(anyMatch);

        boolean allMatch = langList.stream().filter(x -> x.length() <=4).allMatch(x -> x.contains("c"));
        System.out.println(allMatch);

        langList.stream().filter(x -> x.length() <=4).filter(x -> x.contains("c")).map(x -> x + " 어려워요").forEach(System.out::println);
        langList.stream().filter(x -> x.contains("c")).map(String::toUpperCase).forEach(System.out::println);

    }
}

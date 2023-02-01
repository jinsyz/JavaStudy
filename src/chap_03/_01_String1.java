package chap_03;

import java.util.Locale;

public class _01_String1 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";
        System.out.println(s);

        System.out.println(s.length());

        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());

        System.out.println(s.contains("Java")); //포함되면 true 아노디면 false
        System.out.println(s.contains("C++"));
        System.out.println(s.indexOf("Java")); // 처음으로 위치한 정보 확인
        System.out.println(s.indexOf("C++")); // 없으면 -1 반환
        System.out.println(s.lastIndexOf("and")); // 마지막으로 위치한 위치 정보
        System.out.println(s.startsWith("I like")); // 이 문자열로 시작하면 true 그렇지 않으면 false
        System.out.println(s.endsWith("."));
    }
}

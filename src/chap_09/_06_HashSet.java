package chap_09;

import java.util.HashSet;

public class _06_HashSet {
    public static void main(String[] args) {
        //세트 , 중복 허용 x, 순서 보장 x
        HashSet<String> set = new HashSet<>();
        set.add("삼겹살");
        set.add("쌈장");
        set.add("음료");
        set.add("소금");
        set.add("후추");
        set.add("삼겹살");
        set.add("깻잎");
        set.add("삼겹살");

        System.out.println(set.size());

        for (String s: set) {
            System.out.println(s);
        }

        System.out.println("--------------");

        if(set.contains("삼겹살")){
            System.out.println("삼겹살 사러 출발");
        }

        System.out.println("---------------");
        set.remove("삼겹살");
        System.out.println(set.size());

        set.clear();
    }
}

package chap_09;

import java.util.HashMap;

public class _07_HashMap {
    public static void main(String[] args) {
        //맵(Key, Value)
        HashMap<String, Integer> map = new HashMap<>();

        map.put("유재석", 10);
        map.put("박명수", 5);
        map.put("김종국", 3);
        map.put("서장훈", 15);

        System.out.println("총 고객수 : " + map.size());
        System.out.println("-------------------");

        System.out.println("유재석님의 포인트 : " + map.get("유재석"));

        if(map.containsKey("서장훈")) {
            int point = map.get("서장훈");
            map.put("서장훈", ++point);
            System.out.println("서장훈 님의 포인트 : " + map.get("서장훈"));
        } else {
            map.put("서장훈", 1);
            System.out.println("서장훈 님의 신규 등록");
        }

        map.remove("유재석");
        map.clear();
        System.out.println(map.size());

        System.out.println("-----------------");

        map.put("유재석", 10);
        map.put("박명수", 5);
        map.put("김종국", 3);
        map.put("서장훈", 15);

        for (String Key: map.keySet()) {
            System.out.println("고객이름 : " + Key + ", 포인트 : " + map.get(Key));
        }

        for (int value : map.values()) {
            System.out.println(value);
        }
    }
}

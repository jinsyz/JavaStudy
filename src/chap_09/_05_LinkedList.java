package chap_09;

import java.util.LinkedList;

public class _05_LinkedList {
    public static void main(String[] args) {
        //링크드 리스트
        LinkedList<String> list = new LinkedList<>();
        list.add("유재석");
        list.add("조세호");
        list.add("김종국");
        list.add("박명수");
        list.add("강호동");

        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        list.addFirst("서장훈");
        System.out.println(list.getFirst());
        list.addLast("김희철");
        System.out.println(list.getLast());

        System.out.println("------------------");
        list.add(1, "김영철");
        for (String s: list) {
            System.out.println(s);
        }

        System.out.println("------------------");
        list.remove(list.size() - 1);
        System.out.println(list.size());
        list.removeFirst();
        list.removeLast();
        for (String s: list) {
            System.out.println(s);
        }
        System.out.println("----------------");

        list.set(0, "이수근");
        System.out.println(list.get(0));
    }
}

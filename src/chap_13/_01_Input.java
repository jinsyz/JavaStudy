package chap_13;

import java.util.Scanner;

public class _01_Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("이름을 입력하세요");
//        String name = sc.next();
//        System.out.println("혈액형을 입력하세요");
//        String bloodType = sc.next();
//        System.out.println("키를 입력하세요");
//        //int height = Integer.parseInt(sc.next());
//        int height = sc.nextInt();
//        System.out.println("몸무게를 입력하세요");
//        Double weight = sc.nextDouble();
//
//        System.out.println("입력하신 정보는 다음과 같습니다.");
//        System.out.println("이름 : " + name);
//        System.out.println("혈액형 : " + bloodType);
//        System.out.println("키 : " + height);
//        System.out.println("몸무게 : "+ weight);

        System.out.println("무슨 프로그래밍 언어를 배우셨나요?");
        //String lang = sc.next();
        String lang = sc.nextLine();
        System.out.println("언어 : " + lang);
        System.out.println("배우고 나니 기분이 어땠나요?");
        String feeling = sc.nextLine();
        System.out.println("기분 : " + feeling);
    }
}

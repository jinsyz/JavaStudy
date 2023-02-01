package chap_05;

public class _02_ArrayLoop {
    public static void main(String[] args) {
        //배열 순회
        String[] coffees = {"아메리카노", "카페 모카", "라떼", "카푸치노"};

        for (int i = 0; i < 4; i++) {
            System.out.println(coffees[i] + " 하나");
            
        }
        System.out.println("-----------------------");
        for (int i = 0; i < coffees.length; i++) {
            System.out.println(coffees[i] + " 하나");

        }
        System.out.println("-----------------------");
        //enhanced for (for - each) 반복문
        for (String coffee : coffees) {
            System.out.println(coffee + " 하나");
        }
    }
}

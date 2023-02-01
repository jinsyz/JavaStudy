package chap_04;

public class _03_ElseIf {
    public static void main(String[] args) {
        boolean hallabongAde = false;
        boolean mangoJuice = true;

        if (hallabongAde){
            System.out.println("한라봉 에이드 +1");
        } else if (mangoJuice) {
            System.out.println("망고 주스 +1");
        } else {
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("커피 주문 완료#1");
    }
}

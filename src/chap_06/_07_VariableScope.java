package chap_06;

public class _07_VariableScope {
    public static void methodA() {
        //System.out.println(number);
    }

    public static void methodB() {
        int result = 1; //지역 변수
    }

    public static void main(String[] args) {
        int number = 3;
        //System.out.println(result);

    }
}

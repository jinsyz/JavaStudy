package chap_02;

public class _05_Operator5 {
    public static void main(String[] args) {
        int x = 5;
        int y = 3;
        int max = (x > y) ? x : y; // 결과 = (조건) ? (참의 경우 결과값): (거짓의 경우 결과값)
        System.out.println(max);
    }
}

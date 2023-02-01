package chap_02;

public class _01_Operator1 {
    public static void main(String[] args) {

        System.out.println(4 + 2);
        System.out.println(4 - 2);
        System.out.println(4 * 2);
        System.out.println(4 / 2);
        System.out.println(5 / 2); // 2
        System.out.println(2 / 4); // 0 몫
        System.out.println(4 % 2); // 0 나머지 값
        System.out.println(5 % 2); // 1

        System.out.println(2 + 2 * 2); // 6
        System.out.println((2 + 2) * 2); // 8

        int a = 20;
        int b = 10;
        int c;
        c = a + b;
        System.out.println(c);
        c = a - b;
        System.out.println(c);
        c = a * b;
        System.out.println(c);
        c = a / b;
        System.out.println(c);

        int val = 10;
        System.out.println(val);
        System.out.println(++val);
        System.out.println(val++);
    }
}

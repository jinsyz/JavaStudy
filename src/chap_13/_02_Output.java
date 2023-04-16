package chap_13;

public class _02_Output {
    public static void main(String[] args) {
        //System.out.format();

        System.out.println("-----------정수------------");
        System.out.printf("%d%n", 1);
        System.out.printf("%d %d %d%n", 1, 2, 3);
        System.out.printf("%d%n", 1234);
        System.out.printf("%6d%n", 1234);
        System.out.printf("%06d%n", 1234);
        System.out.printf("%6d%n", -1234);
        System.out.printf("%,12d%n", 1000000000);
        System.out.printf("%-6d%n", 1234); //왼쪽 정렬
        System.out.println("-----------실수------------");
        System.out.printf("%f%n", Math.PI);
        System.out.printf("%.2f%n", Math.PI);
        System.out.printf("%6.2f%n", Math.PI);
        System.out.printf("%-6.2f%n", Math.PI);
        System.out.printf("%06.2f%n", Math.PI);
        System.out.printf("%+6.2f%n", Math.PI);
        System.out.println("-----------문자열------------");
        System.out.printf("%s%n", "Java");
        System.out.printf("%6s%n", "Java");
        System.out.printf("%6.2s%n", "Java"); //6자리 확보하고 앞에 2글자만 출력
        System.out.printf("%-6.2s%n", "Java");
        System.out.println("-----------응용------------");
        System.out.println("이름      영어   수학   평균");
        System.out.printf("%-6s %4d %4d %6.1f%n","강백호", 90, 80, 85.0 );


    }
}

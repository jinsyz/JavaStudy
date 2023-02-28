package chap_09;

import chap_09.coffee.*;
import chap_09.user.User;
import chap_09.user.VipUser;

public class _02_GenericClass {
    public static void main(String[] args) {
        CoffeeByNumber c1 = new CoffeeByNumber(33);
        c1.ready();

        CoffeeByNickname c2 = new CoffeeByNickname("유재석");
        c2.ready();

        System.out.println("---------------------");

        CoffeeByName c3 = new CoffeeByName(34);
        c3.ready();
        CoffeeByName c4 = new CoffeeByName("박명수");
        c4.ready();

        System.out.println("---------------------");
        int c3Name = (int) c3.name;
        System.out.println("주문 고객 번호 : " + c3Name);

        System.out.println("---------------------");

        Coffee<Integer> c5 = new Coffee<>(35);
        c5.ready();

        Coffee<String> c6 = new Coffee<>("조세호");
        c6.ready();

        System.out.println("---------------------");

        CoffeeByUser<User> c7 = new CoffeeByUser<>(new User("강호동"));
        c7.ready();
        CoffeeByUser<User> c8 = new CoffeeByUser<>(new VipUser("서장훈"));
        c8.ready();

        orderCoffee("김영철","아메리카노");
        orderCoffee(36, "콜드 브루");
    }

    public static <T, V> void orderCoffee(T name, V coffee){
        System.out.println( coffee + " 준비 완료 : " + name);
    }
}

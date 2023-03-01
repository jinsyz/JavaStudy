package chap_10;

public class _02_AnoymousClass2 {
    public static void main(String[] args) {
        HomeMadeBurger momMadeBurger = getMomMadeburger();
        momMadeBurger.cook();

        HomeMadeBurger broMadeBurger = getBroMadeBurger();
        broMadeBurger.cook();
    }

    private static HomeMadeBurger getBroMadeBurger() {
        return new HomeMadeBurger() {
            @Override
            public void cook() {
                System.out.println("집에서 만드는 동생표 군데리아");
                System.out.println("빵, 계란, 패티, 딸기 잼...");
            }
        };
    }

    public static HomeMadeBurger getMomMadeburger(){
        return new HomeMadeBurger() {
            @Override
            public void cook() {
                System.out.println("집에서 만드는 엄마표 수제버거");
                System.out.println("재료: 빵, 소고기 패티, 양상추 ...");
            }
        };
    }
}

abstract class HomeMadeBurger{
    public abstract void cook();
}

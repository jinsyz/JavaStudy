package chap_10;

import chap_10.converter.Convertible;
import chap_10.converter.KRWConverter;

public class _04_FunctionalInterface {
    public static void main(String[] args) {
        KRWConverter converter = new KRWConverter();
        //converter.convert(2);

        convertUSD((USD) -> System.out.println(USD + " 달러 = " + (USD*1400) + " 원"), 2);

        Convertible convertible = (USD) -> System.out.println(USD + " 달러 = " + (USD*1400) + " 원");
        convertUSD(convertible, 2);
    }

    public static void convertUSD(Convertible converter, int USD){
        converter.convert(USD);
    }
}

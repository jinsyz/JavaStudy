package chap_07;

import chap_07.camera.Camera;

public class _16_Reference {
    public static void main(String[] args) {
        //참조
        //기본 자료형 (Primitive Data Types) : int, double, float, long, boolean ...
        int[] i = new int[3];
        System.out.println(i[0]);

        //참조 자료형(String Camera ...)
        String[] s = new String[3];
        System.out.println(s[0]);

        Camera c1 = new Camera();
        Camera c2 = new Camera();
        c1.name = "카메라1";
        c2.name = "카메라2";
        System.out.println(c1.name);
        System.out.println(c2.name);
        c1 = c2;
        c1.name = "잘못된 카메라";

        System.out.println(c1.name);
        System.out.println(c2.name);

    }
}

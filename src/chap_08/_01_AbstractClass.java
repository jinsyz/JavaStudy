package chap_08;

import chap_08.camera.Camera;
import chap_08.camera.FactoryCam;
import chap_08.camera.SpeedCam;

public class _01_AbstractClass {
    public static void main(String[] args) {
        //데이터 추상화
        //abstract
        //추상 클래스 -> 아직 완성되지 않은 클래스
        //Camera camera = new Camemra();
        FactoryCam factoryCam = new FactoryCam();
        factoryCam.showMainFeature();
        SpeedCam speedCam = new SpeedCam();
        speedCam.showMainFeature();
    }
}

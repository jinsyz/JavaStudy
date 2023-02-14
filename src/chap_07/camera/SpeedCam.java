package chap_07.camera;

public class SpeedCam extends Camera {

    public SpeedCam() {
        this.name = "과속 단속 카메라";
        //super("과속 단속카메라");
    }

    public void recordVideo() {
        super.recordVideo();
        checkSpeed();
        recognizeLicensePlate();
    }

    public void checkSpeed() {
        System.out.println("속도를 측정합니다.");
    }

    public void recognizeLicensePlate() {
        System.out.println("차량 번호를 인식합니다.");
    }

    @Override //annotation
    public void showMainFeature() {
        System.out.println(this.name + "의 주요 기능 : 속도 측정, 번호 인식");
    }
}

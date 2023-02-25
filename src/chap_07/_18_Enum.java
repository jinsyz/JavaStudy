package chap_07;

public class _18_Enum {
    //열거형
    public static void main(String[] args) {
        Resolution resolution = Resolution.HD;
        System.out.println(resolution);
    }
}

enum Resolution {
    HD, FHD, UHD
}

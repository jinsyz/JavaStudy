package chap_07;

public class _04_Method {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";

        b1.autoReport();
        BlackBox.conAutoReport = true;
        b1.autoReport();

        b1.insertMemoryCard(256);
        int fileCount = b1.getVideoFileCount(1);
        System.out.println("일반 파일 영상 수 : " + fileCount + "개");
    }
}

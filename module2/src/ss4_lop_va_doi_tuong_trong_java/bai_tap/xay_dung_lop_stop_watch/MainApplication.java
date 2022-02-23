package ss4_lop_va_doi_tuong_trong_java.bai_tap.xay_dung_lop_stop_watch;

public class MainApplication {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.Start();
        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < 1000; j++) {
                System.out.println("Hello");
            }
        }
        stopWatch.Stop();
        stopWatch.getElapsedTime();
        System.out.println(stopWatch.getElapsedTime());
    }
}

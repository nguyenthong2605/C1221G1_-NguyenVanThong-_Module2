package ss4_lop_va_doi_tuong_trong_java.bai_tap.XayDungLopStopWatch;

import java.util.Date;

public class StopWatch {
    long startTime, endTime;

    public StopWatch() {
        Date date = new Date();
        startTime = date.getTime();
    }

    public long getStart() {
        return startTime;
    }

    public long getStop() {
        return endTime;
    }

    public long getElapsedTime() {
        return endTime - startTime;
    }

    public void Start() {
        startTime = new Date().getTime();
    }

    public void Stop() {
        endTime = new Date().getTime();
    }

    public static void main(String[] args) {

    }
}

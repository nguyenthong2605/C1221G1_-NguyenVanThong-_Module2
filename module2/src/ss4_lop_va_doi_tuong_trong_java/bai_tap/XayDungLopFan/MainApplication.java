package ss4_lop_va_doi_tuong_trong_java.bai_tap.XayDungLopFan;

public class MainApplication {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(Fan.FAST);
        fan1.setColor("yellow");
        fan1.setOn(true);
        fan1.setRadius(10);
        System.out.println("Fan1: "+fan1);
        Fan fan2 = new Fan();
        fan2.setSpeed(Fan.MEDIUM);
        fan2.setColor("blue");
        fan2.setOn(false);
        fan2.setRadius(5);
        System.out.println("Fan2: "+fan2);
    }
}

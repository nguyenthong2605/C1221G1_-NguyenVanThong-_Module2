package ss5_access_modifier_static_method_static_property.bai_tap.XayDungLopChiGhiTrongJava;

public class Student {
    private String name = "John";

    private String classes = "CO2";

    public Student() {
    }

    protected void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                '}';
    }
}

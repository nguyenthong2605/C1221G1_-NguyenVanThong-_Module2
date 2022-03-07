package collection_review.model;

public class Intern extends Candidates {
    private String majors;
    private int semester;
    private String universityName;

    public Intern() {
    }

    public Intern(int id, String firstName, String lastName, int birthDate, String address, int phone, String email, String majors, int semester, String universityName) {
        super(id, firstName, lastName, birthDate, address, phone, email);
        this.majors = majors;
        this.semester = semester;
        this.universityName = universityName;
    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    @Override
    public String toString() {
        return "Intern{" + super.toString() +
                "majors='" + majors + '\'' +
                ", semester=" + semester +
                ", universityName='" + universityName + '\'' +
                '}';
    }
}

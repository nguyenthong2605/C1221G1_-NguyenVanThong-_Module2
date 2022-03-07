package collection_review.model;

public class Fresher extends Candidates{
    private int graduationDate;
    private int graduationRank;
    private String education;

    public Fresher() {
    }

    public Fresher(int id, String firstName, String lastName, int birthDate, String address, int phone, String email, int graduationDate, int graduationRank, String education) {
        super(id, firstName, lastName, birthDate, address, phone, email);
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.education = education;
    }

    public int getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(int graduationDate) {
        this.graduationDate = graduationDate;
    }

    public int getGraduationRank() {
        return graduationRank;
    }

    public void setGraduationRank(int graduationRank) {
        this.graduationRank = graduationRank;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    @Override
    public String toString() {
        return "Fresher{" + super.toString() +
                "graduationDate=" + graduationDate +
                ", graduationRank=" + graduationRank +
                ", education='" + education + '\'' +
                '}';
    }
}

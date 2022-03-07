package collection_review.model;

public class Experience extends Candidates {
    private int explnYear;
    private String proSkill;

    public Experience() {
    }

    public Experience(int id, String firstName, String lastName, int birthDate, String address, int phone, String email, int explnYear, String proSkill) {
        super(id, firstName, lastName, birthDate, address, phone, email);
        this.explnYear = explnYear;
        this.proSkill = proSkill;
    }

    public int getExplnYear() {
        return explnYear;
    }

    public void setExplnYear(int explnYear) {
        this.explnYear = explnYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }

    @Override
    public String toString() {
        return "Experience{" + super.toString()+
                "explnYear=" + explnYear +
                ", proSkill='" + proSkill + '\'' +
                '}';
    }
}

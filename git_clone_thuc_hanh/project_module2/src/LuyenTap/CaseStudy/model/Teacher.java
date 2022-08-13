package LuyenTap.CaseStudy.model;

public class Teacher extends Person {
    private String specialty;

    public Teacher() {}

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String job) {
        this.specialty = job ;
    }

    public Teacher(String specialty) {
        this.specialty = specialty;
    }

    public Teacher(int id, String name, String birthday, String sex, String specialty) {
        super(id, name, birthday, sex);
        this.specialty = specialty;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "specialty='" + specialty + '\'' +
                '}'+ super.toString();
    }
}
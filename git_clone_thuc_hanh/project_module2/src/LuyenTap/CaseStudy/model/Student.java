package LuyenTap.CaseStudy.model;

public class Student extends Person {
    private double score;
    private String nameClass;

    public Student() {
    }

    public Student(int id, String name, String birthday, String sex, String nameClass, double score) {
    }


    @Override
    public String toString() {
        return "Student{" +
                "point=" + score +
                ", nameClass='" + nameClass + '\'' +
                "} " + super.toString();
    }

    public Student(double point, String nameClass) {
        this.score = point;
        this.nameClass = nameClass;
    }

    public Student(int id, String name, String birthday, String sex, double score, String nameClass) {
        super(id, name, birthday, sex);
        this.score = score;
        this.nameClass = nameClass;
    }

    public void add(Student student) {
    }

    public void remove(Student student) {
    }
}

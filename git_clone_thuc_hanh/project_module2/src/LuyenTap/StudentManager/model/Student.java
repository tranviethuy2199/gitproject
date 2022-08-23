package LuyenTap.StudentManager.model;

public class Student extends Person {
    private String nameClass;
    private Double score;

    public Student() {
    }

//    public Student(int id, String name, String birthday, String sex, String nameClass, double score) {
//    }

    public Student(int id, String name, String birthday, String sex, double score, String nameClass) {
        super(id, name, birthday, sex);
        this.score = score;
        this.nameClass = nameClass;
    }

    public Student(int parseInt, String s, double parseDouble) {
    }


    @Override
    public String toString() {
//        return "Student{" +
//                " ID = " + this.getId()+
//                " Name =" + getName() +
//                " Date of Birth = " + getBirthday() +
//                " Sex = " + getSex() +
//                " score = " + this.score +
//                " ,nameClass = '" + this.nameClass +
//                "} ";
        return String.format("%s,%s,%s,%s,%s,%s",this.getId(),this.getName(),this.getBirthday(),this.getSex(),this.score,this.nameClass);
    }

//    public Student(double score, String nameClass) {
//        this.score = score;
//        this.nameClass = nameClass;
//    }
//
//    public Student(int id, String name, String birthday, String sex, double score, String nameClass) {
//        super(id, name, birthday, sex);
//        this.score = score;
//        this.nameClass = nameClass;
//    }

    public void remove(Student student) {
    }
}

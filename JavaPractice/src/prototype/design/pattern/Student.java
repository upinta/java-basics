package prototype.design.pattern;

public class Student implements Prototype<Student>{
    private String name;
    private int age;
    private String gender;
    private String batch;
    private double averagePspOfBatch;
    private double studentPsp;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public void setAveragePspOfBatch(double averagePspOfBatch) {
        this.averagePspOfBatch = averagePspOfBatch;
    }

    public void setStudentPsp(double studentPsp) {
        this.studentPsp = studentPsp;
    }

    public Student() {

    }

    public Student(Student s) {
        this.name = s.name;
        this.age = s.age;
        this.gender = s.gender;
        this.batch = s.batch;
        this.averagePspOfBatch = s.averagePspOfBatch;
        this.studentPsp=s.studentPsp;
    }



    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", batch='" + batch + '\'' +
                ", averagePspOfBatch=" + averagePspOfBatch +
                ", studentPsp=" + studentPsp +
                '}';
    }

    @Override
    public Student clone() {
        return new Student(this);
    }
}

package prototype.design.pattern;

public class Student {
    private String name;
    private int age;
    private String gender;
    private String batch;
    private double averagePspOfBatch;
    private double studentPsp;

    public Student() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public double getAveragePspOfBatch() {
        return averagePspOfBatch;
    }

    public void setAveragePspOfBatch(double averagePspOfBatch) {
        this.averagePspOfBatch = averagePspOfBatch;
    }

    public double getStudentPsp() {
        return studentPsp;
    }

    public void setStudentPsp(double studentPsp) {
        this.studentPsp = studentPsp;
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
}

package prototype.design.pattern;

public class Client {
    public static void main(String args[]) {
        StudentPrototypeRegistery s = new StudentPrototypeRegistery();
        fillRegistery(s);

        Student student = s.getPrototype("nov2024").clone();
        student.setName("avni");
        student.setAge(24);
        student.setGender("F");
        student.setStudentPsp(90);

        Student student2 = s.getPrototype("nov2024").clone();
        student2.setName("Alice");
        student2.setAge(28);
        student2.setGender("M");
        student2.setStudentPsp(95);

        System.out.println(student +" "+student.hashCode());
        System.out.println(student2 +" "+student2.hashCode());

        Student iss = s.getPrototype("nov24batchIntelligentStudent").clone();
        iss.setName("Bob");
        iss.setGender("M");
        System.out.println(iss +" "+iss.hashCode());
    }

    public static void fillRegistery(StudentPrototypeRegistery spr) {
        Student s1  = new Student();
        s1.setBatch("nov2024");
        s1.setAveragePspOfBatch(90);

        IntelligentStudent is = new IntelligentStudent();
        is.setIq(95);
        is.setAverageIqOfBatch(90);

        spr.addPrototype("nov2024", s1);
        spr.addPrototype("nov24batchIntelligentStudent", is);
    }
}

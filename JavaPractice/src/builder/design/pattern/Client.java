package builder.design.pattern;

public class Client {

    public static void main(String[] args){
        Student s = Student.getBuilder().setId(3).setName("fgg").setAge(44).build();
        System.out.println(s);
    }
}

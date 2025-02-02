package builder.design.pattern;

public class Client {

    public static void main(String[] args){
        /*Student s = Student.getBuilder().setId(3).setName("fgg").setAge(44).build();
        System.out.println(s);*/

         StudentTest st = StudentTest
                 .getBuilder().setId(1).setName("upinta").setAge(28).setPsp(90).build();

         System.out.println(st);
    }
}

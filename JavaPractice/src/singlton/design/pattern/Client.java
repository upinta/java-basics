package singlton.design.pattern;

public class Client {
    public static void main(String args[]) {
        Singlton instance1 = Singlton.getInstance();
        Singlton instance2 = Singlton.getInstance();

        if(instance2.equals(instance1)) {
            System.out.println("object are equals");
        } else {
            System.out.println("object are not equals");
        }
    }
}

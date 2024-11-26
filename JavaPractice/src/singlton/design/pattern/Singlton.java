package singlton.design.pattern;

public class Singlton {
    private static Singlton instance = null;

    private Singlton() {

    }

    public static Singlton getInstance() {
        if(instance== null) {
            instance =  new Singlton();
        }
        return instance;

    }
}

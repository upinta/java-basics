package builder.design.pattern;

public class ComputerDirector {
    private Computer.Builder builder;

    private ComputerDirector() {

    }

    public Computer buildGamingComputer() {
        return builder.setCpu("fgg").setRam(2).setStorage(4).build();
    }

    public Computer buildOfficeComputer() {
        return builder.setCpu("pppp").setRam(8).setStorage(4).build();
    }
}

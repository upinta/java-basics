package builder.design.pattern;

public class Computer {
    private String cpu;
    private int ram;
    private int storage;

    private Computer(Builder build) {

    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram=" + ram +
                ", storage=" + storage +
                '}';
    }

    public static class Builder {
        private String cpu;
        private int ram;
        private int storage;

        public String getCpu() {
            return cpu;
        }

        public Builder setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public int getRam() {
            return ram;
        }

        public Builder setRam(int ram) {
            this.ram = ram;
            return this;
        }

        public int getStorage() {
            return storage;
        }

        public Builder setStorage(int storage) {
            this.storage = storage;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}

package prototype.design.pattern;

public class IntelligentStudent extends Student {

    private int iq;
    private double averageIqOfBatch;

    public IntelligentStudent() {}

    public IntelligentStudent(IntelligentStudent is) {
        super(is);
        this.iq = is.iq;
        this.averageIqOfBatch = is.averageIqOfBatch;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public void setAverageIqOfBatch(double averageIqOfBatch) {
        this.averageIqOfBatch = averageIqOfBatch;
    }

    @Override
    public IntelligentStudent clone() {
        return new IntelligentStudent(this);
    }

    @Override
    public String toString() {
        return "IntelligentStudent{" +
                "iq=" + iq +
                ", averageIqOfBatch=" + averageIqOfBatch +
                '}';
    }
}

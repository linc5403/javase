package club.banyuan.classDef;

public class Elephant {
    private final int heightInCm;

    public Elephant(int heightInCm) {
        this.heightInCm = heightInCm;
    }

    public Elephant() {
        this.heightInCm = 150; // cm
    }

    public int getHeightInCm() {
        return heightInCm;
    }

    @Override
    public String toString() {
        return "Elephant{" +
                "heightInCm=" + heightInCm +
                '}';
    }
}

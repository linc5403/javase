package club.banyuan.classDef;

public class Lion {
    private int heightInCm;

    public Lion() {
        heightInCm = 100;
    }

    public Lion(int height) {
        this.heightInCm = height;
    }

    public int getHeightInCm() {
        return heightInCm;
    }

    @Override
    public String toString() {
        return "Lion{" +
                "height=" + heightInCm +
                '}';
    }
}

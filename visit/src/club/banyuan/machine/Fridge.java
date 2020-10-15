package club.banyuan.machine;

import club.banyuan.animal.Elephant;

public class Fridge {
    private int heightInCM;
    private Elephant storage;

    public Fridge() {
        // heightInCM = 220;
        this(200);
        storage = new Elephant();
        // Fridge(200);
    }

    public Fridge(int heightInCM) {
        this.heightInCM = heightInCM;
    }


    public void store(Elephant elephant) {
        storage = elephant;
    }
}

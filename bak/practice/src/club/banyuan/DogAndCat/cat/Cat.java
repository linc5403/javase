package club.banyuan.DogAndCat.cat;

import club.banyuan.DogAndCat.dog.Dog;

public class Cat {
    private String spec;
    private String furtherColor;

    public Cat(String spec, String furtherColor) {
        this.spec = spec;
        this.furtherColor = furtherColor;
    }

    public String getSpec() {
        return spec;
    }

    public String getInfo() {
        return furtherColor + spec;
    }

    public void print() {
        System.out.println(getInfo());
    }

    public void playWith(Dog dog) {
        System.out.println(this.getInfo() + "和" + dog.getInfo() + "一起玩");
    }
}

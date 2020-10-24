package club.banyuan.DogAndCat.dog;

import club.banyuan.DogAndCat.cat.Cat;

public class Dog {
    private String spec;
    private int iq;

    public Dog(String spec, int iq) {
        this.spec = spec;
        this.iq = iq;
    }

    public String getInfo() {
        String info;
        if (iq < 20) {
            info = "傻";
        } else if (iq <= 80) {
            info = "普通";
        } else {
            info = "聪明";
        }
        return info + "的" + spec;
    }

    public void printInfo() {
        System.out.println(getInfo());
    }

    public void playWith(Cat cat) {
        System.out.println(this.spec + "和" + cat.getSpec()+ "一起玩");
    }
}

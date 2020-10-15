package club.banyuan.DogAndCat.main;

import club.banyuan.DogAndCat.cat.Cat;
import club.banyuan.DogAndCat.dog.Dog;

public class CatAndDog {
    public static void main(String[] args) {
        Dog dogHa = new Dog("哈士奇", -100);
        Dog dogJin = new Dog("金毛", 100);
        Dog dogKe = new Dog("柯基", 40);

        Cat catBo = new Cat("波斯",  "白色");
        Cat catYing = new Cat("英短", "黑色");
        catYing.playWith(dogHa);
    }
}

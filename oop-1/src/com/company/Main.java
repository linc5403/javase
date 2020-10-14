package com.company;

public class Main {

    static int getLen(int[] a) {
        return a.length;
    }

    public static void main(String[] args) {
        int[] a = new int[3];
        getLen(a);
        Car car = new Car();
        Car car1 = new Car("红色", 1.6f);
        car1.speedUp(10);
        car1.start();

//        Person zhangSan = new Person("zhangSan", 18, 100);
//        zhangSan.sayHello();

        Person liSi = new Person();
        liSi.name = "liSi";
        liSi.sayHello();
    }
}

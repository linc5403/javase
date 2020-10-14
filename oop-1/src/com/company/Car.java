package com.company;

public class Car {
    String color; // 蓝、红
    float engine; // 1.6 2.0
    boolean started = false; // 已启动

    Car() {
        color = "黑色";
        engine = 0.8f;
        started = false;
    }

    Car(String color, float engine) {
        this.color = color;
        this.engine = engine;
        this.started = false;
    }

    void start() {
        started = true;
        System.out.println(color + "的车启动了！！！");
    }

    void speedUp(int a) {
        if (started) {
            System.out.println("现在的加速度是" + engine * a);
        } else {
            System.out.println("车未启动");
        }
    }
}

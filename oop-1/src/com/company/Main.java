package com.company;

public class Main {

    static int getLen(int[] a) {
        return a.length;
    }


    static int [] filterArray(int[] a){
        int[] b =  new int[a.length];
        int validLen = 0; // b数组的有效长度
        //for (int i = 0; i < a.length; i++) {
        for (int e: a) {
            // 对于每个元素e，判断它在不在b里面
            boolean exist = false;
            for (int j = 0; j < validLen; j++) {
                if (b[j] == e) {
                    exist = true;
                    break;
                }
            }
            // 如果e不在b里面，则将其放入b数组，并修改有效长度
            if (!exist) {
                b[validLen] = e;
                validLen++;
            }
        }
        int [] c = new int[validLen];
        for(int i = 0; i < validLen; i++) {
            c[i] = b[i];
        }
        return c;
    }

    public static void main(String[] args) {
        int[] a = new int[3];
        getLen(a);
        Car car = new Car();
        Car car1 = new Car("红色", 1.6f);
//        car1.started = true;
        car1.speedUp(10);
        car1.start();

//        Person zhangSan = new Person("zhangSan", 18, 100);
//        zhangSan.sayHello();

//        Person liSi = new Person();
//        liSi.name = "liSi";
//        liSi.sayHello();

        car.convert(3456789);

        int[] r = filterArray(new int[] {0, 3, 2, 1, 3, 0});
        for (int e: r) {
            System.out.print(" " + e);
        }
    }
}

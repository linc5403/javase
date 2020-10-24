package club.banyuan.ch6_Interface.b_packageAccess;

public class SameClass {
    public static void main(String[] args) {

//        可以看出, 同一个package中构建的其他类对象, 可以调用该对象的protected方法和default方法
        Outer outer = new Outer();
        outer.protectedMethod();
        outer.defaultMethod();
    }
}

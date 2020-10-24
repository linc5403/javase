package club.banyuan.ch4_objectAndClass.b_packageAccess;

public class SamePackage {
    public static void main(String[] args) {

//        可以看出, 同一个package中构建的其他类对象, 可以调用该对象的protected方法和default方法
        OuterBase outerBase = new OuterBase();
        outerBase.protectedMethod();
        outerBase.defaultMethod();
    }
}

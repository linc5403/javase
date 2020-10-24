package club.banyuan.ch4_objectAndClass.b_packageAccess.subPackage;


import club.banyuan.ch4_objectAndClass.b_packageAccess.OuterBase;

public class InnerSubClass extends OuterBase {
    void someTest() {
        InnerSubClass inner = new InnerSubClass();
        inner.protectedMethod();
        super.protectedMethod();
    }

    public static void main(String[] args) {
//        InnerSubClass 是 OuterBase 的子类, 因此, InnerSubClass的实例继承了protected方法,
//        所以可以在实例上调用父类的protected方法
//        protected限定的作用就是为了让不在一个package中的子类可以继承父类的方法
//        注意: 调用的主体是子类的实例, 而不是父类的实例

        InnerSubClass inner = new InnerSubClass();
        inner.someTest();

//        构造父类的一个对象, 不能调用该父类对象的protected方法
//        即使是当前类的父类也不行 ( 因为protected限定表示只有 1)这个包中构建的该类的对象 或是 2)该类的子类对象 才能调用该方法 )
//        比如下面这个示例: 因为 InnerSubClass 和 OuterBase不在一个包中, 因此 InnerSubClass 代码中构建的 OuterBase 对象无法调用其保护方法
//        OuterBase outer = new OuterBase();
//        outer.protectedMethod();


//        其他包的类中不能调用缺省访问限定的方法, 即使是子类对象也不可以
//        1. 子类无法继承 package private 方法
//        inner.defaultMethod();
//        2. 其他包中创建的对象无法调用其 package private方法
//        OuterBase outer = new OuterBase();
//        outer.defaultMethod();
    }

}

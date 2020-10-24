package club.banyuan.ch6_Interface.b_packageAccess.subPackage;

import club.banyuan.ch6_Interface.b_packageAccess.Outer;

public class Inner extends Outer {
    void someTest() {
        Inner inner = new Inner();
        inner.protectedMethod();
        super.protectedMethod();
    }

    public static void main(String[] args) {
//        Inner class是Outer class的子类, 因此, Inner的实例继承了protected方法,
//        所以可以在实例上调用父类的protected方法
//        protected限定的作用就是为了让不在一个package中的子类可以继承父类的方法
//        注意: 调用的主体是子类的实例, 而不是父类的实例

        Inner inner = new Inner();
        inner.someTest();

//        构造父类的一个对象, 不能调用该父类对象的protected方法
//        即使是当前类的父类也不行 ( 因为protected限定表示只有 1)这个包中构建的该类的对象 或是 2)该类的子类对象 才能调用该方法 )
//        比如下面这个示例: 因为Inner和Outer不在一个包中, 因此Inner代码中构建的Outer对象无法调用保护方法
//        Outer outer = new Outer();
//        outer.protectedMethod();


//        其他包的类中不能调用缺省访问限定的方法, 即使是子类对象也不可以
//        1. 子类无法继承 package private 方法
//        inner.defaultMethod();
//        2. 其他包中创建的对象无法调用其 package private方法
//        Outer outer = new Outer();
//        outer.defaultMethod();
    }

}

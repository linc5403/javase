package club.banyuan.ch6_Interface.b_packageAccess;

public class SameSubClass extends Outer {
    public static void main(String[] args) {
        SameSubClass sameSubClass = new SameSubClass();
//        同一个包的子类可以继承父类的缺省方法和保护方法
//        不同包的子类不能继承缺省限定符修饰的方法, 不同包的子类只能继承保护方法,
//        保护指的是保护自己的子类, 子类即使不何父类在一个package, 也可以继承父类的保护方法
        sameSubClass.defaultMethod();
        sameSubClass.protectedMethod();

//        同一个包创建的对象, 可以引用该对象的缺省方法和保护方法,
        Outer outer = new Outer();
        outer.protectedMethod();
        outer.defaultMethod();
    }
}

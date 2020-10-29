package club.banyuan.nestedClass.staticSample;

public class BaseClassForStaticInnerClass {

    // 类的首要作用还是为了实例化对象出来
    // 此处的static是指该Inner class是归属于Outer Class所有, 换言之, 需要使用这个外部类来引用内部类

    static class Inner {
        // 但是, 通常来说, 静态内部类通常都是private的, 可以把内部类 类比 于class的属性, 内部类设置为private 同样是为了封装
        //    private static class Inner{
        public void innerHello() {
            System.out.println(this.getClass().getName() + ": Hello");
        }
    }

    public void outerHello() {
        // 因为class Inner是归属于 Outer class所有, 因此这里的引用最好加上Outer类的名字, 这样指待更加准确
        Inner inner = new BaseClassForStaticInnerClass.Inner();
        // 当然, 上一句也可以使用下一句来代替:
//        Inner inner = new Inner();
        inner.innerHello();
        System.out.println(this.getClass().getName() + ": Hello, this is Outer");
    }
}

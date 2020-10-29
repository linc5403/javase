package club.banyuan.nestedClass.nonStaticSample;

public class BaseClassForNonStaticInnerClass {

    // 此时的Inner类, 归属在Outer的对象上, 需要通过Outer对象来构建Inner对象
    public class Inner {
        public void innerHello() {
            System.out.println(this.getClass().getName() + ": Hello");
        }
    }

    public void outerHello() {
        // 因为class Inner是归属于 Outer class所有, 因此这里其实是通过this对象来引用的
        Inner inner = new Inner();
        // 上面一句和下面这条语句的含义完全一样
        // Inner inner = this.new Inner();
        inner.innerHello();
        System.out.println(this.getClass().getName() + ": Hello, this is Outer");
        StringBuffer
    }
}



package club.banyuan.nestedClass.nonStaticSample;

public class NonStaticInnerTest {
    public static void main(String[] args) {
        BaseClassForNonStaticInnerClass base = new BaseClassForNonStaticInnerClass();
        base.outerHello();

        // 非静态类引用在Outer class的对象上, 也即是依赖于Outer对象而存在, 所以需要使用Outer 对象来生成Inner对象
        BaseClassForNonStaticInnerClass.Inner inner =  base.new Inner();
        inner.innerHello();
    }
}

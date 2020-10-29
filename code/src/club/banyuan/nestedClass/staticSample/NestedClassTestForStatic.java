package club.banyuan.nestedClass.staticSample;

import club.banyuan.nestedClass.nonStaticSample.BaseClassForNonStaticInnerClass;

import java.lang.reflect.InvocationTargetException;

public class NestedClassTestForStatic {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        BaseClassForStaticInnerClass base = new BaseClassForStaticInnerClass();
        base.outerHello();
        // 非private的静态类的构造方法
        BaseClassForStaticInnerClass.Inner inner = new BaseClassForStaticInnerClass.Inner();
        inner.innerHello();
    }


}

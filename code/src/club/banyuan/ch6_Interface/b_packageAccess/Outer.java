package club.banyuan.ch6_Interface.b_packageAccess;

import java.util.ArrayList;

/**
 * protected方法的示例
 * <p>
 * 被protected修饰的方法, 只有在如下情况中才能被调用:
 * </p>
 * <ol>
 *     <li>
 * 同一个package中其他class: 实例化了这个类, 通过该类的对象调用protected方法
 *     </li>
 *     <li>
 * 该类的子类: 创建子类对象, 可以通过子类对象调用protected方法
 *     </li>
 *
 * </ol>
 *
 * <p>
 * 不带访问限定符修饰的方法, 只能在当前package的其他类中通过创建该类的对象进行调用.
 * 其子类如果不是同一个包, 则也无法继承该方法
 * </p>
 */
public class Outer {
    // protected方法只能相同package或是其subclass使用
    protected void protectedMethod() {
        System.out.println(getClass().getName());
    }

    void defaultMethod() {
        System.out.println(getClass().getName());
    }
}

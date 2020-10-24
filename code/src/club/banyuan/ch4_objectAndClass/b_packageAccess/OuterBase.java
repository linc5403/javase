package club.banyuan.ch4_objectAndClass.b_packageAccess;

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
 * 不带访问限定符修饰的方法(package private), 限定了其使用仅在当前package中.
 * </p>
 * <ol>
 *     <li>
 * 当前package的其他类中通过创建该类的对象进行调用.
 *     </li>
 *     <li>
 * 当前package中的子类可以继承该方法
 *     </li>
 *     <li>
 * 其他package即不能引用该类的实例的这个方法, 也不能继承该方法
 *     </li>
 * </ol>
 *
 */
public class OuterBase {
    // protected方法只能相同package或是其subclass使用
    protected void protectedMethod() {
        System.out.println(getClass().getName());
    }

    void defaultMethod() {
        System.out.println(getClass().getName());
    }
}

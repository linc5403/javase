package club.banyuan.Interface;

public interface Person {
    // 接口里的成员只能是static public final, 即这个成员属于这个接口
    // 所以写不写static public final, 成员都是这个定义
    // static public final int MAX_AGE = 100;
    int MAX_AGE = 100;

    // 接口方法分为抽象方法(abstract) 缺省方法(default) 和 静态方法(static)

    // 抽象方法 - 实现类需要实现该方法
    String getGender();

    // 缺省方法 - 如果实现类不重新该方法, 则使用该方法
    default String getName(){
        return "Lucy";
    }

    // 静态方法
    // 静态方法只能通过接口名称进行调用， 而不能通过实现类的类名调用
    // 因此下面这个方法只能通过 Person.echoMaxAge() 来进行调用
    static void echoMaxAge() {
        System.out.println(MAX_AGE);
    }
}

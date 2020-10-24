package club.banyuan.ch6_Interface.c_default_method;

public class Student implements Name, Person{
    public String getName() {
        // 此时如果是继承就没有问题， 但是因为是接口的实现，
        // 而单独使用super无法确认是哪个接口的缺省方法被调用，
        // 因此需要加上Interface的名字来进行引用
        // 单独的super指的是superclass， 只有继承才有super和sub的关系, 而接口是没有super和sub的
        return Person.super.getName();
    }

    @Override
    public String getGender() {
        return null;
    }
}

package club.banyuan.ch6_Interface.c_default_method;

public interface Name {
    // 如果是default方法， 则必须增加default关键字
    // 接口通常只是定义方法，
    default String getName() {
        return getClass().getName();
    }
}

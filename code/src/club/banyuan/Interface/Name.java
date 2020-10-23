package club.banyuan.Interface;

public interface Name {
    // 如果是default方法， 则必须增加default关键字
    // 接口通常只是定义方法，
    default String getName() {
        return getClass().getName();
    }
}

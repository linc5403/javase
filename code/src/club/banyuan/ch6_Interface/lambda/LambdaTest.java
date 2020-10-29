package club.banyuan.ch6_Interface.lambda;

import java.util.function.IntConsumer;

public class LambdaTest {
    public static void repeat(int n, Runnable action) {
        for (int i = 0; i < n; i++) {
            action.run();
        }
    }

    public static void repeat2(int n, IntConsumer action) {
        for(int i = 0; i < n; i++) {
            action.accept(i);
        }
    }

    public static void main(String[] args) {
        repeat(10, ()-> System.out.println("Hello, world!"));
        //repeat2(10, System.out::println);
        repeat2(10, (i) -> System.out.println(9-i));
    }
}

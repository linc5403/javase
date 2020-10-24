package club.banyuan.ch3_basic;

import java.io.Console;

/**
 * console的使用示例<br>
 * <strong>注意: 该用例只能在命令行下运行</strong><br>
 *     <ol>
 *         <li>
 *         通过System.console()获取当前可用的console
 *         </li>
 *         <li>
 *         readPassword()方法返回的是char[]
 *         </li>
 *         <li>
 *         将char[]转变为String应该使用String.valueOf()方法
 *         </li>
 *     </ol>
 *
 * @author linc
 * @version 0.1
 */
public class ConsoleDemo {
    public static void main(String[] args) {
//      注意: 这个实例只能在命令行下运行, 因为IDEA没法获取到系统的console
        Console console = System.console();
        System.out.println(console);
        String username = console.readLine("User name:");
//        注意: readPassword的返回值类型是char的数组
        char[] password = console.readPassword("Password:");
        System.out.println("**********");
//        以下这条语句会调用Arrays类的静态方法将password数组转换成字符串, 可以试试看什么效果
//        System.out.println(username + "\n" + Arrays.toString(password));
        System.out.println(username);
//        使用String的静态valueOf方法可以从数组中生成新的String
        System.out.println(String.valueOf(password));
    }
}

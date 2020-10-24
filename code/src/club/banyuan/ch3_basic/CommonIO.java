package club.banyuan.ch3_basic;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * Scanner 和 PrintWriter 的示例
 * <p>
 * 都需要将某个输入/输出和Scanner/PrintWriter关联起来, 再调用对象的方法来实现IO操作
 * </p>
 * @author linc
 * @version 0.1
 */
public class CommonIO {
    public static void main(String[] args) throws IOException {
        // 1. 对于输入来说, 比输出要麻烦些, 因为输入没有处理具体数据类型的方法,
        // 因此我们需要使用一个Scanner对象来连接输入流并从中获取数据
        // 以下示例是先创建一个scanner对象, 挂接在系统标准输入上
        Scanner scanner = new Scanner(System.in);
        // 在在其中获取一行标准输入, 放入到name这个变量中
        String name = scanner.nextLine();

        // 2. 输出对象如果是标准输出(stdout), 可以使用System.out的print功能
        // 也可以使用一个PrintWriter对象来关联System.out, 如下所示

        // 创建一个PrintWriter对象, 关联System.out;
        // 注意构造方法的第二个参数, 表示是否要自动刷新到输出流中, 如果设置为false则需要手工调用PrintWriter对象的flush()方法
        PrintWriter printWriter = new PrintWriter(System.out, true);
        // 使用printWriter对象的方法进行输出
        printWriter.println("Hello, World");

        // 3. StringBuilder可以帮助我们构建字符串
        StringBuilder stringBuilder = new StringBuilder();

        // 使用append在builder对象中增加内容
        stringBuilder.append("Hello, ");
        stringBuilder.append(name);
        // 使用toString方法将当前的内容生成String, 所以我们称其为StringBuilder
        String line = stringBuilder.toString();

        // 以下两行代码在当前的用例里面完全一样, 因为printWrite也是挂接的System.out对象
        printWriter.println();
        System.out.println(line);

        // 注意如果构造PrintWriter对象时没有指定autoFlush参数为true, 则需要手动调用flush()方法, 否则终端上不会有输出
        //printWriter.flush();

        // 4. 文件的使用
        // 上面我们见过了通过System.in输入流来构造Scanner对象, 现在我们观察如何从文件中获取输入

        // 4.1 通过Paths.get()方法获取一个Path对象; 注意此时不能使用~用以代表home目录, 建议指定绝对路径
        Path path = Paths.get("/home/linc/memo.org");

        // 4.2 将生成的path对象用作Scanner的构造方法用以生成Scanner对象
        Scanner newScanner = new Scanner(path);

        // 4.3 通过Scanner对象读取输入流中的内容
        while(newScanner.hasNext()) {
            String inLine = newScanner.nextLine();
            System.out.println(inLine);
        }


        // 4.4 也可以使用File来构建Scanner对象
        File file = new File("/home/linc/memo.org");
        Scanner thirdScanner = new Scanner(file, StandardCharsets.UTF_8);

        // 4.5 用一个路径的字符串来构建FileWriter对象, 使用FileWriter对象来构建PrintWriter对象, 输出的内容都会在该文件对象中
        // 注意FileWriter构造方法的第二个参数, 用以表示是否追加到该文件中, 缺省是覆盖写入
        FileWriter fileWriter = new FileWriter("/home/linc/newFile", true);
        printWriter = new PrintWriter(fileWriter);

//        使用下面这条语句就会将文件清空了再写入, 因为没有设置追加写入的属性
//        printWriter = new PrintWriter("/home/linc/newFile", );

        while(thirdScanner.hasNext()) {
            String inLine = thirdScanner.nextLine();
            printWriter.println(inLine);
        }
//        因为构造printWriter时没有指定autoFlush, 所以此时需要调用flush()方法, 否则内容有可能无法写入到文件中
        printWriter.flush();
//        使用结束需要关闭printWriter, 虽然当前用例不关闭也不会有什么影响, 不过应该养成良好的习惯, 资源不使用时就将其释放
        printWriter.close();
    }
}

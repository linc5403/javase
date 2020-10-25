package club.banyuan.ch3_basic;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;


/**
 * String用来存储字符串, 而java的char是使用的UTF-16来编码, 因此可以认为String里面存储的就是UTF-16编码的字符.
 * <p>
 *     String.getBytes(StandardCharsets.UTF_8) 可以用来获取UTF-8编码的byte数组
 * </p>
 *
 * <p>
 *     String s = new String(byte[] bytes, StandardCharsets.UTF_8) 用来将UTF-8编码的数组保存进字符串
 * </p>
 *
 * <p>
 *     String.length()方法获取的是String中的code unit, 即有多少个16bit的char; 对于某些超过1个char范围的char不能准确得到有多少个字符
 * </p>
 *
 * @see <a href=https://developer.ibm.com/zh/languages/java/articles/j-lo-chinesecoding/>https://developer.ibm.com/zh/languages/java/articles/j-lo-chinesecoding/</a>
 */
public class CharStringTest {

    static void toHex(byte b) {
        System.out.printf("%02x ", b);
    }

    public static void main(String[] args) throws UnsupportedEncodingException {
        String s = "\ud835\udd46";

        System.out.println(s);

        char c = '兲';
        System.out.println(c);
        c = '叇';
        System.out.println(c);
        c = '亖';
        System.out.println(c);
        System.out.println();
        System.out.println("***********String.length()方法获取的是有多少个code unit**********************");

        s = "abcd\uD834\uDF06\uD835\uDD46";
        // 这是一个字符(code point), 但是并不能在一个char(16bit)中存放,
        // 因此使用了两个code unit, 一个code unit的大小是16bit
        // 而Sting的length()方法获取的是code unit的数量, 也就是其中存放了多少个char
        System.out.println(s + " length = " + s.length());
        System.out.println();
        System.out.println("**********不能使用String.charAt(index)来获取每个字符***********************");


        // 所以, 我们不能使用String的charAt方法来获取某个位置的字符, 因为有可能或获取到一个字符的一半code unit
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i));
        }
        System.out.println();
        System.out.println();
        System.out.println("**************使用String.codePointCount(begin, end)来获取有多少个字符, 注意不是char****************");

        // 应该使用codePointCount方法来获取有多少个字符
        int codePointCount =  s.codePointCount(0, s.length());
        System.out.println(s + " 里面有 " + codePointCount + " 个code point");
        System.out.println();
        System.out.println("***********获取UTF-8编码的bytes数组*********************");

        byte[] bytes = s.getBytes(StandardCharsets.UTF_8);
        System.out.println("utf8编码的 " + s + " bytes len: " + bytes.length);
        for (byte aByte : bytes) {
            toHex(aByte);
        }
        System.out.println();
        System.out.println();
        System.out.println("**********获取UTF-16编码的bytes数组***********************");

        // 获取UTF-16编码的字节数组, 并打印
        bytes = s.getBytes(StandardCharsets.UTF_16);
        System.out.println("UTF-16 bytes len: " + bytes.length);
        for (byte aByte : bytes) {
            toHex(aByte);
        }
        System.out.println();
        System.out.println();

        System.out.println("**********获取UTF-16BE编码的bytes数组***********************");
        // 获取UTF-16 big endian编码的字节数组, 并打印
        bytes = s.getBytes(StandardCharsets.UTF_16BE);
        System.out.println("UTF-16BE bytes len: " + bytes.length);
        for (byte aByte : bytes) {
            toHex(aByte);
        }
        System.out.println();
        System.out.println();

        System.out.println("***********Charset的使用************************************");
        // 通过Charset来统一编码和解码过程
        // 所谓encode是指将一个字符串以某种形式编码, 得到一个字节数组
        Charset charset = StandardCharsets.UTF_8;
        // decode则是反向过程, 将一个字节数组解码, 得到一个char的组合, 也就是字符串
        ByteBuffer byteBuffer = charset.encode(s);
        CharBuffer charBuffer = charset.decode(byteBuffer);
        System.out.println(charBuffer.toString());
    }
}

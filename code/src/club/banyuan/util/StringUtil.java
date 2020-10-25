package club.banyuan.util;

public class StringUtil {
    public static String byteToHexString(byte b) {
        return String.format("%02x", b);
    }

    public static String byteArrayToHexString(byte[] bytes) {
        StringBuilder builder = new StringBuilder();
        for (byte b: bytes) {
            builder.append(String.format("%02x ", b));
        }

        return builder.toString();
    }

    public static String charToHexString(char c) {
        return String.format("%04x", c);
    }

    public static String intToHexString(int i) {
        return String.format("%08x", i);
        /*
        StringBuilder builder = new StringBuilder();
        for (int j = 0; j < 4; j++) {
            builder.insert(0, String.format("%02x", (byte)i));
            i >>>= 8;
        }
        return builder.toString();
        */
    }

    public static void main(String[] args) {
        int i = 0xabcd_ee12;
        System.out.println(intToHexString(i));

        byte[] a = new byte[] {0x11, 0x22, 0x33, -1, -2};
        System.out.println(byteArrayToHexString(a));
    }
}

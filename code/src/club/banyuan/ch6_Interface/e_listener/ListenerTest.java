package club.banyuan.ch6_Interface.e_listener;

import javax.swing.*;

public class ListenerTest {
    public static void main(String[] args) {
        Timer timer = new Timer(2000, new TimePrinter());
        timer.start();
        JOptionPane.showMessageDialog(null, "Quit program?");
    }
}

package club.banyuan.Interface.c_listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Instant;

public class TimePrinter implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(Instant.ofEpochMilli(e.getWhen()));
    }
}

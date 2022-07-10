package practice.ex.chapter7;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Chapter7_28 {
    public static void main(String[] args) {
        Frame f = new Frame();
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                e.getWindow().setVisible(false);
                e.getWindow().dispose();
                System.exit(0);
            }
        });
    }
}

class EventHandler extends WindowAdapter {
    public void windowClosing(WindowEvent event) {
        event.getWindow().setVisible(false);
        event.getWindow().dispose();
        System.exit(0);
    }
}

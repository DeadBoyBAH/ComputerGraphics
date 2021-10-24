package laboratorywork3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class BorderLayoutDemo {

    public static void Show(int width, int height) {
        JFrame frame = new JFrame("Test BorderLayout");
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) { System.exit(0); }
        });

        frame.getContentPane().setLayout(new BorderLayout());
        frame.getContentPane().add("North", new Button("North"));
        frame.getContentPane().add("Center", new Button("Center"));
        frame.getContentPane().add("South", new Button("South"));
        frame.getContentPane().add("West", new Button("West"));
        frame.getContentPane().add("East", new Button("East"));
        frame.setSize(width, height);
        frame.setVisible(true);
    }
    public static void main(String args[]) {
       BorderLayoutDemo.Show(200,200);
    }

}

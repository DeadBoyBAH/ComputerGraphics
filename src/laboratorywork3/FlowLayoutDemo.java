package laboratorywork3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FlowLayoutDemo {

    public static void Show(int width, int height) {
        JFrame frame = new JFrame("Test FlowLayout");
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) { System.exit(0); }
        });
        frame.getContentPane().setLayout(new FlowLayout());
        frame.getContentPane().add(new Button("One"));
        frame.getContentPane().add(new Button("Two"));
        frame.getContentPane().add(new Button("Three"));
        frame.getContentPane().add(new Button("Four"));
        frame.getContentPane().add(new Button("Five"));
        frame.setSize(width, height);
        frame.setVisible(true);
    }
    public static void main(String args[]) {
        FlowLayoutDemo.Show(200,200);
    }

}

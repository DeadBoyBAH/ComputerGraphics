package laboratorywork3;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TwoManagerDemo {

    public static void Show(int width, int height) {
        Frame frame = new Frame("Test BorderLayout and GridLayout");
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) { System.exit(0); }
        });
        frame.setLayout(new BorderLayout());
        Panel top = new Panel();
        top.setLayout(new GridLayout(0,2));
        top.add(new Button("One"));
        top.add(new Button("Two"));
        top.add(new Button("Three"));
        top.add(new Button("Four"));
        top.add(new Button("Five"));
        frame.add("East", top);
        frame.setSize(width, height);
        frame.setVisible(true);
    }
    public static void main(String args[]) {
        TwoManagerDemo.Show(200,150);
    }

}

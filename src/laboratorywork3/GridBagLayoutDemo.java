package laboratorywork3;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GridBagLayoutDemo {

    public static void Show(int width, int height) {
        Frame frame = new Frame("Test GridBagLayout");
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) { System.exit(0); }
        });
        GridBagConstraints constraints = new GridBagConstraints();
        GridBagLayout gr = new GridBagLayout();
        frame.setLayout(gr);
        constraints.fill = GridBagConstraints.BOTH; // заполнять все доступное пространство
        constraints.gridwidth = 2; // по 2 кнопки в строке
        Button b = new Button("One");
        gr.setConstraints(b, constraints);
        frame.add(b);
        constraints.gridwidth = GridBagConstraints.REMAINDER; //последний компонент в строке
        b = new Button("Two");
        gr.setConstraints(b, constraints);
        frame.add(b);
        constraints.gridwidth = GridBagConstraints.RELATIVE; //предпоследний компонент в строке
        constraints.gridheight = 2; // занять компонентом две строки
        constraints.weighty = 1.0;
        b = new Button("Three");
        gr.setConstraints(b, constraints);
        frame.add(b);
        constraints.gridwidth = GridBagConstraints.REMAINDER; // последний компонент в строке
        constraints.gridheight = 1; // занять компонентом одну строку
        constraints.weighty = 0.0;
        b = new Button("Four");
        gr.setConstraints(b, constraints);
        frame.add(b);
        b = new Button("Five");
        gr.setConstraints(b, constraints);
        frame.add(b);
        frame.setSize(width, height);
        frame.setVisible(true);
    }
    public static void main(String args[]) {
        GridBagLayoutDemo.Show(200,150);
    }

}

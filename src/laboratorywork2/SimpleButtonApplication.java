package laboratorywork2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

public class SimpleButtonApplication implements ActionListener {

    JLabel jlab1;
    JLabel jlab2;
    long start = Calendar.getInstance().getTimeInMillis();

    SimpleButtonApplication() {

        JFrame jfrm = new JFrame("Application for physical education teacher");
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(300, 200);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton jbtn1 = new JButton("First student");
        JButton jbtn2 = new JButton("Second student");

        jbtn1.addActionListener(this);
        jbtn2.addActionListener(this);

        jfrm.add(jbtn1);
        jfrm.add(jbtn2);

        jlab1 = new JLabel("first student time: ");
        jlab2 = new JLabel("second student time: ");
        jfrm.add(jlab1);
        jfrm.add(jlab2);

        jfrm.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        Calendar cal = Calendar.getInstance();
        if (e.getActionCommand().equals("First student"))
            jlab1.setText(jlab1.getText() + (double) (cal.getTimeInMillis() - start)/1000 +
                    " секунд");
        else
            jlab2.setText(jlab2.getText() + (double) (cal.getTimeInMillis() - start)/1000 +
                    " секунд");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new SimpleButtonApplication());
    }
}

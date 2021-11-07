package laboratorywork4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioButttonDemo implements ActionListener {

    JLabel jlabOptions;
    JLabel jlabWhat;
    JCheckBox jcbOptions;
    JRadioButton jrbSpeed;
    JRadioButton jrbSize;
    JRadioButton jrbDebug;

    RadioButttonDemo() {
        JFrame jfrm = new JFrame("Demonstrate Radio Buttons");

        jfrm.getContentPane().setLayout(new GridLayout(6, 1));

        jfrm.setSize(300, 150);

        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jlabOptions = new JLabel("Choose Option:");
        jlabWhat = new JLabel("Option selected: Speed");

        jcbOptions = new JCheckBox("Enable Options");

        jrbSpeed = new JRadioButton("Maximize Speed", true);
        jrbSize = new JRadioButton("Minimize Size");
        jrbDebug = new JRadioButton("Debug");

        ButtonGroup bg = new ButtonGroup();
        bg.add(jrbSpeed);
        bg.add(jrbSize);
        bg.add(jrbDebug);

        jrbSpeed.setEnabled(false);
        jrbSize.setEnabled(false);
        jrbDebug.setEnabled(false);

        jcbOptions.addItemListener(ie -> {
            if(jcbOptions.isSelected()) {
                jrbSpeed.setEnabled(true);
                jrbSize.setEnabled(true);
                jrbDebug.setEnabled(true);
            }
            else {
                jrbSpeed.setEnabled(false);
                jrbSize.setEnabled(false);
                jrbDebug.setEnabled(false);
            }
        });

        jrbSpeed.addActionListener(this);
        jrbSize.addActionListener(this);
        jrbDebug.addActionListener(this);

        jfrm.getContentPane().add(jcbOptions);
        jfrm.getContentPane().add(jlabOptions);

        jfrm.getContentPane().add(jrbSpeed);
        jfrm.getContentPane().add(jrbSize);
        jfrm.getContentPane().add(jrbDebug);
        jfrm.getContentPane().add(jlabWhat);

        jfrm.setVisible(true);
    }

    public void actionPerformed(ActionEvent ie) {
        String opts = "";

        if(jrbSpeed.isSelected()) opts = "Speed ";
        else if(jrbSize.isSelected()) opts = "Size ";
        else opts = "Debug";

        jlabWhat.setText("Option selected: " + opts);
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(RadioButttonDemo::new);
    }
}

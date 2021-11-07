package laboratorywork4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CheckBoxDemo implements ItemListener {

    JLabel jlabOptions;
    JLabel jlabWhat;
    JLabel jlabChange;
    JCheckBox jcbOptions;
    JCheckBox jcbSpeed;
    JCheckBox jcbSize;
    JCheckBox jcbDebug;

    CheckBoxDemo() {
        JFrame jfrm = new JFrame("Demonstrate Check Boxes");

        jfrm.getContentPane().setLayout(new GridLayout(7, 1));

        jfrm.setSize(300, 150);

        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create two labels.
        jlabOptions = new JLabel("Options:");
        jlabChange = new JLabel("");
        jlabWhat = new JLabel("Options selected:");

        jcbOptions = new JCheckBox("Enable Options");
        jcbSpeed = new JCheckBox("Maximize Speed");
        jcbSize = new JCheckBox("Minimize Size");
        jcbDebug = new JCheckBox("Debug");

        jcbSpeed.setEnabled(false);
        jcbSize.setEnabled(false);
        jcbDebug.setEnabled(false);

        jcbOptions.addItemListener(ie -> {
            if(jcbOptions.isSelected()) {
                jcbSpeed.setEnabled(true);
                jcbSize.setEnabled(true);
                jcbDebug.setEnabled(true);
            }
            else {
                jcbSpeed.setEnabled(false);
                jcbSize.setEnabled(false);
                jcbDebug.setEnabled(false);
            }
        });

        jcbSpeed.addItemListener(this);
        jcbSize.addItemListener(this);
        jcbDebug.addItemListener(this);

        jfrm.getContentPane().add(jcbOptions);
        jfrm.getContentPane().add(jlabOptions);

        jfrm.getContentPane().add(jcbSpeed);
        jfrm.getContentPane().add(jcbSize);
        jfrm.getContentPane().add(jcbDebug);
        jfrm.getContentPane().add(jlabChange);
        jfrm.getContentPane().add(jlabWhat);

        jfrm.setVisible(true);
    }

    public void itemStateChanged(ItemEvent ie) {
        String opts = "";

        JCheckBox cb = (JCheckBox) ie.getItem();

        if(ie.getStateChange() == ItemEvent.SELECTED)
            jlabChange.setText("Selection change: " +
                    cb.getText() + " selected.");
        else
            jlabChange.setText("Selection change: " +
                    cb.getText() + " cleared.");

        if(jcbSpeed.isSelected()) opts += "Speed ";
        if(jcbSize.isSelected()) opts += "Size ";
        if(jcbDebug.isSelected()) opts += "Debug ";

        jlabWhat.setText("Options selected: " + opts);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(CheckBoxDemo::new);
    }
}

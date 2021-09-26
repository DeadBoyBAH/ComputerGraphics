package Laboratory_work1;

import javax.swing.*;

public class SimpleSwingApplication {

    SimpleSwingApplication() {
        JFrame jFrame = new JFrame("Laboratory work 1");
        jFrame.setSize(275, 100);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel jLabel = new JLabel("I study at RSREU");
        jFrame.getContentPane().add(jLabel);
        jFrame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new SimpleSwingApplication());
    }
}

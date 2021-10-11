package laboratorywork2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculateCostApplication implements ActionListener {

    JTextField productInput = new JTextField(11);
    JTextField weightInput = new JTextField(11);
    JLabel productLabel =  new JLabel("product name");
    JLabel weightLabel = new JLabel("product weight");
    JLabel result = new JLabel("result: ");

    CalculateCostApplication() {

        JFrame jfrm = new JFrame("Calculate cost application");
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(300, 200);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfrm.add(productLabel);
        jfrm.add(productInput);
        jfrm.add(weightLabel);
        jfrm.add(weightInput);

        JButton button = new JButton("calculate");
        button.addActionListener(this);
        jfrm.add(button);
        jfrm.add(result);

        jfrm.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double cost = 0;
        if (!weightInput.getText().equals("") && !productInput.equals("")) {
            switch (productInput.getText()) {
                case "potato": {
                    cost = Integer.parseInt(weightInput.getText())*50.5;
                    break;
                }
                case "tomato": {
                    cost = Integer.parseInt(weightInput.getText())*111.4;
                    break;
                }
            }
            result.setText("result: " + cost);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CalculateCostApplication());
    }
}

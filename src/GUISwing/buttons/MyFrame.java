package GUISwing.buttons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    private JButton button;
    private JLabel label;

    MyFrame() {
        //JButton button = new JButton();
        ImageIcon icon = new ImageIcon("e:\\javadoc\\test.png");

        ImageIcon icon2 = new ImageIcon("e:\\javadoc\\утка.png");
        label = new JLabel();
        label.setIcon(icon2);
        label.setBounds(150,250,150,150);
        label.setVisible(false);

        button = new JButton();
        button.setBounds(200, 100, 250, 100);
        button.addActionListener(this);
        button.setText("I'm a button!");
        button.setFocusable(false);
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans", Font.BOLD,25));
        button.setIconTextGap(-15);
        button.setForeground(Color.blue);
        button.setBackground(Color.gray);
        button.setBorder(BorderFactory.createEtchedBorder());
       // button.setEnabled(false);
        //  button.addActionListener(e -> System.out.println("clicked on button"));

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setTitle("button");
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.add(button);

        this.add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
//            System.out.println("clicked on button");
//            button.setEnabled(false);
            label.setVisible(true);
        }
    }
}

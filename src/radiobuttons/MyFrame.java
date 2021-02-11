package radiobuttons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JRadioButton pizzaButton;
    JRadioButton hamburgerButton;
    JRadioButton hotdogButton;

    ImageIcon pizzaIcon;
    ImageIcon hamburgerIcon;
    ImageIcon hotdogIcon;

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        pizzaIcon = new ImageIcon("e:\\javadoc\\pizza.png");
        hamburgerIcon = new ImageIcon("e:\\javadoc\\hamburger.png");
        hotdogIcon = new ImageIcon("e:\\javadoc\\hotdog.png");

//        JRadioButton pizzaButton = new JRadioButton("pizza");
        pizzaButton = new JRadioButton("pizza");
//        JRadioButton hamburgerButton = new JRadioButton("hamburger");
        hamburgerButton = new JRadioButton("hamburger");
//        JRadioButton hotdogButton = new JRadioButton("hotdog");
        hotdogButton = new JRadioButton("hotdog");

        ButtonGroup group = new ButtonGroup();
        group.add(pizzaButton);
        group.add(hamburgerButton);
        group.add(hotdogButton);

        this.add(pizzaButton);
        this.add(hamburgerButton);
        this.add(hotdogButton);

        pizzaButton.setIcon(pizzaIcon);
        hamburgerButton.setIcon(hamburgerIcon);
        hotdogButton.setIcon(hotdogIcon);

        this.pack();
        this.setVisible(true);

        pizzaButton.addActionListener(this);
        hamburgerButton.addActionListener(this);
        hotdogButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == pizzaButton) {
            System.out.println("You ordered pizza!");
        } else if (e.getSource() == hamburgerButton) {
            System.out.println("You ordered a hamburger");
        } else if (e.getSource() == hotdogButton) {
            System.out.println("You orered a hotdog!");
        }
    }
}

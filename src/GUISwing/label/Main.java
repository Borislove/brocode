package GUISwing.label;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        //JLabel = a GUI display area for a string of text, an image,or both

        ImageIcon image = new ImageIcon("e:\\javadoc\\frolic.png");
        Border border = BorderFactory.createLineBorder(Color.green, 3);

        JLabel label = new JLabel(); //create a label
        label.setText("Hello!!!"); //set text of label
        label.setIcon(image);

        label.setHorizontalTextPosition(JLabel.CENTER); //set text LEFT, CENTER,RIGHT of imageicon
        label.setVerticalTextPosition(JLabel.TOP); //set text TOP,CENTER,BOTTOM of imageicon
        label.setForeground(Color.green); //set font color of text
        label.setFont(new Font("MV Boli", Font.PLAIN, 20));   //set font of text
        label.setIconTextGap(3);  //set gap of text to image
        label.setBackground(Color.black); //set background color
        label.setOpaque(true); //display background color
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER); //set vetiocal position of icon+text within label
        label.setHorizontalAlignment(JLabel.CENTER); //set horizontal position of icon + text within label
        //label.setBounds(0, 0, 250, 250); //set x, y position within frame as well as dimensions

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
       // frame.setSize(500, 500);

        //frame.setLayout(null); //лейбел будет виден по значению
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        frame.add(label);
        frame.pack();
    }
}

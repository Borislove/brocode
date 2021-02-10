package GUISwing.layeredpane;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        // JLayeredPane = Swing container that provides a
        //				third dimension for positioning components
        //				ex. depth, Z-index

        JLabel label1 = new JLabel();
        label1.setOpaque(true);
        label1.setBackground(Color.blue);
        label1.setBounds(50, 50, 200, 200);

        JLabel label2 = new JLabel();
        label2.setOpaque(true);
        label2.setBackground(Color.green);
        label2.setBounds(100, 100, 200, 200);

        JLabel label3 = new JLabel();
        label3.setOpaque(true);
        label3.setBackground(Color.orange);
        label3.setBounds(150, 150, 200, 200);

        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(0, 0, 500, 500);

        //layeredPane.add(label1, JLayeredPane.DEFAULT_LAYER);
        //layeredPane.add(label2, JLayeredPane.DEFAULT_LAYER);
        //layeredPane.add(label3, JLayeredPane.DRAG_LAYER); //поверх

        layeredPane.add(label1, Integer.valueOf(0));
        layeredPane.add(label2, Integer.valueOf(2)); //поверх
        layeredPane.add(label3, Integer.valueOf(1));


        JFrame frame = new JFrame("JLayeredPane");

        frame.add(layeredPane);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        //frame.setSize(500, 500);
        frame.setSize(new Dimension(500, 500));

        frame.setVisible(true);
    }
}

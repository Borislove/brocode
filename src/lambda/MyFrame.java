package lambda;

import javax.swing.*;

public class MyFrame extends JFrame {

    JButton myButton = new JButton("My Button 1");
    JButton myButton2 = new JButton("My Button 2");

    MyFrame() {

        myButton.setBounds(100, 100, 200, 100);

//        myButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("You clicked a button!");
//            }
//        });

        myButton.addActionListener(
                (e) -> System.out.println("You clicked a button! 1"));
        ///////////////////////////////////

        myButton2.setBounds(100, 200, 200, 100);
        myButton2.addActionListener(
                (e) -> System.out.println("You clicked a button! 2"));

        this.add(myButton);
        this.add(myButton2);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(null);
        this.setVisible(true);
    }
}

package joptionpane;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        //JOptionPane = pop up a standard dialog box that prompts users for a value
        //				or informs them of something


        //////////////////////////////////////////////////////////////////////////
        //  JOptionPane.showMessageDialog(null,"This is some useless info");
        //JOptionPane.showMessageDialog(null, "This is some useless info", "title", JOptionPane.PLAIN_MESSAGE);
//        JOptionPane.showMessageDialog(null, "This is some useless info", "title", JOptionPane.INFORMATION_MESSAGE);
//        JOptionPane.showMessageDialog(null, "really?", "title", JOptionPane.QUESTION_MESSAGE);
//        JOptionPane.showMessageDialog(null, "You're computer has A VIRUS", "title", JOptionPane.WARNING_MESSAGE);
//    JOptionPane.showMessageDialog(null, "Call tech support NOW OR ELSE!!!", "title", JOptionPane.ERROR_MESSAGE);

        //System.out.println(JOptionPane.showConfirmDialog(null, "text", "this is my tittle", JOptionPane.YES_NO_CANCEL_OPTION));

//        int answer = JOptionPane.showConfirmDialog(null, "text", "this is my tittle", JOptionPane.YES_NO_CANCEL_OPTION);
//        String name = JOptionPane.showInputDialog("What is your name?:");
//        System.out.println("Hello "+name);

        //JOptionPane.showOptionDialog(null, "You are awesome!", "secret message", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, 0);

        String[] responses = {"No, you're awesome!", "thank you!", "*blush*"};

        ImageIcon icon = new ImageIcon("e:\\javadoc\\test.png");
        JOptionPane.showOptionDialog(null,
                "You are awesome!",
                "secret message",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                icon,
                responses,
                0);
    }
}

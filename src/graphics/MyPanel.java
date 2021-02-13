package graphics;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {

    Image image;

    MyPanel() {
        image = new ImageIcon("e:\\javadoc\\background.jpg").getImage();
        this.setPreferredSize(new Dimension(500, 500));
    }

    public void paint(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;

        //   g2D.setPaint(Color.blue);
        //  g2D.setStroke(new BasicStroke(5)); //ширина линии
        //g2D.drawLine(0, 0, 500, 500);

        //прямоугольник
        //g2D.setPaint(Color.pink);
        //g2D.drawRect(0,0,100,200); // прямоугольник без заливки
        //  g2D.fillRect(0,0,50,50); //заливка

        //круг
        //g2D.setPaint(Color.orange);
        //g2D.drawOval(20, 20, 50, 50);
        //g2D.fillOval(20,20,100,100);

        //дуга
//        g2D.setPaint(Color.red);
        //g2D.drawArc(0,0,100,100,0,180); //дуга
        //g2D.drawArc(0,0,100,100,180,180);
//        g2D.fillArc(0,0,100,100,0,180);
//        g2D.setPaint(Color.white);
//        g2D.fillArc(0,0,100,100,180,180);

//        int[] xPoints = {150, 250, 350};
//        int[] yPoints = {300, 150, 300};
        //g2D.drawPolygon(xPoints, yPoints, 3);
        //g2D.fillPolygon(xPoints, yPoints, 3);

        //текст
//        g2D.setPaint(Color.magenta);
//        g2D.setFont(new Font("Ink Free", Font.BOLD, 50));
//        g2D.drawString("WINNER", 50, 50);

        g2D.drawImage(image, 0, 0, null);
    }
}

import javax.swing.*;
import java.awt.*;

public class Template extends JFrame {
    Template() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);
    }
}

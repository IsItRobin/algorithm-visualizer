import javax.swing.*;
import java.awt.*;

public class myframe extends JFrame {
    myframe() {
        // Set up frame size, behavior, and appearance
        this.setSize(720, 560);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setResizable(false);
        this.getContentPane().setBackground(new Color(248, 248, 248));

        // Remove the layout manager, as you're using manual positioning later
        this.setLayout(null);
    }
}

import javax.swing.*;
import java.awt.*;

public class myframe extends JFrame {
    myframe(){

        this.setSize(720 , 560);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setResizable(false);
        this.getContentPane().setBackground(new Color(248,248,248));
        setLayout(new BorderLayout());
    }
}
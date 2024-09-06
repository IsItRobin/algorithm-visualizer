import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CircleButton extends JButton {
    public CircleButton(String text) {
        super(text);
        setFocusPainted(false);  // Remove focus outline when clicked
        setContentAreaFilled(false);  // Remove the default button background
        setForeground(Color.black);  // Set text color to white
        setBackground(new Color(255, 255, 255));  // Set a background color
    }

    @Override
    protected void paintComponent(Graphics g) {
        if (getModel().isArmed()) {
            g.setColor(getBackground().darker());  // Button color when clicked
        } else {
            g.setColor(getBackground());
        }
        g.fillOval(0, 0, getWidth(), getHeight());  // Make the button circular
        super.paintComponent(g);
    }

    @Override
    protected void paintBorder(Graphics g) {
        g.setColor(getBackground().darker());
        g.drawOval(0, 0, getWidth() - 1, getHeight() - 1);  // Draw a border
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(100, 100);  // Ensure the button is square to appear as a circle
    }
}

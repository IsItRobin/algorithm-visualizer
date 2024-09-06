import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyButton extends JButton {

    private int radius; // The radius for the rounded corners

    public MyButton(String text, int radius) {
        super(text);
        this.radius = radius; // Set the radius for the curved button

        // Add ActionListener to handle button click event
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // When the button is clicked, open a new window (JFrame)
                JFrame newWindow = new JFrame("New Window");
                newWindow.setSize(300, 200);
                newWindow.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                newWindow.setVisible(true);
            }
        });

        // Remove the default border and make it transparent
        setContentAreaFilled(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        // Cast Graphics to Graphics2D for better control
        Graphics2D g2 = (Graphics2D) g.create();

        // Set rendering hints for better edges
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Set button background color (you can change this)
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), radius, radius);

        // Paint the text
        super.paintComponent(g);
    }

    @Override
    protected void paintBorder(Graphics g) {
        // Cast Graphics to Graphics2D for better control
        Graphics2D g2 = (Graphics2D) g.create();

        // Set the border color (you can change this)
        g2.setColor(getForeground());

        // Set rendering hints for smoother lines
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Draw the rounded border
        g2.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, radius, radius);

        g2.dispose();
    }

    @Override
    public boolean contains(int x, int y) {
        // Make sure the hit detection works properly for rounded corners
        return (new java.awt.geom.RoundRectangle2D.Float(0, 0, getWidth(), getHeight(), radius, radius)).contains(x, y);
    }
}

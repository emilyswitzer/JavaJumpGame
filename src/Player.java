import javax.swing.*;
import java.awt.*;
import java.util.Iterator;

public class Player extends Rectangle {

    private Color playerColour = new Color(57, 52, 88);
    public int width;
    public int height;
    public Player(int height, int width) {
        super(height, width);
    }

    public void paintComponent(Graphics g) {

        Graphics2D g2 = (Graphics2D) g;

        g2.setColor(playerColour);

    }
}

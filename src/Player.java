import javax.swing.*;
import java.awt.*;
import java.util.Iterator;

public class Player extends Rectangle {

    private Color playerColour = new Color(57, 52, 88);
    public Player(int width, int height) {
        super(width, height);
    }

    public void paintComponent(Graphics g) {

        Graphics2D g2 = (Graphics2D) g;

        g2.setColor(playerColour);

    }
}

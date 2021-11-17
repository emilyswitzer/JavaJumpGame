import java.awt.*;


public class Obstacle extends Square implements Shape  {

    private int R;
    private int G;
    private int B;

    public Obstacle(int x, int y) {

        super(20);
        setLocation(x, y);
        R = (int) (Math.random() * 256);
        G = (int) (Math.random() * 256);
        B = (int) (Math.random() * 256);

    }


    public void draw(Graphics2D g) {
        g.setColor(new Color(R,G,B));
        g.fillRect(getX(), getY(), side, side);
    }
}
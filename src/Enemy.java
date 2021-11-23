import java.awt.*;

public class Enemy implements Drawable {

    public int side;
    private boolean moving;
    private int x;
    private int y;

    public Enemy(int side) {

        this.side=side;

    }

    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }

    public boolean getMovingObstacle() {
        return moving;
    }
    public void setMovingObstacle(boolean moving) {
        this.moving = moving;
    }

    public void setLocation(int x, int y) {
        this.x=x;
        this.y=y;
    }

    public void draw(Graphics2D g) {
        g.fillRect(getX(), getY(), side, side);
    }
}
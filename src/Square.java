import java.awt.*;

public class Square implements Shape {

    public int side;
    private boolean moving;

    public Square(int side) {

        super();
        this.side=side;

    }
    private int x;
    private int y;

    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }

    public int addAccessory() {
        return 0;
    }
    public Color addColour() { return null;

    }
    public boolean getMovingObstacle() {
        return moving;
    }

    public void setMovingObstacle(boolean moving) {
        this.moving = moving;
    }

    @Override
    public void setLocation(int x, int y) {
        this.x=x;
        this.y=y;
    }

    @Override
    public void draw(Graphics g) {

    }
}
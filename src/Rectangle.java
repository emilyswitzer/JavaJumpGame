import java.awt.*;
public abstract class Rectangle implements Shape{

    private final int WIDTH =35;
    private final int HEIGHT =65;
    private int x;
    private int y;
    public Rectangle() { }


    public void setLocation(int x, int y){
        this.x=x;
        this.y=y;
    }

    public boolean contains(int x, int y) {
        return x >= this.x && x <= this.x + WIDTH && y >= this.y && y <= this.y + HEIGHT;
    }

    public abstract int addAccessory();
    public abstract Color addColour();

}

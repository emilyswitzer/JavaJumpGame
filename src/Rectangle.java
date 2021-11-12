import java.awt.*;
import java.util.ArrayList;

public abstract class Rectangle{

    private int width=35;
    private int height=65;
    private int x;
    private int y;
    private boolean moving;

    public Rectangle() {

        this.width = width;
        this.height = height;

    }

    public int getWidth(){
        return this.width;
    }
    public int getHeight(){
        return this.height;
    }
    public void setWidth(){
        this.width=width;
    }
    public void setHeight(){
        this.height=height;
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

    public void setLocation(int x, int y){
        this.x=x;
        this.y=y;
    }


    public boolean contains(int x, int y) {
        if (x >= this.x && x <= this.x + width && y >= this.y && y <= this.y + height)
            return true;
        return false;    }

    public abstract int addAccessory();
    public abstract Color addColour();

}

import java.awt.*;

public class Player extends Character {
    private final int WIDTH =35;
    private final int HEIGHT =65;
    public Player() {
        super();

    }
    private int x;
    private int y;


    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }

    public void setLocation(int x, int y){
        this.x=x;
        this.y=y;
    }

    public boolean doesContain(int x, int y) {
        return x >= this.x && x <= this.x + WIDTH && y >= this.y && y <= this.y + HEIGHT;
    }
    public void draw(Graphics2D g) {
        g.fillRect(getX(), getY(), WIDTH, HEIGHT);
    }
}

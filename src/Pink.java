import java.awt.*;

public class Pink extends AccessoryDecorator implements Shape {

    private Rectangle r;
    public Pink(Rectangle r) {
        super();
        this.r=r;
    }

    public Color addColour() {
        return Color.MAGENTA;

    }

    public int addAccessory() {
        return 50;
    }

    @Override
    public void draw(Graphics g) {

    }
}

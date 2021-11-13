import java.awt.*;

public class Green extends AccessoryDecorator {

    private Rectangle r;

    public Green(Rectangle r) {
        super();
        this.r=r;
    }
    public Color addColour() {
        return Color.GREEN;

    }


    public int addAccessory() {
        return 50;
    }

    @Override
    public void draw(Graphics g) {

    }
}


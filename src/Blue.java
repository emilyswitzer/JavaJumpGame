import java.awt.*;

public class Blue extends AccessoryDecorator {

    private Rectangle r;
    private Color[] c;
    public Blue(Rectangle r) {
        super();
        this.r=r;
    }

    public Color addColour() {
        return Color.BLUE;

    }

    public int addAccessory() {
        return 50;
    }

    @Override
    public void draw(Graphics g) {

    }
}


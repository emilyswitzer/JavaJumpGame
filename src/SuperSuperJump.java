import java.awt.*;

public class SuperSuperJump extends AccessoryDecorator {
    private Rectangle r;
    public SuperSuperJump(Rectangle r) {
        super();
        this.r=r;
    }

    public Color addColour() {
        return r.addColour();
    }

    public int addAccessory() {
        return 85;
    }

    @Override
    public void draw(Graphics g) {

    }
}

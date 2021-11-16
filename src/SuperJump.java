import java.awt.*;

public class SuperJump extends AccessoryDecorator {
    private Rectangle r;
    public SuperJump(Rectangle r) {
        super();
        this.r=r;
    }



    public Color addColour() {
        return r.addColour();
    }

    public int addAccessory() {
        return 65;
    }


}

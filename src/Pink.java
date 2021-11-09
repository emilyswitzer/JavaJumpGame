import java.awt.*;
import java.util.Random;

public class Pink extends AppearanceDecorator {



    public Pink(int width, int height) {
        super(width, height);
    }

    public Color colour() {
        return Color.PINK;
    }

    public int defense() {
        return 0;
    }

    public int jump() {
        return 0;
    }
}

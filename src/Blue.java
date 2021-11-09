import java.awt.*;
import java.util.Random;

public class Blue extends AppearanceDecorator {



    public Blue(int width, int height) {
        super(width, height);
    }

    public Color colour() {
        return Color.BLUE;
    }

    public int defense() {
        return 0;
    }

    public int jump() {
        return 0;
    }
}


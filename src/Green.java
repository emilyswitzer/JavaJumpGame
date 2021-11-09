import java.awt.*;
import java.util.Random;

public class Green extends AppearanceDecorator {



    public Green(int width, int height) {
        super(width, height);
    }

    public Color colour() {
        return Color.GREEN;
    }

    public int defense() {
        return 0;
    }

    public int jump() {
        return 0;
    }
}


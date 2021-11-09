import java.awt.*;

public class Player extends Rectangle {

    public Color playerColour;
    public Player(int width, int height) {
        super(width, height);
    }

    public int defense() {
        return 0;
    }

    public int jump() {
        return 0;
    }

    public Color colour() {
        return playerColour;
    }

}

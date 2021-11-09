import java.awt.*;

public class BluePlayer extends Rectangle {

    public final Color PLAYER_COLOUR = new Color(3, 3, 252);
    public BluePlayer(int width, int height) {
        super(width, height);
    }

    public int defense() {
        return 0;
    }

    public int jump() {
        return 0;
    }
}

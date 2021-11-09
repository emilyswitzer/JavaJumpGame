import java.awt.*;

public class GreenPlayer extends Rectangle {

    public final Color PLAYER_COLOUR = new Color(40, 252, 3);
    public GreenPlayer(int width, int height) {
        super(width, height);
    }

    public int defense() {
        return 0;
    }

    public int jump() {
        return 0;
    }

}

import java.awt.*;

public class Player extends Rectangle {

    public final Color PLAYER_COLOUR = new Color(245, 66, 218);
    public Player(int width, int height) {
        super(width, height);
    }

    public int defense() {
        return 0;
    }

    public int jump() {
        return 0;
    }

}

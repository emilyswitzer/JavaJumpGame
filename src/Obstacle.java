import java.awt.geom.Point2D;

public abstract class Obstacle {

    private Obstacle o;

    public Obstacle() {



    }

    public Obstacle getObstacle() {
        return o;
    }

    public abstract void spawnObstacle();



}
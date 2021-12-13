package Factory;

public class GroundObstacle extends Obstacle {
    private final GroundObstacleType groundObs;

    public GroundObstacle(GroundObstacleType groundObs){
        this.groundObs = groundObs;
    }

    public String toString() {
        return "Ground Obstacle: " + groundObs;
    }

}

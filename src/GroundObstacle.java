public class GroundObstacle implements Obstacle {
    private final GroundObstacleType groundObstacleType;

    public GroundObstacle(GroundObstacleType groundObs){
        this.groundObstacleType = groundObs;
    }

    public String toString() {
        return "Ground Obstacle: " + groundObstacleType;
    }

}

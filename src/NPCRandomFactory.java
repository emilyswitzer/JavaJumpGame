import java.util.EnumMap;
import java.util.Map;

public class NPCRandomFactory implements ObstacleFactory {

    private Map<GroundObstacleType, GroundObstacle> randomObstacles;

    public Obstacle generateRandomObstacle() {
        randomObstacles = new EnumMap<>(GroundObstacleType.class);
        GroundObstacle x = null;
        for (GroundObstacleType o : GroundObstacleType.values()) {
            randomObstacles.put(o, new GroundObstacle(GroundObstacleType.getRandom()));

            x = randomObstacles.get(o);
        }
        return x;
    }
    public Obstacle generateObstacle(FlyingObstacleType o) {
        return null;
    }
}


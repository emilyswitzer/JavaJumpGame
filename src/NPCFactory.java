import java.util.EnumMap;
import java.util.Map;

public class NPCFactory implements ObstacleFactory {

    private Map<FlyingObstacleType, FlyingObstacle> obstacle;

    public Obstacle generateObstacle(FlyingObstacleType o) {
        obstacle = new EnumMap<>(FlyingObstacleType.class);
        for (FlyingObstacleType type : FlyingObstacleType.values()) {
            obstacle.put(type, new FlyingObstacle(type));

        }
        return obstacle.get(o);
    }
    public Obstacle generateRandomObstacle() {
        return null;
    }


}
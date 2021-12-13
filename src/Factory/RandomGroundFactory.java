package Factory;

import Factory.FlyingObstacleType;
import Factory.GroundObstacle;
import Factory.GroundObstacleType;

import java.util.EnumMap;
import java.util.Map;

public class RandomGroundFactory implements ObstacleFactory {

    public Obstacle generateObstacle() {
        Map<GroundObstacleType, GroundObstacle> randomObstacles = new EnumMap<>(GroundObstacleType.class);
        GroundObstacle x = null;
        for (GroundObstacleType o : GroundObstacleType.values()) {
            randomObstacles.put(o, new GroundObstacle(GroundObstacleType.getRandom()));

            x = randomObstacles.get(o);
        }
        return x;
    }

}


public interface ObstacleFactory {

    Obstacle generateObstacle(FlyingObstacleType o);

    Obstacle generateRandomObstacle();
}


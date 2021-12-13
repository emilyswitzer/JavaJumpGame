package Factory;

public enum FlyingObstacleType {
    BIRD,
    CLOUD,
    BULLET;


    public static FlyingObstacleType getRandom() {
        return values()[(int) (Math.random() * values().length)];
    }
}


package Factory;

public enum GroundObstacleType {
    SPIKE,
    FENCE,
    HOLE,
    BOX;



    public static GroundObstacleType getRandom() {
        return values()[(int) (Math.random() * values().length)];
    }
}


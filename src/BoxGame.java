public class BoxGame {

    public static void main(String[] args) {

        ObstacleFactory obstacleFactory = new NPCFactory();
        Obstacle fence = obstacleFactory.generateObstacle(FlyingObstacleType.BIRD);
        Obstacle spike = obstacleFactory.generateObstacle(FlyingObstacleType.CLOUD);

        System.out.println(fence);
        System.out.println(spike);

        ObstacleFactory randomFactory = new NPCRandomFactory();
        System.out.println((randomFactory.generateRandomObstacle()));

        }
    }

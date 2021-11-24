public class BoxGame {

    public static void main(String[] args) {

        ObstacleFactory obstacleFactory = new NPCFactory();
        System.out.println(obstacleFactory.generateObstacle(FlyingObstacleType.BIRD));
        System.out.println(obstacleFactory.generateObstacle(FlyingObstacleType.CLOUD));

        ObstacleFactory randomFactory = new NPCRandomFactory();
        System.out.println((randomFactory.generateRandomObstacle()));

        }
    }

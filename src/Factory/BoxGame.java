package Factory;

public class BoxGame {

    public static void main(String[] args) {

        ObstacleFactory randomFactory = new RandomGroundFactory();
        System.out.println((randomFactory.generateObstacle()));
        System.out.println((randomFactory.generateObstacle()));
        System.out.println((randomFactory.generateObstacle()));

        }
    }

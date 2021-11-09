import java.util.ArrayList;
import java.util.Iterator;



public class ObstacleList implements Iterable {

    // properties
    private ArrayList<Obstacle> obstacles;


    public ObstacleList() {

        obstacles = new ArrayList<Obstacle>();
    }


    public void add(Obstacle o) {

        obstacles.add(o);
    }



    public void remove() {

        for (int i = 0; i < obstacles.size(); i++) {
            if ((obstacles.get(i)).getMovingObstacle()) {
                obstacles.remove(i);
                i--;
            }
        }
    }


    public int size() {

        return obstacles.size();
    }

    public Iterator<Obstacle> iterator() {

        return obstacles.iterator();
    }

    public Obstacle getObstacle(int i) {
        return obstacles.get(i);
    }
}
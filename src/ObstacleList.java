import java.util.ArrayList;
import java.util.Iterator;



public class ObstacleList implements Iterable {


    private ArrayList<BoxEnemy> obstacles;


    public ObstacleList() {

        obstacles = new ArrayList<BoxEnemy>();
    }


    public void add(BoxEnemy o) {

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

    public Iterator<BoxEnemy> iterator() {

        return obstacles.iterator();
    }

    public BoxEnemy getObstacle(int i) {
        return obstacles.get(i);
    }
}
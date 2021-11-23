import java.util.ArrayList;
import java.util.Iterator;



public class NPCFactory{


    public NPCFactory() {
    }
    public void startFactory(){
     for (int i = 0; i < 10; i++) {
         SpikeObstacle s= new SpikeObstacle();
         s.spawnObstacle();

     }

    }

}


package Strategy;

import Strategy.Cloud;
import Strategy.EnvironmentBehaviour;

public class MountainLevel extends Level {

    private EnvironmentBehaviour w= new Cloud();

    public void startEnvironment(){
        w.initEnvironment();
    }

    public void initLevel(){
        System.out.println("Mountain Strategy.Level");
    }
}

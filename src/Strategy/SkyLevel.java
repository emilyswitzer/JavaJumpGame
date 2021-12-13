package Strategy;

import Strategy.Cloud;
import Strategy.EnvironmentBehaviour;
import Strategy.Level;

public class SkyLevel extends Level {

    private EnvironmentBehaviour envB= new Cloud();

    public SkyLevel(){

    }
    public void startEnvironment(){
        envB.initEnvironment();
    }

    public void initLevel(){
        System.out.println("Sky Strategy.Level");
    }
}

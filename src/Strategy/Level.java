package Strategy;

import Strategy.EnvironmentBehaviour;

public abstract class Level {

    private EnvironmentBehaviour environmentBehaviour;

    public Level(){
    }

    public void startEnvironment(){
        environmentBehaviour.initEnvironment();
    }
    public abstract void initLevel();

}
package Strategy;

import Strategy.Dark;

public class CaveLevel extends Level {

    private EnvironmentBehaviour envB = new Dark();

    public void startEnvironment(){ envB.initEnvironment();
    }

    public void initLevel(){
        System.out.println("Cave Level");
    }
}

package Strategy;

import Strategy.EnvironmentBehaviour;

public class Rain implements EnvironmentBehaviour {
    public void initEnvironment() {
        System.out.println("The rain is falling from a dark cloudy sky");
    }
}

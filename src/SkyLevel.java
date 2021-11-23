public class SkyLevel extends Level {

    private EnvironmentBehaviour envB= new Cloud();

    public SkyLevel(){

    }
    public void startEnvironment(){
        envB.initEnvironment();
    }

    public void initLevel(){
        System.out.println("Sky Level");
    }
}

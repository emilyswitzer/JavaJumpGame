public class MountainLevel extends Level {

    private EnvironmentBehaviour w= new Cloud();

    public MountainLevel(){

    }
    public void startEnvironment(){
        w.initEnvironment();
    }

    public void initLevel(){
        System.out.println("Mountain Level");
    }
}

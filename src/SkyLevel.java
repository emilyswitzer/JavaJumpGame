public class SkyLevel extends Level {

    private EnvironmentBehaviour w= new Cloud();

    public SkyLevel(){

    }
    public void startEnvironment(){
        w.initEnvironment();
    }

    public void initLevel(){
        System.out.println("Sky Level");
    }
}

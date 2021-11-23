public class CaveLevel extends Level {

    private EnvironmentBehaviour w = new Dark();

    public CaveLevel(){

    }
    public void startEnvironment(){
        w.initEnvironment();
    }

    public void initLevel(){
        System.out.println("Cave Level");
    }
}

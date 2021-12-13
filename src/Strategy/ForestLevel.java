package Strategy;

import Strategy.EnvironmentBehaviour;

public class ForestLevel extends Level {

        private EnvironmentBehaviour w= new Rain();

        public ForestLevel(){

        }
        public void startEnvironment(){
            w.initEnvironment();
        }

        public void initLevel(){
            System.out.println("Forest Strategy.Level");
        }

}

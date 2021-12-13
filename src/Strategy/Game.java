package Strategy;

import Strategy.CaveLevel;

public class Game {

    public static void main(String[] args) {
        Level cave = new CaveLevel();
        cave.initLevel();
        cave.startEnvironment();

        Level forest = new ForestLevel();
        forest.initLevel();
        forest.startEnvironment();

        Level sky = new SkyLevel();
        sky.initLevel();
        sky.startEnvironment();


    }
}
import java.awt.*;

public class Square extends Rectangle {


    public int side;

    public Square(int side) {

        super(side, side);
        this.side = side;


    }


    @Override
    public int defense() {
        return 0;
    }

    @Override
    public int jump() {
        return 0;
    }

    @Override
    public Color colour() {
        return null;
    }
}
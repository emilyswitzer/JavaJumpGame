public abstract class Rectangle{

    private int width;
    private int height;
    private int x;
    private int y;
    private int area;
    private boolean moving;


    public Rectangle(int width, int height) {

        this.width = width;
        this.height = height;
        moving = false;

    }
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }



    public boolean getMovingObstacle() {

        return moving;
    }


    public void setMovingObstacle(boolean moving) {

        this.moving = moving;
    }

    public void setLocation(int x, int y){
        this.x=x;
        this.y=y;
    }


    public boolean contains(int x, int y) {


        if (x >= this.x && x <= this.x + width && y >= this.y && y <= this.y + height)
            return true;


        return false;    }


    public abstract int defense();
    public abstract int jump();

}

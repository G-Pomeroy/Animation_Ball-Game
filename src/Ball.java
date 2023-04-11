import java.awt.*;

public class Ball {

    private int size;
    private int xPos;
    private int yPos;
    private int xSpeed = 10;


    public Ball(int size, int xPos, int yPos, int xSpeed){
        this.setSize(size);
        this.setxPos(xPos);
        this.setyPos(yPos);
        this.setxSpeed(xSpeed);
    }


    void drawBall(Graphics g){

        g.setColor(Color.red);
        //g.drawRect(this.getxPos(),this.getyPos(), this.getSize(), this.getSize());
        g.fillOval(this.getxPos(), this.getyPos(), this.getSize(), this.getSize());

    }

    public void moveBallRight(){
        this.setxPos(getxPos() + getxSpeed());
    }

    public void moveBallLeft(){
        this.setxPos(getxPos() - getxSpeed());
    }


    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getxPos() {
        return xPos;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }

    public int getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
    }
}

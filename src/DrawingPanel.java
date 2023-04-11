import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DrawingPanel extends JPanel{

    private Timer timer = new Timer(50, new TimerAction());
    Ball newBall = new Ball(75,265,85,5);
    boolean goingRight = true;

    private JLabel gameOverText;




    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        newBall.drawBall(g);
    }

    public DrawingPanel(){

        Font newFont = new Font("Ubuntu", Font.PLAIN, 32);

        gameOverText = new JLabel("Game Over!");
        gameOverText.setVisible(false);
        gameOverText.setFont(newFont);
        gameOverText.setForeground(Color.GREEN);
        gameOverText.setBounds(215,25,300,100);
        add(gameOverText);









        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                timer.start();
                newBall.setxSpeed(newBall.getxSpeed()+3);

                if(goingRight){
                    goingRight = false;
                } else if (!goingRight) {
                    goingRight = true;
                }
            }
        });
    }

    public void movingBallRight(){
        newBall.moveBallRight();
        this.repaint();
    }

    public void movingBallLeft(){
        newBall.moveBallLeft();
        this.repaint();
    }



    private class TimerAction implements ActionListener {
        @Override
        public void actionPerformed (ActionEvent e){
            if(!goingRight){
                movingBallLeft();
            } else if(goingRight) {
                movingBallRight();
            }

            if(newBall.getxPos() <= 0 || newBall.getxPos() >= 495){
                newBall.setxSpeed(0);
                gameOverText.setVisible(true);
            }
        }
    }
}

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MainFrame extends JFrame{

    private JPanel gameWindow;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MainFrame frame = new MainFrame();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }


    public MainFrame(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 600, 300);

        gameWindow = new JPanel();
        gameWindow.setBorder(new EmptyBorder(5, 5, 5, 5) {
        });
        setContentPane(gameWindow);
        gameWindow.setLayout(new CardLayout(0, 0));


        DrawingPanel drawing = new DrawingPanel();
        drawing.setBackground(Color.WHITE);

        gameWindow.add(drawing);
        drawing.setLayout(null);



    }










}

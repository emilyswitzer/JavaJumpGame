import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.*;
import java.util.Iterator;
import java.util.Scanner;
import javax.swing.*;



public class GamePanel extends JPanel implements Serializable {



    public static final int GROUND = 250;
    public static final int SMALL_SPACE = 150;
    public static final int MAX_SPACE = 300;
    private ObstacleList obstacles; //an arraylist of obstacles
    private Timer obstacleTimer, jumpTimer; //String Timers
    private static int randomGap = (int) (Math.random() * (MAX_SPACE - SMALL_SPACE)) + SMALL_SPACE;
    private boolean jumping;
    private static int jumpHeight = 0;
    private JLabel scoreLabel;
    private JLabel highScoreLabel;
    private int score;
    private int highScore;
    private Rectangle player; //the player box which the user controls
    private boolean isGameOver;


    public GamePanel() {

        setPreferredSize(new Dimension(800, 320));
        setFocusable(true);
        requestFocus();
        scoreLabel = new JLabel();
        scoreLabel.setFont(new Font("Verdana", Font.BOLD, 20));
        scoreLabel.setForeground(new Color(134, 159, 119));
        highScoreLabel = new JLabel();
        highScoreLabel.setFont(new Font("Verdana", Font.BOLD, 20));
        highScoreLabel.setForeground(new Color(253, 233, 234));
        start();
        add(scoreLabel);
        add(highScoreLabel);
        this.addKeyListener(new JumpKeyListener());
        this.addMouseListener(new JumpMouseListener());


    }


    private void start() {

        score = 0;

        try {

            File f = new File("highscores.txt");
            Scanner s = new Scanner(f);
            while (s.hasNextInt()) {
                highScore = s.nextInt();

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        scoreLabel.setText("Score: " + score);
        highScoreLabel.setText("  HighScore: " + highScore);
        jumping = false;
        jumpTimer = new Timer(5, new JumpActionListener());

        player = new Player(35, 60);
        player = new Pink(35,60);


        player.setLocation(50, GROUND - 80 - jumpHeight);
        isGameOver = false;
        obstacles = new ObstacleList();
        obstacles.add(new Obstacle(780, GROUND - 20));
        obstacleTimer = new Timer(5, new ObstacleTimerActionListener());
        obstacleTimer.start();

    }


    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        ImageIcon img = new ImageIcon("images/backgroundimage.jpg");
        img.paintIcon(this, g, 0, 0);
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(player.colour());
        g2.drawRect(50, GROUND - 35 - jumpHeight, 35, 35);
        g2.fillRect(50, GROUND - 35 - jumpHeight, 35, 35);
        player.setLocation(50, GROUND - 80 - jumpHeight);

        Iterator i = obstacles.iterator();
        while (i.hasNext()) {
            ((Obstacle) i.next()).draw(g2);


        }


    }
    public class ObstacleTimerActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {


            for (int i = 0; i < obstacles.size(); i++) {
                Obstacle o = (obstacles.getObstacle(i));
                o.setLocation(o.getX() - 1, o.getY());

                if (o.getX() == -20) {
                    o.setMovingObstacle(true);
                }

            }
            Obstacle o2 = (obstacles.getObstacle(obstacles.size() - 1));
            if (800 - o2.getX() == randomGap) {
                obstacles.add(new Obstacle(780, GROUND - 20));
                randomGap = (int) (Math.random() * (MAX_SPACE - SMALL_SPACE)) + SMALL_SPACE;

                score++;
                scoreLabel.setText("Score: " + score);
            }

            obstacles.remove();

            for (int i = 0; i < 20; i++) {


                if (player.contains((obstacles.getObstacle(0)).getX() + i, (obstacles.getObstacle(0)).getY())) {


                    isGameOver = true;
                }
            }


            if (isGameOver) {


                obstacleTimer.stop();
                jumpTimer.stop();


                if (score > highScore) {
                    highScore = score;
                    JOptionPane.showMessageDialog(null, "New Highscore!");

                    File f = new File("highscores.txt");
                    try {
                        FileWriter fw = new FileWriter(f);
                        fw.write("" + highScore);
                        fw.close();

                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }

                int confirm = JOptionPane.showConfirmDialog(null, scoreLabel.getText() + "\n" + "Play again?", "Game Over", JOptionPane.YES_NO_OPTION);
                if (confirm == JOptionPane.YES_OPTION)
                    start();
                else

                    System.exit(0);
            }

            repaint();
        }
    }
    public class JumpMouseListener extends MouseAdapter {

        public void mouseClicked(MouseEvent e) {

            jumpTimer.setDelay(2);
            jumpTimer.start();


        }

    }

    public class JumpActionListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {


            if (jumpHeight == 50) {
                jumping = true;
            }

            if (jumping) {
                jumpHeight--;
                if (jumpHeight == 0) {
                    jumpTimer.stop();
                    jumping = false;
                    score += 2;
                    scoreLabel.setText("Score: " + score);
                }
            } else {
                jumpHeight++;
            }


        }
    }



    public class JumpKeyListener extends KeyAdapter {

        public void keyPressed(KeyEvent e) {
            if (e.getExtendedKeyCode() == e.VK_SPACE) {
                jumpTimer.setDelay(2);
                jumpTimer.start();
            }

        }
    }


}

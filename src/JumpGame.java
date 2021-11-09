import javax.swing.*;

public class JumpGame {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        JOptionPane.showMessageDialog(null,"Press space to jump!");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("Box Jump");
        f.setLocation(500,200);
        f.add(new GamePanel());
        f.pack();
        f.setResizable(false);
        f.setVisible(true);

    }
}
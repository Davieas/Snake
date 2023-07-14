import javax.swing.JFrame;

public class SnakeMain {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Snake");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        SnakeGame snakeGame = new SnakeGame();
        frame.add(snakeGame);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        snakeGame.startGame();
    }
}

import javax.swing.*;
import java.awt.*;

public class Game extends JFrame{

    Board board = new Board();

    public Game(){

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        setTitle("Arcade Game");
        add(board);
        pack();

        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {

        Game game = new Game();

    }





}

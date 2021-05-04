import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;

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

        addMouseMotionListener(new MouseMotionAdapter(){

            public void mouseMoved(MouseEvent m){

                super.mouseMoved(m);
                board.setPos(m.getX(), m.getY());
            }
        });

        addMouseListener(new MouseAdapter() {


        });

    }

    public static void main(String[] args) {

        Game game = new Game();
        game.board.setup();
    }

}

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;

public class Game extends JFrame implements KeyListener {

    Board board = new Board();

    public Game(){

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        setTitle("Arcade Game");
        add(board);
        pack();

        setLocationRelativeTo(null);

        /*addMouseMotionListener(new MouseMotionAdapter(){

            @Override
            public void mouseMoved(MouseEvent m){

                super.mouseMoved(m);
                board.setPos(m.getX(), m.getY());
            }
        });

        addMouseMotionListener(new MouseMotionAdapter(){

            @Override
            public void mouseMoved(MouseEvent m){
                super.mouseMoved(m);

                board.setPos(m.getX(), m.getY());
            }
        });

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                setCursor(getToolkit().createCustomCursor(new BufferedImage(3, 3, BufferedImage.TYPE_INT_ARGB), new Point(0, 0), null));
            }
        });*/


        public void keyPressed(KeyEvent e) {


            Integer key = e.getKeyCode();
        }

        public void keyReleased(KeyEvent e) {

        }

        public void keyTyped(KeyEvent e) {

        }

    }

    public static void main(String[] args) {

        Game game = new Game();
        game.board.setup();
    }

}

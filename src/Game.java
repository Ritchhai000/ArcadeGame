import javax.swing.*;
import java.awt.*;

import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;


public class Game extends JFrame implements KeyListener {

    Board board;

    private boolean upPressed, downPressed, leftPressed, rightPressed;

    public Game() {

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        setTitle("Arcade Game");

        board = new Board(this);
        add(board);
        addKeyListener(this);
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
    }


    @Override
        public void keyTyped(KeyEvent e) {


        }

    @Override
        public void keyPressed(KeyEvent e) {

            if (e.getKeyCode() == KeyEvent.VK_UP) {

                System.out.println("test");
                upPressed = true;
            }

            if (e.getKeyCode() == KeyEvent.VK_UP) {

                downPressed = true;
            }

            if (e.getKeyCode() == KeyEvent.VK_LEFT) {

                leftPressed = true;
            }

            if (e.getKeyCode() == KeyEvent.VK_RIGHT) {

                rightPressed = true;
            }
        }

    @Override
        public void keyReleased (KeyEvent e) {

            if (e.getKeyCode() == KeyEvent.VK_UP) {

                upPressed = false;
            }

            if (e.getKeyCode() == KeyEvent.VK_UP) {

                downPressed = false;
            }

            if (e.getKeyCode() == KeyEvent.VK_LEFT) {

                leftPressed = false;
            }

            if (e.getKeyCode() == KeyEvent.VK_RIGHT) {

                rightPressed = false;
            }

    }

    public boolean isUpPressed() {

        return upPressed;
    }

    public boolean isDownPressed() {

        return downPressed;
    }

    public boolean isLeftPressed() {

        return leftPressed;
    }

    public boolean isRightPressed() {

        return rightPressed;
    }

    public static void main(String[] args) {

        Game game = new Game();
        game.board.setup();
    }


}

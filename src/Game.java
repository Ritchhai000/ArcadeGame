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

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

        if(e.getKeyCode() == KeyEvent.VK_UP){

            System.out.println("up");
            upPressed = true;
        }

        if(e.getKeyCode() == KeyEvent.VK_DOWN){

            System.out.println("down");
            downPressed = true;
        }

        if(e.getKeyCode() == KeyEvent.VK_LEFT){

            System.out.println("left");
            leftPressed = true;
        }

        if(e.getKeyCode() == KeyEvent.VK_RIGHT){

            System.out.println("right");
            rightPressed = true;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

        if(e.getKeyCode() == KeyEvent.VK_UP){

            upPressed = false;
        }

        if(e.getKeyCode() == KeyEvent.VK_DOWN){

            downPressed = false;
        }

        if(e.getKeyCode() == KeyEvent.VK_LEFT){

            leftPressed = false;
        }

        if(e.getKeyCode() == KeyEvent.VK_RIGHT){

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

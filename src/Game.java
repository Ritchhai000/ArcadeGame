import javax.swing.*;
import java.awt.*;

import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;


public class Game extends JFrame implements KeyListener {

    Board board;

    private boolean upPressed, downPressed, leftPressed, rightPressed, wPressed, aPressed, sPressed, dPressed;

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

        if(e.getKeyCode() == KeyEvent.VK_W){


            wPressed = true;
        }

        if(e.getKeyCode() == KeyEvent.VK_A){


            aPressed = true;
        }

        if(e.getKeyCode() == KeyEvent.VK_S){


            sPressed = true;
        }

        if(e.getKeyCode() == KeyEvent.VK_D){


            dPressed = true;
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

        if(e.getKeyCode() == KeyEvent.VK_W){

            wPressed = false;
        }

        if(e.getKeyCode() == KeyEvent.VK_A){

            aPressed = false;
        }

        if(e.getKeyCode() == KeyEvent.VK_S){

            sPressed = false;
        }

        if(e.getKeyCode() == KeyEvent.VK_D){

            dPressed = false;
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

    public boolean isWPressed() { return wPressed; }

    public boolean isAPressed() { return aPressed; }

    public boolean isSPressed() { return sPressed; }

    public boolean isDPressed() { return dPressed; }

    public static void main(String[] args) {

        Game game = new Game();
        game.board.setup();
    }


}

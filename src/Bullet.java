import java.awt.*;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class Bullet implements KeyListener{

    Color color;
    int diameter = 20, x, y, width, height;
    double dx = 2, dy = 2;
    boolean wPressed, aPressed, sPressed, dPressed;

    Game game;

    public Bullet(Color color, int x, int y, int diameter, Game game){

        this.color = color;
        this.x = x;
        this.y = y;
        this.diameter= diameter;
        this.game = game;
    }

    public void setPos(int x, int y){

        this.x = x;
        this.y = y;
    }

    @Override
    public void keyTyped(KeyEvent e) { }

    @Override
    public void keyPressed(KeyEvent e) {

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

    public boolean isWPressed() { return wPressed; }

    public boolean isAPressed() { return aPressed; }

    public boolean isSPressed() { return sPressed; }

    public boolean isDPressed() { return dPressed; }


    public void fire(int minWidth, int maxWidth, int minHeight, int maxHeight, boolean horizontal, boolean vertical) {

        double nextTop = y + dy;
        double nextBottom = y + height + dy;
        double nextLeft = x + dx;
        double nextRight = x + width + dx;

        if(nextLeft <= minWidth || nextRight >= maxWidth){

            dx *= -1;
        }

        if(nextTop <= minHeight || nextBottom >= maxHeight){

            dy *= -1;
        }

        if(horizontal){

            x *= dx;
        }

        if(vertical){

            y *= dy;
        }
    }

    public void paint(Graphics p){

        //Color color = new Color();
        p.setColor(Color.YELLOW);
        p.fillOval(x, y, diameter, diameter);
    }

}


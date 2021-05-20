import java.awt.*;

public class Bullet {

    Color color;
    int diameter = 20, x, y, init_x, init_y;
    double dx = 2, dy = 2;

    Game game;
    Board board;

    public Bullet(Color color, int x, int y, int diameter){

        this.color = color;
        this.x = x;
        this.y = y;
        this.diameter = diameter;
    }

    public void setPos(int x, int y){

        this.x = x;
        this.y = y;
    }

    public void fire() {

        if(game.isSpacePressed()){

            System.out.println("fire");
        }

    }

    public void paint(Graphics p){

        //Color color = new Color();
        p.setColor(Color.YELLOW);
        p.fillOval(x, y, diameter, diameter);
    }

}


import java.awt.*;

public class Enemy {

    Color color;
    int width = 20, height = 20, x, y, init_x, init_y;
    double dx = 2, dy = 2;

    Game game;
    Board board;

    public Enemy(Color color, int x, int y, int width, int height){

        this.color = color;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void setPos(int x, int y){

        this.x = x;
        this.y = y;
    }

    public void move() {

    }

    public void paint(Graphics p){

        //Color color = new Color();
        p.setColor(Color.RED);
        p.fillRect(x, y, width, height);
    }
}

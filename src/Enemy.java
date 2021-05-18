import java.awt.*;

public class Enemy {

    Color color;
    int width = 20, height = 20, x, y, init_x, init_y;
    double dx = 2, dy = 2;

    Game game;
    Board board;

    public Enemy(Game game, Board board){

        this.game = game;
        this.board = board;
    }

    public void setPos(int x, int y){

        this.x = x;
        this.y = y;
    }

    public void move() {

    }

    public void paint(Graphics p){

        //Color color = new Color();
        p.setColor(Color.BLUE);
        p.fillRect(x, y, width, height);
    }
}

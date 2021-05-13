import java.awt.*;

public class Shape {

    Color color;
    int width, height, x, y;
    double dx = 2, dy = 2;

    Game game;
    Board board;

    public Shape(Color color, int x, int y, int width, int height){

        this.color = color;
        this.width = width;
        this.height = height;
        this.x = x;
        this.y = y;
    }

    public void setPos(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void move() {

        if (game.isUpPressed()) {

                y -= 5;
        }

        if (game.isDownPressed()) {

                y += 5;
        }
    }



    public void setColor(Color color){this.color = color;}
    public void paint(Graphics p){p.setColor(Color.RED);}



}

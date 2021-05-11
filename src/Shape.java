import java.awt.*;

public class Shape {

    Color color;
    int width, height, x, y;
    double dx = 2, dy = 2;

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



    public void move(int minWidth, int maxWidth, int minHeight, int maxHeight, boolean horizontal, boolean vertical){

        double top, left, right, bottom;



        if(horizontal){
            x *= dx;
        }
        if(vertical) {
            y *= dy;
        }
    }


    public void setColor(Color color){this.color = color;}
    public void paint(Graphics p){}



}

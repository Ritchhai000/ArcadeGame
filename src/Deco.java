import java.awt.*;

public class Deco extends Shape{

    public Deco(Color color, int x, int y, int width, int height) {

        super(color, x, y, width, height);
    }

    public void paint(Graphics p){

        p.setColor(color);
        p.fillRect(x, y, width, height);
    }
}

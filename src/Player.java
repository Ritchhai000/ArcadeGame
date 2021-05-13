import java.awt.*;

public class Player extends Shape{


    public Player(Color color, int x, int y, int width, int height) {

        super(color, x, y, width, height);
    }

    public void paint(Graphics p){

        p.setColor(Color.RED);
        p.fillRect(x, y, width, height);
    }
}

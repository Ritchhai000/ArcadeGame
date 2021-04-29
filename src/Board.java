import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

public class Board extends JPanel{

    //testing out not using individual classes for these-
    Color color;
    int enemy, bullet;

    ArrayList<Shape> player = new ArrayList<>();
    Shape play = new Shape(Color.RED, 400, 400, 400, 400);

    public Board(){

        setPreferredSize(new Dimension(600,700));
        setBackground(Color.WHITE);
    }

    public void Play(Color color, int x, int y, int width, int height){

    }

    public setup(){


    }

    public void setPlayPos(int x, int y){

        player.get(0).setPos(x, y);
    }


}

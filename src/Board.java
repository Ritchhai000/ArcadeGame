import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

public class Board extends JPanel implements ActionListener{

    Color color;
    Color grass = new Color(0, 128, 0);
    Color background = new Color(255, 219, 138);
    Timer timer;

    ArrayList<Shape> player = new ArrayList<>();
    ArrayList<Shape> enemy = new ArrayList<>();
    ArrayList<Shape> deco = new ArrayList<>();

    public Board(){

        setPreferredSize(new Dimension(600,700));
        setBackground(Color.WHITE);
        timer = new Timer(1000 / 60, this);
    }

    public void setup(){

        player.add(0, new Player(Color.RED, 300, 300, 20, 20));

        enemy.add(0, new Player(Color.PINK, 100, 100, 20, 20));

        deco.add(0, new Deco(grass, 0, 0, 20, 20));

        timer.start();
    }

    public void setPos(int x, int y){

        player.get(0).setPos(x, y);
    }

    public void paintComponent(Graphics p){

        super.paintComponent(p);

        for(Shape player: player){
            player.paint(p);
        }

        for(Shape enemy: enemy){
            enemy.paint(p);
        }

        for(Shape deco: deco){
            deco.paint(p);
        }
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        for (int i = 1; i < enemy.size(); i++) {

            Shape enemies = enemy.get(i);

            enemies.move(enemies.x, enemies.y, 0, 700, true, false);

        }

        repaint();
    }
}

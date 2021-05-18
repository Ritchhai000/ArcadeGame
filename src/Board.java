import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

public class Board extends JPanel implements ActionListener{

    Player player;
    Deco deco;
    Timer timer;

    int rand = (int)(Math.random() * 800) + 1;
    int random = (int)(Math.random() * rand) + 100;

    ArrayList<Enemy> enemy = new ArrayList<>();

    public Board(Game game){

        setPreferredSize(new Dimension(600,700));
        setBackground(Color.WHITE);
        player = new Player(game, this);
        enemy.add(new Enemy(game, this));
    }

    public void setup(){

        player.setPos(200, 200);
        for(int i = 0; i > 10; i++){

            enemy.get(i).setPos(random, random);
        }
        timer = new Timer(1000/60,this);
        timer.start();
    }


    public void paintComponent(Graphics p){

        super.paintComponent(p);
        player.paint(p);

        for(Enemy enemies : enemy){

            enemies.paint(p);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        player.move();
        repaint();
    }

}

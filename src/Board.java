import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

public class Board extends JPanel implements ActionListener{

    Player player;
    Deco deco;
    Timer timer;

    final int _NUMENEMIES = 1;


    ArrayList<Enemy> enemy = new ArrayList<>();

    public Board(Game game){

        setPreferredSize(new Dimension(600,700));
        setBackground(Color.WHITE);
        player = new Player(game, this);

        for(int i = 0; i < _NUMENEMIES; i++){

            for(int j = 0; j < _NUMENEMIES; j++)
                System.out.println("test");

                int rand1 = (int)(Math.random() * 600) + 1;
                int randomW = (int)(Math.random() * rand1) + 100;

                int rand2 = (int)(Math.random() * 800) + 1;
                int randomH = (int)(Math.random() * rand2) + 100;

                enemy.add(new Enemy(Color.BLUE, randomW, 0, 20, 20));
                enemy.add(new Enemy(Color.BLUE, 0, randomH, 20, 20));
                enemy.add(new Enemy(Color.BLUE, randomW, 800, 20, 20));
                enemy.add(new Enemy(Color.BLUE, 600, randomH, 20, 20));
        }
    }

    public void setup(){

        player.setPos(200, 200);
        //enemy.get(0).setPos(random, random);
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

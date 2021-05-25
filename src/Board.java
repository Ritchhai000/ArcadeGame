import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

public class Board extends JPanel implements ActionListener{

    Player player;
    Bullet bullet;
    Deco deco;
    Timer timer;

    Game game;


    final int _NUMENEMIES = 1;


    ArrayList<Enemy> enemy = new ArrayList<>();
    ArrayList<Bullet> bulletE = new ArrayList<>();
    ArrayList<Bullet> bulletP = new ArrayList<>();


    public Board(Game game){

        setPreferredSize(new Dimension(600,700));
        setBackground(Color.WHITE);
        player = new Player(game, this);
        bullet = new Bullet(Color.YELLOW, player.x, player.y, 20, game);

        for(int i = 0; i < _NUMENEMIES; i++){

            for(int j = 0; j < _NUMENEMIES; j++)

                enemy.add(new Enemy(Color.RED, (int)(Math.random() * 580) + 1, 0, 20, 20));
                enemy.add(new Enemy(Color.RED, 0, (int)(Math.random() * 680) + 1, 20, 20));
                enemy.add(new Enemy(Color.RED, (int)(Math.random() * 580) + 1, 680, 20, 20));
                enemy.add(new Enemy(Color.RED, 580, (int)(Math.random() * 680) + 1, 20, 20));
        }
    }

    public void setup(){

        player.setPos(200, 200);
        timer = new Timer(1000/60,this);
        timer.start();
    }

    public void addBullet() {

        bulletP.add(new Bullet(Color.YELLOW, player.x, player.y, 20, game));
    }


    public void paintComponent(Graphics p){

        super.paintComponent(p);
        player.paint(p);

        for(Enemy enemies : enemy){

            enemies.paint(p);
        }

        bullet.paint(p);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        player.move();

        for(int i = 0; i < bulletP.size(); i++){

            Bullet bullets = bulletP.get(i);


        }
        bullet.fire();

        repaint();
    }

}

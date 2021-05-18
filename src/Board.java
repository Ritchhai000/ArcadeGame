import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

public class Board extends JPanel implements ActionListener{

    Player player;
    Deco deco;
    Timer timer;

    public Board(Game game){

        setPreferredSize(new Dimension(600,700));
        setBackground(Color.WHITE);
        player = new Player(game, this);
    }

    public void setup(){

        player.setPos(200, 200);
        timer = new Timer(1000/60,this);
        timer.start();
    }



    public void paintComponent(Graphics p){

        super.paintComponent(p);
        player.paint(p);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        player.move();
        repaint();
    }

}

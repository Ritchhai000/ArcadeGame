import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

public class Board extends JPanel implements ActionListener{

    Color color;
    Timer timer;

    //Shape play = new Shape(Color.RED, 400, 400, 400, 400);

    public Board(){

        setPreferredSize(new Dimension(600,700));
        setBackground(Color.WHITE);
        timer = new Timer(1000 / 60, this);
    }

    public void setup(){

        timer.start();
    }


    public void paint(Graphics p){


    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

package Lib;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RollingBall extends JPanel implements ActionListener{
    int x = 100 ;
    int star_angle = 0;
    public RollingBall(){
        Timer t = new Timer(50, this);
        t.start();
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawOval(100, 90, 80, 80);
        g.fillArc(100, 90, 80, 80, star_angle, 180);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        x -= 2;
        star_angle += 2 ;
        if(x<-80) x = getWidth();
        if(star_angle >= 360 ) star_angle = 0;
        repaint();
    }
}

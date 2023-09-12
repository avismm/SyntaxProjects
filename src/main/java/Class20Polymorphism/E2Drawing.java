package Class20Polymorphism;

import javax.swing.*;
import java.awt.*;

public class E2Drawing {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
       MyCanvas c=new MyCanvas();
       frame.add(c);
        frame.setSize(1000,1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
class MyCanvas extends Canvas{
    public void paint(Graphics g){
        g.setColor(Color.BLUE);
        g.fillRect(200,200,50,50);

        g.setColor(Color.RED);
        g.fillOval(400,400,50,50);
    }

}
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

public class Head extends JPanel {
   
    private boolean mouseInside;

    public Head() 
    {
        JFrame x=new JFrame();
        x.setSize(500, 500);
        MyMouseListener e1=new MyMouseListener();
        addMouseListener(e1);
    }
        
        
    public class MyMouseListener implements MouseListener{

            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                
                    mouseInside=true;
                repaint();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                
                    mouseInside=false;
            repaint();
        }
    }
        

    

    public void paintComponent(Graphics g) 
    {
        super.paintComponent(g);
        Graphics2D b=(Graphics2D) g;
        b.setColor(Color.GREEN);
        b.setStroke(new BasicStroke(4));
        b.drawOval(10, 10, 280, 280);
        b.drawRect(135,200,20,10);
        if (mouseInside){
            b.drawOval(50, 80, 20, 20);
            b.drawOval(220, 80, 20, 20);
        }
        else{
            b.drawLine(60, 80, 80, 80);
            b.drawLine(220, 80,240 , 80);
        }
       


    }

}



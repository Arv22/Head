import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyComponent extends JComponent {
    private boolean mouseInside;

    public MyComponent() {
        MyMouseListener listener = new MyMouseListener();
        addMouseListener(listener);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (mouseInside) {
            g.setColor(Color.RED);
        } else {
            g.setColor(Color.BLUE);
        }
        g.fillRect(0, 0, getWidth(), getHeight());
    }

    private class MyMouseListener implements MouseListener {
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
            mouseInside = true;
            repaint();
        }

        @Override
        public void mouseExited(MouseEvent e) {
            mouseInside = false;
            repaint();
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Mouse Listener Example");
        MyComponent component = new MyComponent();
        frame.getContentPane().add(component);
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}


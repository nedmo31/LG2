
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import javax.swing.SwingUtilities;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * A panel maintaining a picture of a Do Not Enter sign.
 */
 public class DoNotEnterSign extends JPanel {
    private static final long serialVersionUID = 785040L;
    LinearGolf ball = new LinearGolf(0,0);
    /**
     * Called by the runtime system whenever the panel needs painting.
     */
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        var center = new Point(getWidth() / 2, getHeight() / 2);
        var radius = Math.min(getWidth() / 2, getHeight() / 2) - 5;
        var diameter = radius * 2;
        var innerRadius = (int)(radius * 0.9);
        var innerDiameter = innerRadius * 2;
        var barWidth = (int)(innerRadius * 0.1);
        var barHeight = (int)(innerRadius * 0.1);        

        g.setColor(Color.GREEN);
        g.fillOval(0, 0, 600, 600);
        g.setColor(Color.BLACK);
        g.fillOval(300, 300, 25, 25);
        g.setColor(Color.WHITE);
        g.fillOval((int)(30*ball.getX()), 600 - (int)(30*ball.getY()), 25, 25);
        g.setColor(Color.BLUE);
        
        int [] x = new int [3];
        int [] y = new int [3];
        if (ball.getSlope().equalsIgnoreCase("down")) {        
          x[0]=120; x[1]=130; x[2]=140; y[0]=120; y[1]=150; y[2]=120;       
          g.fillPolygon(x, y, 3); 
          x[0]=480; x[1]=490; x[2]=500; y[0]=120; y[1]=150; y[2]=120;       
          g.fillPolygon(x, y, 3); 
          x[0]=120; x[1]=130; x[2]=140; y[0]=480; y[1]=510; y[2]=480;       
          g.fillPolygon(x, y, 3); 
          x[0]=480; x[1]=490; x[2]=500; y[0]=480; y[1]=510; y[2]=480;       
          g.fillPolygon(x, y, 3); 
       }
       else if (ball.getSlope().equalsIgnoreCase("up")) {        
          x[0]=120; x[1]=130; x[2]=140; y[0]=120; y[1]=90; y[2]=120;       
          g.fillPolygon(x, y, 3); 
          x[0]=470; x[1]=480; x[2]=490; y[0]=120; y[1]=90; y[2]=120;       
          g.fillPolygon(x, y, 3); 
          x[0]=120; x[1]=130; x[2]=140; y[0]=480; y[1]=450; y[2]=480;       
          g.fillPolygon(x, y, 3); 
          x[0]=470; x[1]=480; x[2]=490; y[0]=480; y[1]=450; y[2]=480;       
          g.fillPolygon(x, y, 3); 
      } 
      else if (ball.getSlope().equalsIgnoreCase("right")) {        
          x[0]=120; x[1]=150; x[2]=120; y[0]=120; y[1]=130; y[2]=140;       
          g.fillPolygon(x, y, 3); 
          x[0]=480; x[1]=510; x[2]=480; y[0]=120; y[1]=130; y[2]=140;       
          g.fillPolygon(x, y, 3); 
          x[0]=120; x[1]=150; x[2]=120; y[0]=480; y[1]=490; y[2]=500;       
          g.fillPolygon(x, y, 3); 
          x[0]=480; x[1]=510; x[2]=480; y[0]=480; y[1]=490; y[2]=500;       
          g.fillPolygon(x, y, 3); 
    }   
      else if (ball.getSlope().equalsIgnoreCase("left")) {        
          x[0]=120; x[1]=90; x[2]=120; y[0]=120; y[1]=130; y[2]=140;       
          g.fillPolygon(x, y, 3); 
          x[0]=480; x[1]=450; x[2]=480; y[0]=120; y[1]=130; y[2]=140;       
          g.fillPolygon(x, y, 3); 
          x[0]=120; x[1]=90; x[2]=120; y[0]=480; y[1]=490; y[2]=500;       
          g.fillPolygon(x, y, 3); 
          x[0]=480; x[1]=450; x[2]=480; y[0]=480; y[1]=490; y[2]=500;       
          g.fillPolygon(x, y, 3); 
    }
}
    /**
     * A little driver in case you want a stand-alone application.
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            var panel = new DoNotEnterSign();
            panel.setBackground(Color.GREEN.darker());
            var frame = new JFrame("A simple graphics program");
            frame.setSize(800, 800);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.getContentPane().add(panel, BorderLayout.CENTER);
            frame.setVisible(true);
        });
    }
}

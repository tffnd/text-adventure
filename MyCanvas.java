import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JComponent;
import javax.swing.JFrame;

/**
 * The other part of the framework the creates the graphic.
 */
class MyCanvas extends JComponent {
  public void paint(Graphics g) {
    Graphics2D g2 = (Graphics2D) g;


    Image img1 = Toolkit.getDefaultToolkit().getImage("rockinspection.jpg");
    g2.drawImage(img1, 10, 10, this);
    g2.finalize();
  }
}
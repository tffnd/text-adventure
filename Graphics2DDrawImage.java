import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JComponent;
import javax.swing.JFrame;
/**
 * This helps to create the graphic.
 */
public class Graphics2DDrawImage {
  public static void draw() {
    JFrame window = new JFrame();
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setBounds(30, 30, 300, 300);
    window.getContentPane().add(new MyCanvas());
    window.setVisible(true);
  }
}

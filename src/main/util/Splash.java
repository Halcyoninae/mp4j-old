package main.util;

import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JWindow;
import javax.swing.SwingConstants;

public class Splash {
  public void run() {
    URL splash_screen = getClass().getResource("/splash_screen.png");
    JWindow window = new JWindow();
    assert splash_screen != null;
    window.getContentPane().add(
        new JLabel("", new ImageIcon(splash_screen),
            SwingConstants.CENTER));
    window.setSize(800, 600);
    window.setBounds(500, 150, 300, 200);
    window.setLocationRelativeTo(null);
    window.setVisible(true);
    try {
      Thread.sleep(1500);
    } catch (InterruptedException e) {
      e.printStackTrace();
      new ErrorMessage(e.getMessage());
    }
    window.setVisible(false);
    window.dispose();
  }

}

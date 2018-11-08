
package tetris;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TetrisPanel extends JPanel implements KeyListener{

    @Override
    public void keyTyped(KeyEvent e) {
        JOptionPane.showMessageDialog(null, "opis");
    }

    @Override
    public void keyPressed(KeyEvent e) {
         JOptionPane.showMessageDialog(null, "opis");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        JOptionPane.showMessageDialog(null, "opis");
    }
    
}

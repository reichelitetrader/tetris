
package tetris;

import boards.Board;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TetrisPanel extends JPanel implements KeyListener{
private Board board = null;
private Window window = null;

    public TetrisPanel(Board board, Window window){
       this.board = board;
       this.window = window;
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        String locationString = "key location: ";
        int location = e.getKeyCode();
         if (location == KeyEvent.VK_A) {
              board.activeBlock.moveLeft();
              board.activeBlock.moveDown();
              window.paintBoard();
        } else if (location == KeyEvent.VK_D) {
            board.activeBlock.moveRight();
              board.activeBlock.moveDown();
               window.paintBoard();
        } else if (location == KeyEvent.VK_S) {
            board.activeBlock.moveDown();
             window.paintBoard();
        } 
    }

    @Override
    public void keyReleased(KeyEvent e) {
        JOptionPane.showMessageDialog(null, "released");
    }
    
}

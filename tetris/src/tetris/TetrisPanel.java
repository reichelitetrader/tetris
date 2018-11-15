package tetris;
import boards.Board;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

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
        int location = e.getKeyCode();
    
        switch (location) {
        case KeyEvent.VK_A:
            SwingUtilities.invokeLater(()->{ 
            board.activeBlock.moveLeft();
            board.activeBlock.moveDown();
            redundantMetod();
            });
            break;
        case KeyEvent.VK_D:
            SwingUtilities.invokeLater(()->{ 
            board.activeBlock.moveRight();
            board.activeBlock.moveDown();
            redundantMetod();
            });
            break; 
        case KeyEvent.VK_S:
            SwingUtilities.invokeLater(()->{ 
            board.activeBlock.moveDown();
            redundantMetod();
            });
            break;
        default:
            break;
              case KeyEvent.VK_W:
            SwingUtilities.invokeLater(()->{ 
            board.activeBlock.rotate();
            redundantMetod();
            });
            break;    
    }
    }
    
    public void redundantMetod(){
            board.clearBoard();
            window.clearButtons();
            board.displayState();
            window.paintBoard();
            window.repaint();
            window.getContentPane().repaint();
    }
    
    @Override
    public void keyReleased(KeyEvent e) {
      //  JOptionPane.showMessageDialog(null, "released");
    }
}

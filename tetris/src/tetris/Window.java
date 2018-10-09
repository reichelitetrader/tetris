package tetris;

import boards.Board;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Window extends JFrame {

    private Board board = null;
    JButton[][] buttons = new JButton[10][10]; 

    public Window(Board board) {
        this.board = board;
        final JPanel buttonsPanel = new JPanel();
        JFrame frame = this;

        for(int i =0;i<buttons.length; i++){
            for(int j=0;j<buttons[i].length;j++){
                buttons[i][j] = new JButton(" ");
                buttons[i][j].setText(" ");
                buttons[i][j].setSize(400, 600);
                buttonsPanel.add(buttons[i][j]);
            }
        }
        
        frame.getContentPane().add(buttonsPanel); //dodanie panelu do ramki
        frame.setVisible(true);
        frame.pack(); //spakowanie okna 
        frame.setSize(400, 600);

        
        
    }
}

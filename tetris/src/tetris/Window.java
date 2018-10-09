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

        frame.getContentPane().add(buttonsPanel);

        frame.setVisible(true);
        frame.pack(); //spakowanie okna 
        frame.setSize(400, 600);

    }
}

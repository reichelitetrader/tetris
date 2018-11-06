package tetris;

import boards.Board;
import static boards.Board.fields;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Window extends JFrame {

    private Board board = null;
    JButton[][] buttons = new JButton[10][10];

    public Window(Board board) {
        this.board = board;
        final JPanel buttonsPanel = new JPanel();
        JFrame frame = this;

        GridLayout Layout = new GridLayout(0, 1);
        this.setLayout(Layout);
        buttonsPanel.setLayout(new GridLayout(10, 10));

        for (int i = 0; i < buttons.length; i++) {
            for (int j = 0; j < buttons[i].length; j++) {
                buttons[i][j] = new JButton(" ");
                buttons[i][j].setText(" ");
                buttons[i][j].setSize(400, 600);
                buttonsPanel.add(buttons[i][j]);
                buttons[i][j].addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent e) {
                        JOptionPane.showMessageDialog(null, "start");
                    }
                });

            }
        }

        frame.getContentPane().add(buttonsPanel); //dodanie panelu do ramki
        frame.setVisible(true);
        frame.pack(); //spakowanie okna 
        frame.setSize(400, 600);

    }

    public void paintBoard() {
        for (int i = 0; i < Board.fields.length; i++) {
            for (int j = 0; j < Board.fields.length; j++) { 
                if(fields[i][j] == true){
                buttons[i][j].setText("X");
            }
            }
                        
        }
    }
    
    public void clearButtons(){
        for(int i=0;i<this.buttons.length;i++){
            for(int j=0;j<this.buttons.length;j++){
                buttons[i][j].setText(" ");
            }
        }
    }
}

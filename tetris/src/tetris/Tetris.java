package tetris;

import boards.Board;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Tetris {

    int moveNumber = 0;
    static Board board = new Board();
    static String playerName = "";

    int score = 0;
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {
        //Tetris game = new Tetris();

        System.out.println("wprowadz imie:");
        playerName = scan.nextLine();
        System.out.println("rozpoczynasz nowa gre:");
        while (true) {
            if (!board.checkIfBlockFallDown()) {
                board.clearActiveBlock();
                board.activeBlock.moveDown();
                
            } else if (board.checkEndOfGame()) {
                System.out.println("koniec gry");
                break;
            } else {
                //board.activeBlock = new blocks.Dot();
                board.activeBlock = new blocks.Bolt();
            }
            board.displayState();
            //  TimeUnit.SECONDS.sleep(1);
            String zKlawiatury = "";
            System.out.println("wykonaj ruch:");
            zKlawiatury = scan.next();
            if ("A".equals(zKlawiatury)) {
                
               board.clearActiveBlock();
               board.activeBlock.moveLeft();
      
            } else if ("D".equals(zKlawiatury)) {
                board.clearActiveBlock();
                board.activeBlock.moveRight();
               
            }

        }
    }
}

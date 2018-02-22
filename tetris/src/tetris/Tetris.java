package tetris;

import boards.Board;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Tetris {

    int moveNumber = 0;
    static Board board = new Board();
    static String playerName = "";

    int score = 0;

    public static void main(String[] args) throws InterruptedException {
        //Tetris game = new Tetris();
        Scanner scan = new Scanner(System.in);
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
                board.activeBlock = new blocks.Dot();

            }

            board.displayState();
            TimeUnit.SECONDS.sleep(1);

        }

    }

}

package tetris;

import blocks.BlockFactory;
import boards.Board;
import java.util.Scanner;

public class Tetris {

    int moveNumber = 0;
    static Board board = new Board();
    static String playerName = "";
    int score = 0;
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {
        System.out.println("wprowadz imie:");
        playerName = scan.nextLine();
        System.out.println("rozpoczynasz nowa gre:");
        while (true) {
            if (!board.checkIfBlockFallDown()) {
                board.clearActiveBlock();
                String zKlawiatury = "";
                System.out.println("wykonaj ruch:");
                zKlawiatury = scan.next();
                if ("A".equals(zKlawiatury)) {
                    if (!board.checkIfBlockFallDown()) {
                        board.clearActiveBlock();
                    }
                    if (board.checkIfBlockCanMoveLeft()) {
                        board.activeBlock.moveDown();
                        board.activeBlock.moveLeft();
                    }

                } else if ("D".equals(zKlawiatury)) {
                    if (!board.checkIfBlockFallDown()) {
                        board.clearActiveBlock();
                    }

                    if (board.checkIfBlockCanMoveRight()) {
                        board.activeBlock.moveDown();
                        board.activeBlock.moveRight();
                    }

                } else if ("S".equals(zKlawiatury)) {
                    if (board.checkIfBlockFallDown()) {
                        board.clearActiveBlock();
                    }
                    board.activeBlock.moveDown();
                }else if ("R".equals(zKlawiatury)){
                    board.activeBlock.rotate();
                }
                
            } else if (board.checkEndOfGame()) {
                System.out.println("koniec gry");
                break;
            } else {
                //board.activeBlock = new blocks.Dot();
                board.removedFilledLines();
                board.activeBlock = BlockFactory.createRandomBlock();
            }
            board.displayState();
            //  TimeUnit.SECONDS.sleep(1);
        }
    }
}

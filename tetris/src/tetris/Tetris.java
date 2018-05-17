package tetris;

import blocks.BlockFactory;
import boards.Board;
import java.awt.Point;
import java.util.Scanner;

public class Tetris {

    int moveNumber = 0;
    static Board board = new Board();
    static String playerName = "";
    int score = 0;
    static Scanner scan = new Scanner(System.in);
    static int points = 0;

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
                    Point[] rotatedPoints = board.activeBlock.getRotatedPoints();
                    board.clearActiveBlock();
                    if(board.activeBlock.checkIfCanRotate(rotatedPoints)){
                        board.activeBlock.rotate();
                    }
                }
                
            } else if (board.checkEndOfGame()) {
                System.out.println("koniec gry");
                break;
            } else {
                //board.activeBlock = new blocks.Dot();
               boolean removed = board.removedFilledLines();
                if(removed){
                   points = points +10; 
                }
                
             
                
           
                
                board.activeBlock = BlockFactory.createRandomBlock(board);
            }
            board.displayState();
            System.out.println("punkty:" + points);
            //  TimeUnit.SECONDS.sleep(1);
        }
    }
}

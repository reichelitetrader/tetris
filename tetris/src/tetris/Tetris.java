package tetris;

import blocks.BlockFactory;
import boards.Board;
import java.awt.Dimension;
import java.awt.Point;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Tetris {

    int moveNumber = 0;
    static Board board = new Board();
    static String playerName = "";
    int score = 0;
    static Scanner scan = new Scanner(System.in);
    private Window window = null;

    //jedna linia 10, 2 linie 30 , 3 50 , 4 linie 100 pkt
    static int points = 0;

    public Tetris() {
        this.window = new Window(board);
    }

    public static void main(String[] args) throws InterruptedException {
        Tetris tetris = new Tetris();

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
                } else if ("R".equals(zKlawiatury)) {
                    Point[] rotatedPoints = board.activeBlock.getRotatedPoints();
                    board.clearActiveBlock();
                    if (board.activeBlock.checkIfCanRotate(rotatedPoints)) {
                        board.activeBlock.rotate();
                    }
                }

            } else if (board.checkEndOfGame()) {
                System.out.println("koniec gry");
                break;
            } else {
                //board.activeBlock = new blocks.Dot();
                int quantityFilledLine = board.removedFilledLines();
                if (quantityFilledLine == 1) {
                    points = points + 10;

                } else if (quantityFilledLine == 2) {
                    points = points + 30;
                } else if (quantityFilledLine == 3) {
                    points = points + 50;
                } else if (quantityFilledLine == 4) {
                    points = points + 100;
                }

                board.activeBlock = BlockFactory.createRandomBlock(board);
            }
            board.displayState();
            System.out.println("punkty:" + points);
            //  TimeUnit.SECONDS.sleep(1);
        }
    }
}

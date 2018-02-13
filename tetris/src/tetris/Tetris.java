package tetris;

import boards.Board;
import java.util.Scanner;

public class Tetris {

    int moveNumber = 0;
    static Board board = new Board();
    static String playerName = "";

    int score = 0;

    public static void main(String[] args) {
        board.displayState();
        //Tetris game = new Tetris();
        Scanner scan = new Scanner(System.in);
        System.out.println("wprowadz imie:");
        playerName = scan.nextLine();
        System.out.println("rozpoczynasz nowa gre:");

    }

}

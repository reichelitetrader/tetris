package blocks;
import boards.Board;
import java.util.Random;

public class BlockFactory {
    public static Block createBlock(String wybor, Board board) {
        Block block = null;

        if ("Bolt".equals(wybor)) {
            block = new Bolt(board);
        } else if ("L".equals(wybor)) {
            block = new L(board);
        } else if ("Dot".equals(wybor)) {
            block = new Dot(board);
        } else if ("Pipe".equals(wybor)) {
            block = new Pipe(board);
        } else if ("Pyramid".equals(wybor)) {
            block = new Pyramid(board);
        } else if ("Sguare".equals(wybor)) {
            block = new Square(board);
                }
        return block;
    }

    public static Block createRandomBlock(Board board) {
        Block block = new Pipe(board);
        int number = getRandom();
        if (number == 1) {
            block = new Pipe(board);
        } else if (number == 2) {
            block = new Pipe(board);
        } else if (number == 3) {
            block = new Pipe(board);
        } else if (number == 4) {
            block = new Pipe(board);
        } else if (number == 5) {
            block = new Pipe(board);
        }
        return new Pipe(board);    //  return block;
    }
      
    public static int getRandom() {
        Random rand = new Random();
        return rand.nextInt(6);
    }
}

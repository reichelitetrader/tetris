package blocks;

import boards.Board;
import java.util.Random;

public class BlockFactory {

    public static Block createBlock(String wybor) {
        Block block = null;

        if ("Bolt".equals(wybor)) {
            block = new Bolt();
        } else if ("L".equals(wybor)) {
            block = new L();
        } else if ("Dot".equals(wybor)) {
            block = new Dot();
        } else if ("Pipe".equals(wybor)) {
            block = new Pipe();
        } else if ("Pyramid".equals(wybor)) {
            block = new Pyramid();
        } else if ("Sguare".equals(wybor)) {
            block = new Square();
        }

        return block;
    }

    public static Block createRandomBlock() {
        Block block = new Dot();
        int number = getRandom();
        if (number == 1) {
            block = new Square();
        } else if (number == 2) {
            block = new Pyramid();
        } else if (number == 3) {
            block = new Pipe();
        } else if (number == 4) {
            block = new L();
        } else if (number == 5) {
            block = new Bolt();
        }

        return block;
    }

    public static int getRandom() {

        Random rand = new Random();
        return rand.nextInt(6);
    }

}
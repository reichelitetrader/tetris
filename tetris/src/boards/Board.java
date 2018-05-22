package boards;
import blocks.Block;
import blocks.BlockFactory;

public class Board {

    public static boolean[][] fields = new boolean[10][10];
    public Block activeBlock = BlockFactory.createRandomBlock(this);

    public Board() {
        clearBoard();
    }

    public static void clearBoard() {
        for (int i = 0; i < fields.length; i++) {
            for (int j = 0; j < fields.length; j++) {
                fields[i][j] = false;
            }
        }
    }

    public static void clearLine(int lineNumber) {
        for (int i = 0; i < fields.length; i++) {
            fields[lineNumber][i] = false;
        }
        for (int i = lineNumber; i > 0; i--) {
            for (int j = fields[i].length - 1; j > 0; j--) {

                fields[i][j] = fields[i - 1][j];
            }
        }
    }

    public void clearActiveBlock() {
        for (int i = 0; i < activeBlock.points.length; i++) {
            int x = activeBlock.points[i].x;
            int y = activeBlock.points[i].y;
            if (y < fields.length && x < fields.length) {
                fields[y][x] = false;
            }
        }
    }

    public void displayState() {
        System.out.println("ponizej stan planszy:");
        drawActiveBlock();
        for (int i = 0; i < fields.length; i++) {
            System.out.print("|");
            for (int j = 0; j < fields.length; j++) {
                if (fields[i][j] == true) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("|");
            System.out.println();
        }
        System.out.println("activeBlock: " + activeBlock );
    }

    private void drawActiveBlock() {
        for (int i = 0; i < activeBlock.points.length; i++) {
            int x = activeBlock.points[i].x;
            int y = activeBlock.points[i].y;
            if (y < fields.length && x < fields.length) {

                fields[y][x] = true;
            }
        }
    }
    
    

    public boolean checkIfBlockFallDown() {
        for (int i = 0; i < activeBlock.points.length; i++) {
            int y = activeBlock.points[i].y;
            int x = activeBlock.points[i].x;

            if (y == fields.length - 1
                    || (fields[y + 1][x] == true
                    && !checkIfCoordineIsActiveBlock(y + 1, x))) {
                return true;
            }
        }
        return false;
    }

    public boolean checkIfBlockCanMoveLeft() {
        for (int i = 0; i < activeBlock.points.length; i++) {
            int y = activeBlock.points[i].y;
            int x = activeBlock.points[i].x;

            if (x == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean checkIfBlockCanMoveRight() {
        for (int i = 0; i < activeBlock.points.length; i++) {
            int y = activeBlock.points[i].y;
            int x = activeBlock.points[i].x;

            if (x == fields.length - 1) {
                return false;
            }
        }
        return true;
    }

    public boolean checkIfCoordineIsActiveBlock(int testY, int testX) {
        for (int i = 0; i < activeBlock.points.length; i++) {
            int y = activeBlock.points[i].y;
            int x = activeBlock.points[i].x;
            if (y == testY && x == testX) {
                return true;
            }
        }
        return false;
    }

    public boolean checkEndOfGame() {
        for (int x = 0; x < fields.length; x++) {
            if (fields[0][x]) {
                return true;
            }
        }
        return false;
    }

    public int removedFilledLines() {
        int quantityFilledLine = 0;
        for (int i = 0; i < fields[0].length; i++) {
            if (isLineFilled(i)) {
                System.out.println("wykryto wypelniona linie:");
                
                clearLine(i);
                quantityFilledLine++;
            }
        }
      return quantityFilledLine;
    }

    public boolean isLineFilled(int i) {
        boolean isLineFilled = true;
        for (int j = 0; j < fields.length; j++) {
            if (fields[i][j] == false) {
                isLineFilled = false;
                break;
            }
        }
        return isLineFilled;
    }
}

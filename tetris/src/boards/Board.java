package boards;

import blocks.Dot;

public class Board {

    public static boolean[][] fields = new boolean[10][20];
    public Dot activeBlock = new Dot();

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
        clearActiveBlock();

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

}

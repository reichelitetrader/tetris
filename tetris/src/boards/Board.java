package boards;

public class Board {

    public static boolean[][] fields = new boolean[10][20];

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

    public void displayState() {
        System.out.println("ponizej stan planszy:");
        for (int i = 0; i < fields.length; i++) {
            System.out.print("|");
            for (int j = 0; j < fields.length; j++) {
                if (fields[i][j] == true) {
                    System.out.print("X");

                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

    }

}

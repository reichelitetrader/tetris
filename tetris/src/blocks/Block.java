package blocks;
import boards.Board;
import java.awt.Point;
  public abstract class Block {

    public Board board;
    protected Orientation orientation = Orientation.TOP; // uzycie enuma zamiast cyfry 0

    public Block(Board board) {
        this.board = board;
    }

    public Point[] points = {
        new Point(4, 0)
    };

    public Point[] moveDown() {
        for (int i = 0; i < points.length; i++) {
            points[i].y++;
        }
        return points;
    }

    public Point[] moveLeft() {
        for (int i = 0; i < points.length; i++) {
            points[i].x--;
        }
        return points;
    }

    public Point[] moveRight() {
        for (int i = 0; i < points.length; i++) {
            points[i].x++;
        }
        return points;
    }

    public boolean checkIfCanRotate(Point[] points) {
        for (int i = 0; i < points.length; i++) {
            if (points[i].x < 0 || points[i].y < 0
                    || points[i].x >= board.fields.length
                    || points[i].y >= board.fields.length) {
                return false;
            }
            if (board.fields[points[i].x][points[i].y]) {
                return false;
            }
        }
        return true;
    }

    public void rotate() {
        this.points = this.getRotatedPoints();
        if (orientation == Orientation.BOTTOM) {
            orientation = Orientation.LEFT;
        }
        else if (orientation == Orientation.LEFT) {
            orientation = Orientation.TOP;
        }
        else if (orientation == Orientation.TOP) {
            orientation = Orientation.RIGHT;
        }
        else if (orientation == Orientation.RIGHT) {
            orientation = Orientation.BOTTOM;
        }
    }
    
    public abstract Point[] getRotatedPoints();
}

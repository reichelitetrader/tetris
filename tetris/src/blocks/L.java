package blocks;
import boards.Board;
import java.awt.Point;

public class L extends Block {

    public Point[] LPoints = {
        new Point(1, 0),
        new Point(2, 0),
        new Point(3, 0),
        new Point(4, 0), new Point(1, 1)
    };

    public L(Board board) {
        super(board);
        this.points = LPoints;
    }

    @Override
    public Point[] getRotatedPoints() {
        Point source = points[3];
        Point[] result = {
        new Point(1, 0),
        new Point(2, 0),
        new Point(3, 0),
        new Point(4, 0), new Point(1, 1)
        };

        if (Orientation.TOP == orientation) {
            result[0].x = source.x;
            result[1].x = source.x;
            result[2].x = source.x;
            result[3].x = source.x;
            result[4].x = source.x-1;

            result[0].y = source.y+1;
            result[1].y = source.y+2;
            result[2].y = source.y+3;
            result[3].y = source.y;
            result[4].y = source.y;
            
        } else if (Orientation.RIGHT == orientation) {
            result[0].x = source.x - 3;
            result[1].x = source.x -2;
            result[2].x = source.x - 1;
            result[3].x = source.x;
            result[4].x = source.x;

            result[0].y = source.y;
            result[1].y = source.y;
            result[2].y = source.y;
            result[3].y = source.y;
            result[4].y = source.y - 1;
            
        }else if (Orientation.BOTTOM == orientation) {
            result[0].x = source.x;
            result[1].x = source.x;
            result[2].x = source.x;
            result[3].x = source.x;
            result[4].x = source.x + 1;

            result[0].y = source.y + 3;
            result[1].y = source.y + 2;
            result[2].y = source.y + 1;
            result[3].y = source.y;
            result[4].y = source.y;
           
        } else if (Orientation.LEFT == orientation) {
            result[0].x = source.x-3;
            result[1].x = source.x-2;
            result[2].x = source.x-1;
            result[3].x = source.x;
            result[4].x = source.x;

            result[0].y = source.y;
            result[1].y = source.y;
            result[2].y = source.y;
            result[3].y = source.y;
            result[4].y = source.y+1;
        }
        return result;
    }
}

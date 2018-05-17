package blocks;
import boards.Board;
import java.awt.Point;

public class Pyramid extends Block {

    public Point[] PyramidPoints = {
        new Point(0, 1),
        new Point(0, 2),
        new Point(0, 3),
        new Point(1, 2)
    };

    public Pyramid(Board board) {
        super(board);
        this.points = PyramidPoints;
        this.orientation = Orientation.RIGHT;
    }

    @Override
    public Point[] getRotatedPoints() {
        Point source = points[3];
        Point[] result = {
            new Point(0, 1),
            new Point(0, 2),
            new Point(0, 3),
            new Point(1, 2)
        };

        if (Orientation.TOP == orientation) {
            result[0].x = source.x;
            result[1].x = source.x;
            result[2].x = source.x + 1;
            result[3].x = source.x;

            result[0].y = source.y - 1;
            result[1].y = source.y;
            result[2].y = source.y;
            result[3].y = source.y + 1;
            
        } else if (Orientation.RIGHT == orientation) {
            result[0].x = source.x - 1;
            result[1].x = source.x;
            result[2].x = source.x;
            result[3].x = source.x + 1;

            result[0].y = source.y;
            result[1].y = source.y;
            result[2].y = source.y + 1;
            result[3].y = source.y;
            
        } else if (Orientation.BOTTOM == orientation) {
            result[0].x = source.x;
            result[1].x = source.x - 1;
            result[2].x = source.x;
            result[3].x = source.x;

            result[0].y = source.y - 1;
            result[1].y = source.y;
            result[2].y = source.y;
            result[3].y = source.y + 1;
           
        } else if (Orientation.LEFT == orientation) {
            result[0].x = source.x - 1;
            result[1].x = source.x;
            result[2].x = source.x;
            result[3].x = source.x + 1;

            result[0].y = source.y;
            result[1].y = source.y - 1;
            result[2].y = source.y;
            result[3].y = source.y; 
        }
        return result;
    }
}

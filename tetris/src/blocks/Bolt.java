package blocks;

import boards.Board;
import java.awt.Point;

public class Bolt extends Block {

    public Point[] BoltPoints = {
        new Point(4, 0),
        new Point(4, 1),
        new Point(5, 0),
        new Point(3, 1)
    };

    public Bolt(Board board) {
        super(board);

        this.points = BoltPoints;
    }

    @Override
    public Point[] getRotatedPoints() {
        Point source = points[3];
        Point[] result = {
            new Point(4, 0),
            new Point(4, 1),
            new Point(5, 0),
            new Point(3, 1)
        };
        if (Orientation.TOP == orientation) {
            points[0].x = source.x;
            points[1].x = source.x;
            points[2].x = source.x + 1;
            points[3].x = source.x + 1;

            points[0].y = source.y - 1;
            points[1].y = source.y;
            points[2].y = source.y;
            points[3].y = source.y + 1;

        } else if (Orientation.RIGHT == orientation) {
            points[0].x = source.x - 1;
            points[1].x = source.x;
            points[2].x = source.x;
            points[3].x = source.x + 1;

            points[0].y = source.y;
            points[1].y = source.y;
            points[2].y = source.y + 1;
            points[3].y = source.y + 1;

        }
        return result;
    }
}

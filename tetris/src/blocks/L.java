package blocks;

import java.awt.Point;

public class L extends Block {

    public Point[] LPoints = {
        new Point(1, 0),
        new Point(2, 0),
        new Point(3, 0),
        new Point(4, 0), new Point(1, 1)
    };

    public L() {
        super();
        this.points = LPoints;
        
    }

    @Override
    public void rotate() {
        Point source = points[3];

        if (Orientation.TOP == orientation) {
            points[0].x = source.x;
            points[1].x = source.x;
            points[2].x = source.x;
            points[4].x = source.x-1;

            points[0].y = source.y+1;
            points[1].y = source.y+2;
            points[2].y = source.y+3;
            points[4].y = source.y;
            orientation = Orientation.RIGHT;

        } else if (Orientation.RIGHT == orientation) {
            points[0].x = source.x - 3;
            points[1].x = source.x - 2;
            points[2].x = source.x - 1;
            points[4].x = source.x;

            points[0].y = source.y;
            points[1].y = source.y;
            points[2].y = source.y;
            points[4].y = source.y - 1;
            orientation = Orientation.BOTTOM;
        }

        if (Orientation.BOTTOM == orientation) {
            points[0].x = source.x;
            points[1].x = source.x;
            points[2].x = source.x;
            points[4].x = source.x + 1;

            points[0].y = source.y + 3;
            points[1].y = source.y + 2;
            points[2].y = source.y + 1;
            points[4].y = source.y;
            orientation = Orientation.LEFT;
        } else if (Orientation.LEFT == orientation) {
            points[0].x = source.x + 3;
            points[1].x = source.x + 2;
            points[2].x = source.x + 1;
            points[4].x = source.x+1;

            points[0].y = source.y + 3;
            points[1].y = source.y + 2;
            points[2].y = source.y+1;
            points[4].y = source.y-1;
            orientation = Orientation.TOP;
        }
    }
}

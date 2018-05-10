package blocks;

import boards.Board;
import java.awt.Point;

public class Pipe extends Block {

    public Point[] pipePoints = {
        new Point(1, 0),
        new Point(2, 0),
        new Point(3, 0),
        new Point(4, 0)
    };

    public Pipe(Board board) {
        super(board);
        this.points = pipePoints;
    }

    @Override
    public Point[] getRotatedPoints() {
        Point source = points[2];
        Point[] result = {
            new Point(1, 0),
            new Point(2, 0),
            new Point(3, 0),
            new Point(4, 0)
        };

        if (Orientation.TOP == orientation) {

            points[0].x = source.x;
            points[1].x = source.x;
            points[3].x = source.x;

            points[0].y = source.y - 2; //1,4 - 3,4 
            points[1].y = source.y - 1;  //2,4 - 3,4 
            points[3].y = source.y + 1;  //4,4 - 3,4 

        } else if (Orientation.RIGHT == orientation) {

            points[0].x = source.x - 2;
            points[1].x = source.x - 1;
            points[3].x = source.x + 1;

            points[0].y = source.y;
            points[1].y = source.y;
            points[3].y = source.y;

        }
        return result;
    }

}

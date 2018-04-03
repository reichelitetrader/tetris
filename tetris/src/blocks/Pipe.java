package blocks;

import java.awt.Point;

public class Pipe extends Block {

    public Point[] pipePoints = {
        new Point(1, 0),
        new Point(2, 0),
        new Point(3, 0),
        new Point(4, 0)
    };

    public Pipe() {
        super();
        this.points = pipePoints;
    }

    @Override
    public void rotate() {
        if (Orientation.TOP == orientation) {
            for(int i=0; i<points.length;i++){
               
               int tmp = points[i].x;
               points[i].x = points[i].y;
               points[i].y = tmp;
            }
        } else if (Orientation.RIGHT == orientation) {

        }
    }
}

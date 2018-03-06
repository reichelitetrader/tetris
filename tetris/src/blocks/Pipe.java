package blocks;

import java.awt.Point;

public class Pipe extends Dot {

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
}

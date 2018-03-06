package blocks;

import java.awt.Point;

public class Bolt extends Dot {

    public Point[] BoltPoints = {
        new Point(4, 0),
        new Point(4, 1),
        new Point(5, 0),
        new Point(3, 1)     
};

public Bolt(){
        super();
        this.points = BoltPoints;
    }
}

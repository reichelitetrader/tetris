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
}

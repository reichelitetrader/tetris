package blocks;
import java.awt.Point;

public class L extends Block {
    public Point[] LPoints = {
        new Point(1, 0),
        new Point(2, 0),
        new Point(3, 0),
        new Point(4, 0), new Point(4, 1)
    };

    public L() {
        super();
        this.points = LPoints;
    }

    @Override
    public void rotate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

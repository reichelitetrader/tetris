package blocks;
import java.awt.Point;

public abstract class Block {
    
    protected Orientation orientation = Orientation.TOP;
    // uzycie enuma zamiast cyfry 0
    
    public Point[] points = {
        new Point(4, 0)
    };
    
    public Point[] moveDown() {
        for (int i = 0; i < points.length; i++) {
            points[i].y++;
        }
        return points;
    }

    public Point[] moveLeft() {
        for (int i = 0; i < points.length; i++) {
            points[i].x--;
        }
        return points;
    }

    public Point[] moveRight() {
        for (int i = 0; i < points.length; i++) {
            points[i].x++;
        }
        return points;
    }
    
    public abstract void rotate();
        
    
    
}

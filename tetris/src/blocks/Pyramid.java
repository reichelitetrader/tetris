package blocks;
import java.awt.Point;

public class Pyramid extends Block {
    public Point[] PyramidPoints = {
        new Point(0,1),
        new Point(0,2),
        new Point(0,3),
        new Point(1,2)
    };
    
    public Pyramid(){
        super();
        this.points = PyramidPoints;
    }

    @Override
    public void rotate() {
       
        }
        
        
    }

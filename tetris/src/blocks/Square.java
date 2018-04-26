package blocks;
import java.awt.Point;

public class Square extends Block {
    public Point[] squarePoints = {
        new Point(4,0),
        new Point(5,0),
        new Point(4,1), 
        new Point(5,1)
    };
    
   public Square(){
       super();
       this.points = squarePoints;
   }

    @Override
    public void rotate() {
    }
}

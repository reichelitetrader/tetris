package blocks;

import java.awt.Point;

public class Square extends Dot {
  
    public Point[] squarePoints = {
        new Point(4,0),
        new Point(5,0),
        new Point(4,1), 
        new Point(5,1)
    };
    
   public Square(){
       this.points = squarePoints; 
   }
    
}

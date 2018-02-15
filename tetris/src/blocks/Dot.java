
package blocks;

import java.awt.Point;

public class Dot {

   public Point[] points = {new Point(4,0)};//new Point[1]; 
    
    
   public Point[] moveDown(){
       for(int i=0;i<points.length;i++){
           points[i].y++;
       }
       return points;
   }
   
}



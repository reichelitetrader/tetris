package blocks;

import java.awt.Point;

public class Square {
  
    public Point[] points = {new Point(4,0),new Point(5,0), new Point(4,1), new Point(5,1)};
    
    public Point[] moveDown(){
       for(int i=0;i<points.length;i++){
           points[i].y++;
       }
       return points;
   }
   
   public Point[] moveLeft(){
       for(int i=0;i<points.length;i++){
           points[i].x--;
       }
       return points;
   }
   
   public Point[] moveRight(){
       for(int i=0;i<points.length;i++){
           points[i].x++;
       }
       return points;
   }
    
    
    
}

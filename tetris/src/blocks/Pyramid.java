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
        this.orientation = Orientation.RIGHT;
    }

    @Override
    public void rotate() {
         Point source = points[3];
        
        if(Orientation.TOP == orientation){
            points[0].x = source.x;
            points[1].x = source.x;
            points[2].x = source.x+1;
            points[3].x = source.x;

            points[0].y = source.y-1;
            points[1].y = source.y;
            points[2].y = source.y;
            points[3].y = source.y+1;
            orientation = Orientation.RIGHT;
        }else if(Orientation.RIGHT == orientation){
            points[0].x = source.x-1;
            points[1].x = source.x;
            points[2].x = source.x;
            points[3].x = source.x+1;

            points[0].y = source.y;
            points[1].y = source.y;
            points[2].y = source.y+1;
            points[3].y = source.y;
       orientation = Orientation.BOTTOM;
        }else if(Orientation.BOTTOM == orientation){
            points[0].x = source.x;
            points[1].x = source.x-1;
            points[2].x = source.x;
            points[3].x = source.x;

            points[0].y = source.y-1;
            points[1].y = source.y;
            points[2].y = source.y;
            points[3].y = source.y+1;
       orientation = Orientation.LEFT;   
    }else if(Orientation.LEFT == orientation){
            points[0].x = source.x-1;
            points[1].x = source.x;
            points[2].x = source.x;
            points[3].x = source.x+1;

            points[0].y = source.y;
            points[1].y = source.y-1;
            points[2].y = source.y;
            points[3].y = source.y;
       orientation = Orientation.TOP;
    }
    }
}
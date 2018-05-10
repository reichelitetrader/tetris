package blocks;

import boards.Board;
import java.awt.Point;

public class Dot extends Block {   

    public Dot(Board board) {
        super(board);
    }

    @Override
    public Point[] getRotatedPoints() {
        return this.points;
    }
    
}

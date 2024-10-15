package Lab2.Task2;

public class Bishop extends Piece {
    public Bishop(Position position){
        super(position);
    }

    @Override
    public boolean isLegalMove(Position b){
        return Math.abs(position.getX() - b.getX()) == Math.abs(position.getY() - b.getY());
    }
}

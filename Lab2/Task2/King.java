package Lab2.Task2;

public class King extends Piece{
    public King(Position position){
        super(position);
    }

    @Override
    public boolean isLegalMove(Position b) {
        return Math.abs(position.getX() - b.getX()) <= 1 && Math.abs(position.getY() - b.getY()) <= 1;
    }
}

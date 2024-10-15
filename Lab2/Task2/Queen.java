package Lab2.Task2;

public class Queen extends Piece{
    public Queen(Position position){
        super(position);
    }

    @Override
    public boolean isLegalMove(Position b) {
        return (position.getX() == b.getX() || position.getY() == b.getY()) || Math.abs(position.getX() - b.getX()) == Math.abs(position.getY() - b.getY());
    }
}

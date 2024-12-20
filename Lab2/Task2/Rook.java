package Lab2.Task2;

public class Rook extends Piece{

    public Rook(Position position){
        super(position);
    }

    @Override
    public boolean isLegalMove(Position b) {
        return (position.getX() == b.getX() || position.getY() == b.getY());
    }
}

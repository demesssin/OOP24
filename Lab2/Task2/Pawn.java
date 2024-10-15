package Lab2.Task2;

public class Pawn extends Piece{
    public Pawn(Position position){
        super(position);
    }

    @Override
    public boolean isLegalMove(Position b) {
        return position.getX() == b.getX() && (b.getY() == position.getY() + 1);
    }
}

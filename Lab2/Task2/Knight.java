package Lab2.Task2;

public class Knight extends Piece{
    public Knight(Position position){
        super(position);
    }

    @Override
    public boolean isLegalMove(Position b) {
        int dx = Math.abs(position.getX() - b.getX());
        int dy = Math.abs(position.getY() - b.getY());
        return  (dx == 2 && dy == 1) || (dx == 1 && dy == 2);
    }
}


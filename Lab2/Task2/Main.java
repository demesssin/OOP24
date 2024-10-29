package Lab2.Task2;

public class Main {
    public static void main(String[] args) {
        // Тест ладьи
        Piece rook = new Rook(new Position(1, 1));
        System.out.println(rook.isLegalMove(new Position(1, 5))); // true
        System.out.println(rook.isLegalMove(new Position(2, 1))); // true
        System.out.println(rook.isLegalMove(new Position(2, 2))); // false

        // Тест слона
        Piece bishop = new Bishop(new Position(3, 3));
        System.out.println("Slon");
        System.out.println(bishop.isLegalMove(new Position(5, 5))); // true
        System.out.println(bishop.isLegalMove(new Position(4, 2))); // true
        System.out.println(bishop.isLegalMove(new Position(3, 5))); // false

        // Тест ферзя
        Piece queen = new Queen(new Position(4, 4));
        System.out.println(queen.isLegalMove(new Position(4, 7))); // true
        System.out.println(queen.isLegalMove(new Position(7, 4))); // true
        System.out.println(queen.isLegalMove(new Position(6, 6))); // true

        // Тест короля
        Piece king = new King(new Position(4, 4));
        System.out.println(king.isLegalMove(new Position(5, 5))); // true
        System.out.println(king.isLegalMove(new Position(6, 6))); // false

        // Тест коня
        Piece knight = new Knight(new Position(4, 4));
        System.out.println(knight.isLegalMove(new Position(6, 5))); // true
        System.out.println(knight.isLegalMove(new Position(5, 6))); // true

        // Тест пешки
        Piece pawn = new Pawn(new Position(4, 4));
        System.out.println(pawn.isLegalMove(new Position(4, 5))); // true
        System.out.println(pawn.isLegalMove(new Position(4, 6))); // false
    }
}

package prepmid1;

import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<Reader> readers = new Vector<>();

        Reader reader1 = new Reader("Assylzhan", "BS");
        Reader reader2 = new Reader("Nurkaht", "SITE");

        readers.add(reader1);
        readers.add(reader2);

        reader1.takeBook(2);
        reader1.takeBook("Microeconomics");
        reader1.takeBook("Sapiens");

        reader2.takeBook(1);
        reader2.takeBook("OOP Pakita");

        //  взятые книги
        for (Reader reader : readers) {
            reader.showTakenBooks();
        }

        // Assylzhan возвращает книгу "Sapiens"
        reader1.returnBook("Sapiens");

        // Показать оставшиеся книги после возврата
        for (Reader reader : readers) {
            reader.showRemainingBooks();
        }
    }
}

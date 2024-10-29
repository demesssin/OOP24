package Exceptions.Checked;

public class ScannerEx extends Exception {
    public ScannerEx(String description){
        super(description);
    }
    /*
    Здесь мы создаем свое исключение ScannerEx
    Такого исключения в основном классе Exception языка Java нет, но мы можем создать любой другой свой
     */
}

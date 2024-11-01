package Interfaces;

public interface Stateable {
    /*
    Тут мы рассмотрим использование констант в интерфейсах
     */
    int OPEN = 1;
    int CLOSED = 0;

    public void printState(int n);
}

package Interfaces;

public interface Calculatable {
    private int sumAll(int... values){
        int result = 0;
        for (int n : values){
            result = result + n;
        }
        return result;
    }
    default int sum(int a, int b){
        return sumAll(a, b);
    }
    default int sum(int a, int b, int c){
        return sumAll(a, b, c);
    }
    /*
    мы также можем определять в интерфейсе методы с модификатором private.
    Они могут быть статическими и нестатическими, но они не могут иметь реализации по умолчанию.
     */
}

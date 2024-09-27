package Lab1;

public class Methover {
    public int sum(int a, int b){
        return a + b;
    }
    public double sum(double a, double b){
        return a + b;
    }
    public int sum(int a, int b, int c){
        return a + b + c; // суть перегрузки методов в том что, мы перегружаем метод но можемм вызывать с помощью разности параметров
    }
}

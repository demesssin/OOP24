package NadiraInterfaces;

public class Calculator implements C {

    public void printResult(double result) {
        System.out.println("The result is: " + result);
    }

    public void add(double x, double y){
        double result = x + y;
        printResult(result);
    }
    public void subtract(double x, double y){
        double result = x - y;
        printResult(result);
    }
    public void multiply(double x, double y){
        double result = x * y;
        printResult(result);
    }
    public void divide(double x, double y){
        double result = x / y;
        printResult(result);
    }



}

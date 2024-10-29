package Lab1;
public class Temptest {
    public static void main(String[] args) {
        Temperature temptest1 = new Temperature();
        Temperature temptest2 = new Temperature(25);
        Temperature temptest3 = new Temperature('F');
        Temperature temptest4 = new Temperature(99, 'F');

        Temperature temptest5 = new Temperature();
        temptest5.setScale('F');
        temptest5.setValue(998.54);

        System.out.println(temptest1.getValue() + " " + temptest1.getScale());
        System.out.println(temptest2.getValue() + " " + temptest2.getScale());
        System.out.println(temptest3.getValue() + " " + temptest3.getScale());
        System.out.println(temptest4.getValue() + " " + temptest4.getScale());

        System.out.println(temptest4.toCelsius() + " " + temptest4.getScale());

        System.out.println(temptest5.toCelsius() + " " + temptest5.getScale());
    }
}

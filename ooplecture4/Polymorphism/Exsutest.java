package ooplecture4.Polymorphism;

public class Exsutest {
    public static void main(String[] args) {
        ExtendShow ext = new ExtendShow();
        SuperShow sup = ext;
        sup.show();
        ext.show();
        System.out.println("SuperShow: " + sup.str);
        System.out.println("ExtendShow: " + ext.str);
    }
}

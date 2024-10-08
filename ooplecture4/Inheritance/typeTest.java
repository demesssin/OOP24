package ooplecture4.Inheritance;

public class typeTest {
    static Person[] p = new Person[10];

    static{
        for (int i = 0; i < 10; i++){
            if (i < 5){
                p[i] = new Student();
            }
            else{
                p[i] = new Person();
            }
        }
    }

}

package ooplecture2;

public class Animal {
    private String name;
    public int age;
    public String gender;
    public int id;
    public char abc;


    public Animal(String newName, int age, String gender, int id) {
        this.age = age;
        this.id = id;  // ключевое слово this нужно когда название параметра и филда одинаковы
        name = newName; // тут как видим не нужно
        this.gender = gender;
    }

    public void setName(String name1) {
        name = name1;
    }
}

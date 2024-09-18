package ooplecture2;

public class Student {
    private String name;
    private int id;
    private int age;

    public Student(String someName, int id, int age ){
        this.name = someName;
        this.age = age;
        this.id = id;
    }

    public void setName(String nameSt){
        name = nameSt;
    }

    public String getName() {
        return name;
    }
    public void setId(int userId){
        id = userId;
    }
    public int getId(){
        return id;
    }
    public void setAge(int userAge){
        age = userAge;
    }
    public int getAge(){
        return age;
    }
}

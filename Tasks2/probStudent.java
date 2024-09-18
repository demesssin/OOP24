package Tasks2;

public class probStudent {
    private String name;
    private int id;
    private int year_of_study;

    public probStudent(String name, int id) {
        this.name = name;
        this.id = id;
        this.year_of_study = 0;
    }

    public void setName(String studName){
        name = studName;
    }
    public String getName(){
        return name;
    }
    public void setId(int studId){
        id = studId;
    }
    public int getId(){
        return id;
    }

    public void inc_year_of_study(){
        year_of_study++;
    }
    public int getYear_of_study(){
        return year_of_study;
    }
}
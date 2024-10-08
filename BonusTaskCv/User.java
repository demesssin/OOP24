package BonusTaskCv;

public class User {
    protected int id;
    protected String login;
    protected String password;
    protected String name;
    protected String surname;

    public User(int id, String login, String password, String name, String surname){
        this.id = id;
        this.login = login;
        this.password = password;
        this.name = name;
        this.surname = surname;
    }

    public String getData(){
        return id + " " + login + " " + password + " " + name + " " + surname;
    }

}

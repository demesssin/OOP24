package Interfaces;

public class Book implements Printable{
    String name;
    String author;

    public Book(String name, String author){
        this.name = name;
        this.author = author;
    }
    @Override
    public void print(){
        System.out.println(name + " " + author);
    }
    /*
    надо учитывать,
    что если класс применяет интерфейс,
    то он должен реализовать все методы интерфейса,
    как в случае выше реализован метод print.
     */
}

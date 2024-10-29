package prepmid1;

import java.util.Vector;

public class Reader {
    private String name;
    private String faculty;
    private Vector<String> bookTaken;

    public Reader(String name, String faculty){
        this.name = name;
        this.faculty = faculty;
        this.bookTaken = new Vector<>();
    }

    public String getName(){
        return name;
    }

    public String getFaculty(){
        return faculty;
    }

    public void takeBook(int numberOfBooks){
        System.out.println(getName() + " from " + getFaculty() + " took " + numberOfBooks + " books");
    }

    public void takeBook(String bookTitle){
        bookTaken.add(bookTitle);
    }

    public void showTakenBooks(){
        System.out.print(getName() + " from " + getFaculty() + " has taken books: ");
        for (String book : bookTaken){
            System.out.print(book + " ");
        }
        System.out.println();
    }

    public void returnBook(String bookTitle){
        if (bookTaken.contains(bookTitle)) {
            bookTaken.remove(bookTitle);
            System.out.println(getName() + " returned the book: " + bookTitle);
        } else {
            System.out.println(bookTitle + " not found in " + getName() + "'s books.");
        }
    }

    public void showRemainingBooks(){
        System.out.print(getName() + " from " + getFaculty() + " remaining books: ");
        for (String book : bookTaken){
            System.out.print(book + " ");
        }
        System.out.println();
    }
}

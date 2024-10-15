package Lab2.Task1b;

public class LibraryItem {
    private String title;
    private String author;
    private int publicationYear;

    public LibraryItem(String title, String author, int publicationYear){
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public void setTitle(String someTitle){
        title = someTitle;
    }
    public String getTitle(){
        return title;
    }
    public void setAuthor(String someAuthor){
        author = someAuthor;
    }
    public String getAuthor(){
        return author;
    }
    public void setPublicationYear(int someYear){
        publicationYear = someYear;
    }
    public int getPublicationYear(){
        return publicationYear;
    }

    public String toString(){
        return "You chosen something from library, what is it Ansar?";
    }
}

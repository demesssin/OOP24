package Lab2.Task1b;

public class Book extends LibraryItem{
    private int numberOfPages;

    public Book(String title, String author, int publicationYear, int numberOfPages) {
        super(title, author, publicationYear);
        this.numberOfPages = numberOfPages;
    }

    public void setNumberOfPages(int someNumberOfPages){
        numberOfPages = someNumberOfPages;
    }
    public int getNumberOfPages(){
        return numberOfPages;
    }

    @Override
    public String toString(){
        return "You had chosen book: " + getTitle() + " of " + getAuthor() + " maded in " + getPublicationYear() + " which contain" + getNumberOfPages() + " pages";
    }
}

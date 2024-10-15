package Lab2.Task1b;

public class Dvd extends LibraryItem{
    private String capacity;

    public Dvd(String title, String author, int publicationYear, String capacity){
        super(title, author, publicationYear);
        this.capacity = capacity;
    }

    public void setCapacity(String someCapacity){
        capacity = someCapacity;
    }
    public String getCapacity(){
        return capacity;
    }
    @Override
    public String toString(){
        return "You have chosen dvd: " + getTitle() + ", of " + getAuthor() + ", maded in " + getPublicationYear() + " with capacity " + getCapacity();
    }
}

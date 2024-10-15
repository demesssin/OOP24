package Lab2.Task1b;

public class Magazine extends LibraryItem{
    private String topics;

    public Magazine(String title, String author, int publicationYear, String topics){
        super(title, author, publicationYear);
        this.topics = topics;
    }

    public void setTopics(String someTopics){
        topics = someTopics;
    }
    public String getTopics(){
        return topics;
    }

    @Override
    public String toString(){
        return "You have chosen magazine: " + getTitle() + ", of " + getAuthor() + " maded in " + getPublicationYear() + ", about " + getTopics();
    }
}

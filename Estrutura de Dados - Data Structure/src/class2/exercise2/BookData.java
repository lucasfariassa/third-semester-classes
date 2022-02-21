package class2.exercise2;

public interface BookData {
    void insertTitle(String title);
    void insertPublisher(String publisher);
    void insertYear(String year);
    String getTitle(int book); // return the title of book
    String getPublisher(int book); // return the publisher of the book
    String getYear(int book); // return the publishing year
}

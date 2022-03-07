package exerciseList1.question1;

public interface BookData { // Book structure
    void insertData(String title, String publisher, String year);
    String getTitle(int title); // return the title of book
    String getPublisher(int publisher); // return the publisher of the book
    String getYear(int year); // return the publishing year
}

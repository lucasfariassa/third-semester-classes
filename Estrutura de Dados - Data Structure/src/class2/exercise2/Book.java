package class2.exercise2;

public class Book implements BookData {
    private final String[] titlesVector, publishersVector, yearsVector;
    private int t, p, y;

    public Book() { // the book structure
        titlesVector = new String[10];
        publishersVector = new String[10];
        yearsVector = new String[10];
        t = 0;
        p = 0;
        y = 0;
    }

    public void insertTitle(String title) {
        titlesVector[t++] = title;
    }

    // Return the title of the book
    public String getTitle(int it) {
        return titlesVector[it];
    }

    public void insertPublisher(String publisher) {
        publishersVector[p++] = publisher;
    }

    // Return the publisher of the book
    public String getPublisher(int ip) {
        return publishersVector[ip];
    }

    public void insertYear(String year) {
        yearsVector[y++] = year;
    }

    // Return the year of the book
    public String getYear(int iy) {
        return yearsVector[iy];
    }
}

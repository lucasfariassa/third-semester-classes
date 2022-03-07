package exerciseList1.question1;

import exerciseList1.question1.BookData;

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

    public void insertData(String title, String publisher, String year) {
        titlesVector[t++] = title;
        publishersVector[p++] = publisher;
        yearsVector[y++] = year;
    }

    // Return the title of the book
    public String getTitle(int title) {
        return titlesVector[title];
    }


    // Return the publisher of the book
    public String getPublisher(int publisher) {
        return publishersVector[publisher];
    }


    // Return the year of the book
    public String getYear(int year) {
        return yearsVector[year];
    }
}

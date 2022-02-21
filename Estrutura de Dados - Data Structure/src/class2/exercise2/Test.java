package class2.exercise2;

public class Test {
    public static void main(String[] args) {
        Book livro = new Book(); // new list of books
        livro.insertTitle("Harry Potter and the Philosopher's Stone");
        livro.insertPublisher("Bloomsbury Publishing");
        livro.insertYear("1997");

        livro.insertTitle("Diary of a Wimpy Kid");
        livro.insertPublisher("Amulet Books");
        livro.insertYear("2007");

        System.out.println(livro.getTitle(0));
        System.out.println(livro.getPublisher(0));
        System.out.println(livro.getYear(0));
        System.out.println();
        System.out.println(livro.getTitle(1));
        System.out.println(livro.getPublisher(1));
        System.out.println(livro.getYear(1));
    }
}

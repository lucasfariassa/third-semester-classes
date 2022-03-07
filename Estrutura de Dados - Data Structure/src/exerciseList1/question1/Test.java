package exerciseList1.question1;

public class Test {
    public static void main(String[] args) {
        Book book = new Book();
        book.insertData("A Revolução dos Bichos","Companhia das Letras", "1945");
        book.insertData("The Seven Deadly Sins vol. 01", "Editora JBC", "2016");

        System.out.println("Título: " + book.getTitle(0));
        System.out.println("Ano: " + book.getYear(0));
        System.out.println("Editora: " + book.getPublisher(0));
    }
}

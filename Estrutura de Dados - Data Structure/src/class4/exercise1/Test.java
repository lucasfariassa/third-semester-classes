package class4.exercise1;

public class Test {
    public static void main(String[] args) {
        StudentList sl = new StudentList();
        sl.insertBeginning("Hamilton");
        System.out.println(sl);
        sl.insertBeginning("Lucas");
        System.out.println(sl);
        sl.insertBeginning("Oseias");
        System.out.println(sl);
        sl.insertBeginning("Duque");
        System.out.println(sl);
        sl.insertBeginning("Luiz");
        System.out.println(sl);
        sl.insertBeginning("Harrison");
        System.out.println(sl);
        System.out.println();

        sl.removeIndex(5);
        System.out.println(sl);
        System.out.println();

        System.out.println(sl.verifyName("Lucas"));
    }
}

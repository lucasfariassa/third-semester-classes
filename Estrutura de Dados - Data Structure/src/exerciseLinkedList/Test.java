package exerciseLinkedList;

public class Test {
    public static void main(String[] args) {
        SimpleList sl = new SimpleList();
        System.out.println(sl);

        // Testando o método insertHead() - Testing the method insertHead():
        sl.insertHead("Hamilton Sobrinho");
        System.out.println(sl);
        System.out.println();

        //Testando o método insertTail() - Testing the method insertTail():
        sl.insertTail("Lucas Farias");
        System.out.println(sl);
        sl.insertTail("Oseias Lopes");
        System.out.println(sl);
        sl.insertTail("Iago Roque");
        System.out.println(sl);
        sl.insertTail("Guilherme Duque");
        System.out.println(sl);
        sl.insertTail("Marcos Pacheco");
        System.out.println(sl);
        System.out.println();

        // Testando o método listSize() - Testing the method listSize():
        System.out.println(sl.listSize());
        System.out.println();

        // Testando o método removeNode() - Testing the method removeNode():
        System.out.print("O nÃ³ removido foi - The removed node was: ");
        System.out.println(sl.removeNode(5));
        System.out.println(sl);
        
        // Testando o método findNameList() - Testing the method findNameList():
        sl.findNameList("Oseias Lopes");
    }
}

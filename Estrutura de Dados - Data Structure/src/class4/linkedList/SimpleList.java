package class4.linkedList;

public class SimpleList {
    Node beginning = null;
    int size = 0;

    public void insertBeginning(String info) {
        Node node = new Node();
        node.info = info;
        node.next = beginning;
        beginning = node;
        size++;
    }

    public String toString() {
        /* Sobrescrição da classe do Java para personalizar a saída, mostrando o tamanho
        e o conteúdo da lista - Java class override to customize output, showing current
        list size and content */
        String str = "Tamanho atual da lista: (" + size + ") | Conteúdo: ";
        Node local = beginning;
        while (local != null) {
            str += local.info + " ";
            local = local.next;
        }
        return str;
    }
}

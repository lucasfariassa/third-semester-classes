package class4.exercise1;

public class StudentList {
    Node beginning = null;
    int size = 0;

    public void insertBeginning(String info) {
        Node node =  new Node();
        node.info = info;
        node.next = beginning;
        beginning = node;
        size++;
    }

    public String removeBeginning() {
        if (beginning == null) {
            return null;
        }
        String info = beginning.info;
        beginning = beginning.next;
        size--;

        return info;
    }

    public void insertIndex(int index, String info) {
        if (index <= 0) {
            insertBeginning(info);
        } else if (index >= size) {
            insertEnd(info);
        } else {
            Node local = beginning;
            for (int i = 0; i < index; i++) {
                local = local.next;
            }
            Node node = new Node();
            node.info = info;
            node.next = local.next;
            size++;
        }
    }

    public String removeIndex(int index) {
        if (index < 0 || index >= size || beginning == null) {
            return null;
        } else if (index == 0) {
            System.out.println("Índice " + index + " removido! - Index " + index + " removed!");
            return removeBeginning();
        } else if (index == size-1) {
            System.out.println("Índice " + index + " removido! - Index " + index + " removed!");
            return removeEnd();
        }
        Node local = beginning;
        for (int i = 0; i < index-1; i++) {
            local = local.next;
        }
        String info = local.next.info;
        local.next = local.next.next;
        size--;
        return info;
    }

    private void insertEnd(String info) {
        Node node = new Node();
        node.info = info;
        if (beginning == null) {
            node.next = null;
            beginning = node;
        } else {
            Node local = beginning;
            while (local.next != null) {
                local = local.next;
            }
            local.next = node;
            node.next = null;
        }
        size++;
    }

    private String removeEnd() {
        if (beginning == null) {
            return null;
        }
        Node local = beginning;
        while (local.next != null) {
            Node aux = local;
            local = local.next;
            if (local.next == null) {
                aux.next = null;
                size--;
                return local.info;
            }
        }
        beginning = null;
        size--;
        return local.info;
    }

    public String verifyName(String info) {
        String str = null;
        Node local = beginning;
        while (local != null) {
            str += local.info;
            local = local.next;
        }
        if (str.contains(info)) {
            str = info + " está na lista! - " + info + " is on the list!";
        } else {
            str = info + " não está na lista! - " + info + " isn't on the list!";
        }
        return str;
    }

    public String toString() {
        String str = "Tamanho atual da lista: (" + size + ") | Estudantes: ";
        Node local = beginning;
        while (local != null) {
            str += local.info + " ";
            local = local.next;
        }
        return str;
    }
}

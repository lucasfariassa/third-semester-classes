package exerciseLinkedList;

public class SimpleList {
    Node head = null; // definição do início da lista - definition of the head of the list
    int size = 0; // variável de tamanho da lista - list size variable

    public void insertHead(String info) { // inserir no início da lista - insert a node at the head of the list
        Node node = new Node();
        node.info = info; // registra o dado recebido pelo parâmetro - registers the data received from parameter
        node.next = head; /* o "próximo" do novo nó aponta para a atual localização do início da lista -
							the "next" of the new node point to current localization of the head of the list */
        head = node; // o inÃ­cio se torna o nó recÃ©m criado - the head become the newly created node
        size++; /* aumenta a lista, pois foi adicionado um novo nó - increases the list because a new node
                has just been created */
    }

    public void insertTail(String info) { // inserir no final da lista - insert a node at the tail of the list
        Node node = new Node();
        node.info = info;
        if (head == null) { /* verifica se há apenas um nó existente para adicionar um ao final dele -
							checks if there is only one node in the list to be able to insert a new one
							at the end of it */
            head = node;
            node.next = null;
        } else { /* verifica quantos nós existem para adicionar um ao final - checks how many nodes there are
                    to add one to the end */
            Node local = head; /* ponteiro auxiliar de localização (inicialmente aponta para o início da lista) -
                                location helper pointer (initially points to the beginning of the list) */
            while (local.next != null) { /* verifica se o "próximo" do nó está apontando para null - checks if the
                                        "next" of the node is pointing to null */
                local = local.next; /* caso o nó aponte para o null, o ponteiro "local" finalmente encontra
                                    o último nó - if the node points to null, the "local" pointer finally finds
                                    the last node */
            }
            local.next = node; /* define que o nó que está na localização atual do ponteiro "local" agora aponte para
                                o nó recém-criado - sets that the node that is at the current location of the "local"
                                pointer will now point to the newly created node */
            node.next = null; /* define que o nó recém criado aponte para o null, fazendo-o se tornar o último da
                                 lista - sets the newly created node to point to null, making it the last one
                                 in the list */
            size++;
        }
    }

    public String removeNode(int position) { /*  remover um nó de uma posição desejada — remove a node from a specific
                                                desired position */
        if(position < 0 || position >= size || head == null) {
            return null;
        } else if (position == 0) {
            return removeHead();
        } else if (position == size-1) {
            return removeTail();
        }
        Node local = head;
        for (int i = 0; i < position-1; i++) { /* localiza o nó anterior ao que se deseja remover - finds the node
                                                before the one you want to remove */
            local = local.next; /* salva a posição do que o nó excluído está apontando - saves the position of what
                                the deleted node is pointing to */
        }
        String info = local.next.info; // exibe a informação apagada - show the information erased
        local.next = local.next.next; /* define que o "próximo" do "próximo" (o elemento após ao que se deseja remover)
                                        será o novo "próximo" do nó anterior ao que foi retirado - defines that the
                                        "next" of the "next" (the element after the one to be removed) will be the
                                        new "next" of the node before the one that was removed */
        size--;
        return info;
    }

    private String removeHead() { // remover o primeiro nó da lista
        if (head == null) { // testa se a lista está vazia - tests if the list is empty
            return null;
        }
        String info = head.info; // salva a informação para printar o que foi apagado
        head = head.next; // define o ponteiro para o próximo nó, colocando o segundo em primeiro lugar
        size--;
        return info;
    }

    private String removeTail() { // remover o último nó da lista
        if (head == null) { // testa se a lista está vazia - tests if the list is empty
            return null;
        }
        Node local = head; // inicializa um ponteiro no início da lista
        while (local.next != null) { // procura o último nó através do ponteiro creiado anteriormente
            Node aux = local; /* inicializa um ponteiro que aponta para o local atual e auxiliar na captura da informação
            					do nó atual */
            local = local.next;
            if (local.next == null) { /* verifica se o ponteiro "local" do "próximo" está apontando para o null 
            							(observando que o último nó sempre aponta para null) */
                aux.next = null;
                size--;
                return local.info; // retorna a informação do que foi excluído
            }
        }
        head = null;
        size--;
        return local.info;
    }

    public String listSize() { // exibir o tamanho da lista - show list size
        return "Tamanho da Lista - List Size: " + size;
    }
    
    public boolean findNameList() {
    	Node local = beginning;
    	boolean found = false;
    	for (int i = 0; i < size; i++) {
    		if (local.info == info) {
    			found = true;
    		}
    		local = local.next;
    	}
    	return found;
    }

    public String toString() { /* sobrescrição para personalizar a classe toString do Java - override to customize
                                Java's toString class */
        String str = "(" + size + ") ";
        Node local = head;
        while (local != null) {
            str += "[" + local.info + "] ";
            local = local.next;
        }
        return str;
    }

}
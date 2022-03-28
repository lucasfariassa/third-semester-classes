package class6;

public class DoublyLinkedList {
	Node head; // nó do início - head node
	Node tail; // nó do final - tail node
	int size; // tamanho da lista - list size

	public void insertHead(String info) {
		Node node = new Node();
		node.info = info;
		node.previous = null;
		node.next = head;
		if (size == 0) { // verifica se há nós na lista - checks if there is nodes at the list
			tail = head; // define que ambos sejam nulos - defines both to null
		}
		if (head != null) {
			head.previous = node; /* define que o "anterior" do nó inicial aponte para o novo nó (que foi colocado
									na frente dele) - defines that "previous" of the node points to the new node 
									(that was added in front of it) */
		}
		head = node; // o novo nó se torna o início da lista -  the new node becomes the head of the list
		size++;

	}

	public String toString() { /* sobrescrição para personalizar a classe toString do Java - override to customize Java's 
								toString class */
		String str = "(" + size + ") ";
		Node local = head;
		while (local != null) {
			str += "[" + local.info + "] ";
			local = local.next;
		}
		return str;
	}

}

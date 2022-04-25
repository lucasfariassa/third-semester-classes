package class7.CircularList;

public class DynamicCircularQueue {
	NodeCircularQueue head = null;
	NodeCircularQueue tail = null;

	public boolean empty() { // Testador para verificar se a fila está vazia - Tester to check if the queue is empty
		return head == null && tail == null;
	}
	
	public void addToQueue(int data) { // Adiciona um novo nó à fila - Adds a new node to queue
		NodeCircularQueue newNode = new NodeCircularQueue(data);
		
		if(empty()) {
			head = newNode;
			tail = newNode;
			tail.next = head;
		} else {
			newNode.next = head;
			tail.next = newNode;
			tail = newNode;
		}
	}
	
	public int removeFromQueue() { // Não está funcionando corretamente - Not working correctly
		int removed;
		
		if (empty()) {
			removed = -1;
		} else if(head == tail) {
			removed = head.data;
			head = null;
			tail = null;
		} else {
			removed = head.data;
			tail = head;
			head = head.next;
			tail.next = head;
		}
		return removed;
	}
	
	@Override
	public String toString() { // Imprime a fila de nós - Print the node queue
		String listed = "Números - Numbers:" + "\n";
		int number = 1;
		
		if(empty()) {
			return listed = "Não foi possível encontrar valores cadastrados - Unable to find recorded values";
		} else if(head == tail) {
			listed = listed + number + ". " + head.data;
		} else {
			NodeCircularQueue aux = head;
			if(aux == tail.next) {
				listed = listed + number + ". " + aux.data + "\n";
				aux = aux.next;
				number++;
			}
			while(aux != tail.next) {
				listed = listed + number + ". " + aux.data + "\n";
				aux = aux.next;
				number++;
			}
		}
		return listed;
	}
}

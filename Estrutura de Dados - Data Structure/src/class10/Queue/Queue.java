package class10.Queue;

public class Queue {
	Node rear; // Também chamado de "início" em português - also called "tail" in English
	Node front; // Também chamado de "cabeça" em português - also called "head" in English
	int size;

	Queue() {
		front = null;
		rear = null;
		size = 0;
	}

	String frontContent() {
		if (front == null) {
			return "Nó não encontrado! A fila está vazia - Node was not found! The queue is empty";
		}
		return front.info;
	}

	String rearContent() {
		if (rear == null) {
			return "Nó não encontrado! A fila está vazia - Node was not found! The queue is empty";
		}
		return rear.info;
	}

	int size() {
		return size;
	}

	boolean isEmpty() {
		return rear == null;
	}

	void enqueue(String info) {
		Node node = new Node();
		node.info = info;
		node.next = rear;
		rear = node;
		if (size == 0) {
			front = node;
		}
		size++;
	}

	String dequeue() {
		if (isEmpty()) {
			return "Nó não encontrado! A fila está vazia - Node was not found! The queue is empty";
		}
		String info = front.info;
		if (size == 1) {
			rear = null;
			front = null;
		} else {
			Node local = rear;
			while (local.next != front) {
				local = local.next;
			}
			front = local;
			front.next = null;
		}
		size--;
		return info;
	}

	void find(String info) {
		Node local = rear;
		if (isEmpty()) {
			System.out.println("Nó não encontrado! A fila está vazia - Node was not found! The queue is empty");
		}
		while (info != local.info) {
			local = local.next;
			if (local.info.equals(info)) {
				System.out.println("Nó encontrado - Node was found: " + local.info);
			} else {
				System.out.println("Nó " + info + " não encontrado! - "  + "Node " + info + " was not found!");
				break;
			}
		}
	}

}

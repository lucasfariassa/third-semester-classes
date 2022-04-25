package class7.CircularList;

public class Test {

	public static void main(String[] args) {
		DynamicCircularQueue dcq = new DynamicCircularQueue();
		
		// Testando adição à fila - Testing addition to queue:
		dcq.addToQueue(350);
		dcq.addToQueue(1305);
		dcq.addToQueue(4673);
		System.out.println(dcq.toString());
		
		// Testando remoção da fila - Testing removal from queue:
		dcq.removeFromQueue();
		System.out.println(dcq.toString());
	}

}

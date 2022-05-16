package class10.Queue;

public class Test {

	public static void main(String[] args) {
		Queue q = new Queue();
		q.enqueue("Lucas");
		System.out.println("Nó adicionado - Added node: " + q.rearContent());
		q.enqueue("João");
		System.out.println("Nó adicionado - Added node: " + q.rearContent());
		q.enqueue("Pedro");
		System.out.println("Nó adicionado - Added node: " + q.rearContent());
		q.enqueue("Paulo");
		
		System.out.println();
		System.out.println("A fila tem " + q.size + " nó(s) - The queue has " + q.size() + " node(s)");
		System.out.println();
		
		q.find("Pedro");
		System.out.println();
		q.find("Tiago");
		System.out.println();

		
		while(!q.isEmpty()) {
			System.out.println("Nó desinfileirado - Dequeued node: " + q.dequeue());
		}
		
		
		System.out.println();
		System.out.println("A fila tem " + q.size + " nó(s) - The queue has " + q.size() + " node(s)");
	}

}

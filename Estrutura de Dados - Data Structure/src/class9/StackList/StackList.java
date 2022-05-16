package class9.StackList;

public class StackList {
	int size = -1;
	Node head;
	Node[] stack = new Node[10];
	
	public void addNode(String info) {
        Node node = new Node();
        node.info = info;
        node.next = head;
        head = node;      
        size++;    
        stack[size] = head;
	}
	
	public void toList() {
		Node local = head;
		while(local != null) {
			System.out.println(local.info);
			local = local.next;
		}
	}
	
//	public void search(String writing) {
//		Node local = head;
//		boolean result = false;
//		for (int i = -1; i < size; i++) {
//			if(local.info.equals(writing)) {
//				result = true;
//				if(result == true) {
//					System.out.println("Nó encontrado: " + local.info);
//				}
//			}
//			local = local.next;
//		}
//		
//		if(result == false) {
//			System.out.println("Nó não encontrado!");
//		}
//	}
	
	public void search(String writing) {
		Node local = head;
		@SuppressWarnings("unused")
		boolean result = false;
		for (int i = -1; i < size; i++) {
			if(local.info.equals(writing)) {
				result = true;
				System.out.println("Nó encontrado: " + writing);
			}
			local = local.next;
		}
		System.out.println("Nó não encontrado.");
	}
}

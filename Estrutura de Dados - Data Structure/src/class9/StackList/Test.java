package class9.StackList;

public class Test {
	public static void main(String[] args) {
		StackList list = new StackList();

		list.addNode("Primeiro");
		list.addNode("Lucas");
		list.addNode("Último");
		
		list.toList();
		
		list.search("Primeiro");
		list.search("Segundo");
	}
}

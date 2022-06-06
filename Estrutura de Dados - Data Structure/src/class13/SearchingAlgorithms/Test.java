package class13.SearchingAlgorithms;

public class Test {
	public static void main(String[] args) {
		LinearSearch ls = new LinearSearch();
		BinarySearch bs = new BinarySearch();
		System.out.println("Busca Sequencial Desorganizada:");
		System.out.println(ls.buscaSeqDesorg(5));
		System.out.println();
		
		System.out.println("Busca Sequencial Organizada:");
		System.out.println(ls.buscaSeqOrg(24));
		System.out.println();
		
		System.out.println("Busca Binária Organizada:");
		System.out.println(bs.binSearch(24));
		System.out.println();
		
		System.out.println("Busca Binária Desorganizada:");
		System.out.println(bs.binSearchUnsorted(24));
	}
}

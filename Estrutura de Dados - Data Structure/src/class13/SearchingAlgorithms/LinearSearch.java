package class13.SearchingAlgorithms;

public class LinearSearch {
	int vector[] = { 1, 10, 5, 42, 38, 19, 51, 24 };
	OrdenationMethods om = new OrdenationMethods();

	public String buscaSeqDesorg(int number) {
		om.currentVector(vector);
		for (int i = 0; i < vector.length; i++) {
			if (number == vector[i]) {
				return "Número " + number + " encontrado no índice: " + i;
			}
		}
		return "Número não encontrado!";
	}

	public String buscaSeqOrg(int number) {
		om.insertionSort(vector);
		om.currentVector(vector);
		for (int i = 0; number >= vector[i]; i++) {
			if (number == vector[i]) {
				return "Número " + number + " encontrado no índice: " + i;
			}
		}
		return "Número não encontrado!";
	}
}

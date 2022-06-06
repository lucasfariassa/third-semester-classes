package class13.SearchingAlgorithms;

public class OrdenationMethods {
	public void insertionSort(int vector[]) {
		for (int i = 0; i < vector.length; i++) {
			int elected = vector[i];
			int j = i - 1;
			while (j >= 0 && vector[j] > elected) {
				vector[j + 1] = vector[j];
				j = j - 1;
			}
			vector[j + 1] = elected;
		}
	}

	public void currentVector(int vector[]) {
		System.out.print("Vetor: ");
		for (int i = 0; i < vector.length; i++) {
			System.out.print("(" + vector[i] + ") ");
		}
		System.out.println();
	}
}

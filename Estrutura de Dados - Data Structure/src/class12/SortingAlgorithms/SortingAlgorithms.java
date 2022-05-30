package class12.SortingAlgorithms;

import java.util.concurrent.TimeUnit;

public class SortingAlgorithms {
	static int[] x = { 1, 10, 5, 42, 38, 19, 51, 24 };
	static int j;

	public static void main(String[] args) {
		// insertionSort();
		// selectionSort();
		// bubbleSort();
		// mergeSort(j, j, j);
	}

	public static void insertionSort() {
		System.out.println("<------------------------ INSERTION SORT ------------------------>");
		System.out.println();
		initialSort();
		for (int i = 0; i < x.length; i++) {
			int elected = x[i];
			j = i - 1;
			while (j >= 0 && x[j] > elected) {
				System.out.println("É necessário mover - It's necessary to move: (" + elected + ")");
				waitAsecond();
				x[j + 1] = x[j];
				j = j - 1;
			}
			x[j + 1] = elected;
		}
		currentSort();
		System.out.println("<---------------------------------------------------------------->");
	}

	public static void selectionSort() {
		System.out.println("<------------------------ SELECTION SORT ------------------------>");
		initialSort();
		for (int i = 0; i < x.length - 1; i++) {
			int elected = x[i], minor = x[i + 1], position = i + 1;
			for (int j = i + 1; j <= 7; j++) {
				if (x[j] < minor) {
					System.out.println("Verificando se (" + x[j] + ") é menor que: (" + minor + ")");
					minor = x[j];
					position = j;
					waitAsecond();
				}
			}
			if (minor < elected) {
				System.out.println("Verificando se (" + minor + ") é menor que: (" + elected + ")");
				x[i] = x[position];
				x[position] = elected;
				waitAsecond();
			}
		}
		currentSort();
		System.out.println("<---------------------------------------------------------------->");
	}

	public static void bubbleSort() {
		System.out.println("<-------------------------- BUBBLE SORT -------------------------->");
		System.out.println();
		initialSort();
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x.length - 1; j++) {
				if (x[j] > x[j + 1]) {
					int aux = x[j];
					x[j] = x[j + 1];
					x[j + 1] = aux;
				}
				System.out.println("Flutuando bolhas...");
				waitSomeMilliseconds();
			}
		}
		currentSort();
		System.out.println("<----------------------------------------------------------------->");

	}

	public static void mergeSort(int x, int beginning, int end) {
		System.out.println("<-------------------------- MERGE SORT -------------------------->");
		initialSort();
		int half;
		if(beginning < end) {
			half = beginning + end / 2;
			mergeSort(x, beginning, half);
			mergeSort(x, half + 1, end);
			// intercala(x, beginning, end, half)
		}
		currentSort();
		System.out.println("<---------------------------------------------------------------->");

	}
	
	public static void initialSort() {
		System.out.print("Ordem inicial - Initial sort: ");

		for (int i = 0; i < x.length; i++) {
			System.out.print("(" + x[i] + ") ");
		}

		System.out.println();
		System.out.println();
		System.out.println("Ordenando... - Sorting... ");
		System.out.println();
	}

	public static void currentSort() {
		System.out.println();
		System.out.println("Ordenado! - Sorted!");
		waitAsecond();
		System.out.println();
		System.out.print("Ordem atual - Current sort: ");

		for (int i = 0; i < x.length; i++) {
			System.out.print("(" + x[i] + ") ");
		}
		System.out.println();
	}

	public static void waitAsecond() {
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void waitSomeMilliseconds() {
		try {
			TimeUnit.MILLISECONDS.sleep(125);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

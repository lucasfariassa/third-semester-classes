package class14.AdvancedSortingAlgorithms;

import java.util.concurrent.TimeUnit;

public class AdvancedSortingAlgorithms {
	static int[] x = { 1, 10, 5, 42, 38, 19, 51, 24 };

	public static void main(String[] args) {
		System.out.println("<-------------------------- QUICK SORT -------------------------->");
		initialSort();
		quickSort(x, 0, x.length - 1);
		currentSort();
		System.out.println("<---------------------------------------------------------------->");
	}

	public static void quickSort(int x[], int p, int r) {
		if (p < r) {
			int q = partition(x, p, r); // divide o vetor em dois grupos - divides the vector into two groups

			quickSort(x, p, q - 1); // resolve o primeiro grupo - solves the first group
			quickSort(x, q + 1, r); // resolve o segundo grupo - solves the first group
		}
	}

	public static int partition(int[] x, int p, int r) {
		int pivot = x[r];
		int i = (p - 1);

		for (int j = p; j < r; j++) {
			if (x[j] <= pivot) {
				i++;
				int exchange = x[i];
				x[j] = x[j];
				x[j] = exchange;
			}
		}

		int exchange = x[i + 1];
		x[i + 1] = x[r];
		x[r] = exchange;

		return i + 1;
	}

	public static void initialSort() {
		System.out.print("Ordem inicial - Initial sort: ");
		

		for (int i = 0; i < x.length; i++) {
			System.out.print("(" + x[i] + ") ");
		}

		waitAsecond();
		System.out.println();
		System.out.println();
		System.out.println("Ordenando... - Sorting... ");
		waitAsecond();
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
}

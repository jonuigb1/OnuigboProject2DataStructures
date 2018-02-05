package edu.westga.cs3151.project2;

import java.util.Random;

public class Sort {
	public static <T> void swap(T[] data, int i, int j) {
		T tmp = data[i];
		data[i] = data[j];
		data[j] = tmp;
	}

	public static <T> void shuffle(T[] data) {
		Random rnd = new Random();

		for (int n = data.length - 1; n > 0; n--) {
			int m = rnd.nextInt(n + 1);
			if (m != n) {
				swap(data, n, m);
			}
		}
	}

	public static <T extends Comparable<T>> void insertionSort(T[] data) {
		for (int i = 1; i < data.length; i++) {
			T x = data[i];
			int j = i - 1;
			while (j >= 0 && (data[j].compareTo(x) > 0)) {
				swap(data, j + 1, j);
				j--;
			}
			data[j + 1] = x;
		}
		return;
	}

	public static <T extends Comparable<T>> void bubbleSort(T[] data) {

		for (int i = data.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (data[j + 1].compareTo(data[j]) < 0) {
					swap(data, j, j + 1);
				}
			}
		}
	}

}

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

	public static <T extends Comparable<T>> void selectionSort(T[] data) {
		for (int i = 0; i < data.length - 1; i++) {
			int index = i;
			for (int j = i + 1; j < data.length; j++) {
				if (data[j].compareTo(data[index]) < 0) {
					index = j;
				}
			}
			if (i != index) {
				swap(data, i, index);
			}
		}
	}

	@SuppressWarnings("unchecked")
	public static <T extends Comparable<T>> void mergeSort(T[] data) {
		T[] temp = (T[]) new Comparable[data.length];
		mergeSort(data, temp, 0, data.length);
	}

	private static <T extends Comparable<T>> void mergeSort(T[] data, T[] buffer, int min, int max) {
		if (max - min <= 1) {
			return;
		}
		int mid = (min + max) / 2;
		mergeSort(data, buffer, min, mid);
		mergeSort(data, buffer, mid, max);
		merge(data, buffer, min, mid, max);
	}

	private static <T extends Comparable<T>> void merge(T[] data, T[] buffer, int min, int mid, int max) {
		int i = min;
		int j = mid;
		int current = min;
		while ((i < mid) && (j < max)) {
			if (data[i].compareTo(data[j]) < 0) {
				buffer[current++] = data[i++];
			} else {
				buffer[current++] = data[j++];
			}
		}
		while (i < mid) {
			buffer[current++] = data[i++];
		}
		while (j < max) {
			buffer[current++] = data[j++];
		}
		for (current = min; current < max; current++) {
			data[current] = buffer[current];
		}
	}

	public static <T extends Comparable<T>> void quickSort(T[] data) {
		quickSort(data, 0, data.length - 1);
	}

	public static <T extends Comparable<T>> void quickSort(T[] data, int min, int max) {
		if (min >= max) {
			return;
		}
		int mid = parition(data, min, max);
		if (min < mid - 1) {
			quickSort(data, min, mid);
		}
		if (mid < max) {
			quickSort(data, mid, max);
		}
	}

	private static <T extends Comparable<T>> int parition(T[] data, int min, int max) {
		T pivot = data[min];
		int index = min;
		int j = max;
		while (index <= j) {
			while (data[index].compareTo(pivot) < 0) {
				index++;
			}
			while (data[j].compareTo(pivot) > 0) {
				j--;
			}
			if (index <= j) {
				swap(data, index, j);
				index++;
				j--;
			}
		}
		return index;
	}

}

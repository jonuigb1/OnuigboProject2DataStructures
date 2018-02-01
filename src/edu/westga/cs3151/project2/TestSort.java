package edu.westga.cs3151.project2;

import java.io.PrintWriter;

public class TestSort {
	

	public static void main(String[] args) {
		
		int max = 20;
		Integer[] array = new Integer[max];
		
		for(int i=0;i<max;i++) {
			array[i] = i;
		}
		
		for(int i=0;i<max;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
		Sort.shuffle(array);
		for(int i=0;i<max;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
		
		long start = System.currentTimeMillis();
		
		Sort.insertionSort(array);
		
		long end = System.currentTimeMillis();
		
		long elapsed = end - start;
		for(int i=0;i<max;i++) {
			System.out.println(i+"\t"+array[i]+ " ");
			PrintWriter writer = null;
			
		}
	}

}

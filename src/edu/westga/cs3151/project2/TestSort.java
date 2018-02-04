package edu.westga.cs3151.project2;

import java.io.File;
import java.io.PrintWriter;

public class TestSort {
	

	public static void main(String[] args) {
		
		int max = 100000;
		Integer[] array = new Integer[max];
		
		for(int i=0;i<max;i++) {
			array[i] = i;
		}
		
		for(int i=0;i<max;i+=100) {
			System.out.println(array[i]+" ");
		}
		System.out.println();
		Sort.shuffle(array);
		for(int i=0;i<max;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
		
		//long start = System.currentTimeMillis();
		
		Sort.insertionSort(array);
		
		//long end = System.currentTimeMillis();
		
		//long elapsed = end - start;
		
			
			PrintWriter writer = null;
			try {
				writer = new PrintWriter(new File("data.csv"));
			}catch(Exception err) {};
			
			long start,end,elapsed;
			for(int i=10;i<10000;i++) {
				start = System.currentTimeMillis();
			    Sort.insertionSort(array);
				end = System.currentTimeMillis();
				elapsed = end - start;
				writer.write(i+","+elapsed);
				writer.println();
			}
			writer.close();
			System.out.println("done");
			
		}
	

}

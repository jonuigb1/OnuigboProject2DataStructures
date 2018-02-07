package edu.westga.cs3151.project2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TestSort {
	

	public static void main(String[] args) {
		
		int max = 10000;
		Integer[] array = new Integer[max];
	 
		for(int i=0;i<max;i++) {
			array[i] = i;
		}
	
		PrintWriter writer = null;

		try {
			writer = new PrintWriter(new File("data.csv"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Sort.shuffle(array);

		long start,end,elapsed;
	for(int j = 0; j <20 ; j++) {
			
		
		for(int i=0 ; i<100000 ; i+= 1000) {
			start = System.currentTimeMillis();
		    Sort.insertionSort(array);
			end = System.currentTimeMillis();
			elapsed = end - start;
			writer.write(i+","+elapsed);

			Sort.shuffle(array);
		
			start = System.currentTimeMillis();
			Sort.bubbleSort(array);
			end = System.currentTimeMillis();
			elapsed = end -start;
			writer.write(","+i+","+ elapsed);
			
			Sort.shuffle(array);
	
			start = System.currentTimeMillis();
			Sort.selectionSort(array);
			end = System.currentTimeMillis();
			elapsed = end -start;
			writer.write(","+i+","+ elapsed);
			
			Sort.shuffle(array);
		
			start = System.currentTimeMillis();
			Sort.mergeSort(array);
			end = System.currentTimeMillis();
			elapsed = end -start;
			writer.write(","+i+","+ elapsed);
			
			Sort.shuffle(array);
		
			start = System.currentTimeMillis();
			Sort.quickSort(array);
			end = System.currentTimeMillis();
			elapsed = end -start;
			writer.write(","+ i +","+ elapsed);
			writer.println();
			
			Sort.shuffle(array);
		}
			
		
	
	}
	writer.close();
	System.out.println("done");
	
	
	}
	
}

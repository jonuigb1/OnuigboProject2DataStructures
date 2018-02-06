package edu.westga.cs3151.project2;

import java.io.File;
import java.io.PrintWriter;

public class TestSort {
	

	public static void main(String[] args) {
		
		int max = 10000;
		Integer[] array = new Integer[max];
	 
		//for(int j = 0 ; j< 20; j++) {
			
		
		for(int i=0;i<max;i++) {
			array[i] = i;
		}
		
		for(int i=0;i<max;i+=100) {
			System.out.println(+array[i]+" ");
		}
		System.out.println();
		Sort.shuffle(array);
		for(int i=0;i<max;i++) {
			System.out.print(","+array[i]+" ");
		}
		System.out.println();
		Sort.insertionSort(array);
		for(int i=0;i<max;i++) {
			System.out.print(","+array[i]+" ");
		}
		System.out.println();
		Sort.shuffle(array);
		for(int i=0;i<max;i++) {
			System.out.print(","+array[i]+" ");
		}
		System.out.println();
		Sort.bubbleSort(array);
		for(int i=0;i<max;i++) {
			System.out.print(","+array[i]+" ");
		}
		System.out.println();
		Sort.shuffle(array);
		for(int i=0;i<max;i++) {
			System.out.print(","+array[i]+" ");
		}
		System.out.println();
		Sort.selectionSort(array);
		for(int i=0;i<max;i++) {
			System.out.print(","+array[i]+" ");
		}
		System.out.println();
		Sort.shuffle(array);
		for(int i=0;i<max;i++) {
			System.out.print(","+array[i]+" ");
		}
		System.out.println();
		Sort.mergeSort(array);
		for(int i=0;i<max;i++) {
			System.out.print(","+array[i]+" ");
		}
		Sort.shuffle(array);
		for(int i=0;i<max;i++) {
			System.out.print(","+array[i]+" ");
		}
		System.out.println();
		Sort.quickSort(array);
		for(int i=0;i<max;i++) {
			System.out.print(","+array[i]+" ");
		}
	
	
	

		
		//long start = System.currentTimeMillis();
		
		//Sort.insertionSort(array);
		
		//long end = System.currentTimeMillis();
		
		//long elapsed = end - start;
		
			
			PrintWriter writer = null;
			try {
				writer = new PrintWriter(new File("data.csv"));
			}catch(Exception err) {};
			
			long start,end,elapsed;
			for(int i=0 ; i<10000 ; i+= 100) {
				start = System.currentTimeMillis();
			    Sort.insertionSort(array);
				end = System.currentTimeMillis();
				elapsed = end - start;
				writer.write(i+","+elapsed);
				writer.println();
			}
			
			for(int i = 0; i<10000 ; i+=100) {
				start = System.currentTimeMillis();
				Sort.bubbleSort(array);
				end = System.currentTimeMillis();
				elapsed = end -start;
				writer.write(","+","+i+","+ elapsed);
				writer.println();
			}
			
			for(int i = 0; i<10000 ; i+=100) {
				start = System.currentTimeMillis();
				Sort.selectionSort(array);
				end = System.currentTimeMillis();
				elapsed = end -start;
				writer.write(","+","+","+","+i+","+ elapsed);
				writer.println();
			}
			
			for(int i = 0; i<10000 ; i+=100) {
				start = System.currentTimeMillis();
				Sort.mergeSort(array);
				end = System.currentTimeMillis();
				elapsed = end -start;
				writer.write(","+","+","+","+","+","+i+","+ elapsed);
				writer.println();
			}
			
			for(int i = 0; i<10000 ; i+=100) {
				start = System.currentTimeMillis();
				Sort.quickSort(array);
				end = System.currentTimeMillis();
				elapsed = end -start;
				writer.write(","+","+","+","+","+","+","+","+ i +","+ elapsed);
				writer.println();
			}
			
			writer.close();
			System.out.println("done");
			
		}
	//}
	    
}

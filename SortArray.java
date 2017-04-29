package com.hs_ma.tpe.thuerauf_barsalou.blatt_2;

import java.util.Arrays;
import java.util.Scanner;
	// Sorter class as wanted in the exercise
public class SortArray {
	@SuppressWarnings("rawtypes")			// mandatory if comparable is used.
	public static void main(String[] args) {
		System.out.println("Bitte wählen Sie ihr Sortierverfahren aus: \n1: BubbleSort\n2: InsertionSort");
		Scanner UI = new Scanner(System.in);		// Console menu to choose the Sorting algorithm
		int Sortierverfahren = UI.nextInt();		
		Comparable[] toCompare = new Comparable[100];	//random Array to be sorted
		for(int i=0; i<toCompare.length;i++){
			toCompare[i] = (int)(Math.random()*i); 
		}
		sortArray(toCompare, Sortierverfahren);	// Method to choose the Algorithm with the array should be sorted
		UI.close();
	}

	@SuppressWarnings("rawtypes")
	public static void sortArray(Comparable[] toSort, int Sortierverfahren){	// Method that chooses the correct algorithm and prints the unsorted and sorted array 
		System.out.println(Arrays.toString(toSort));			
		if(Sortierverfahren==1){
			System.out.println(Arrays.toString(bubbleSortComparable(toSort)));
		}else{System.out.println(Arrays.toString(insertionSortComparable(toSort)));
		
		}
	}
	@SuppressWarnings({ "rawtypes", "unchecked" })			// BubbleSort with comparable objects instead of integers
	public static Comparable[] bubbleSortComparable(Comparable[] toSort){
			for(int i=1; i<toSort.length;i++){
				for(int j=0; j<toSort.length-i;j++){		// for loops to set the bubbles
					if(toSort[j].compareTo(toSort[j+1])>0){	// compareTo to check which value is larger
						Comparable h = toSort[j];			// marker swap block
						toSort[j]=toSort[j+1];
						toSort[j+1]=h;
					}
				}
			}
			return toSort;
		}
	@SuppressWarnings({"rawtypes", "unchecked"})		// InsertionSort with comparable objects instead of integers.
	public static Comparable[] insertionSortComparable(Comparable[] toSort){
		for (int i = 1; i < toSort.length; i++) {
			int j = i;
			Comparable m = toSort[i]; // Marker-field
			while (j > 0 && toSort[j - 1].compareTo(m)>0) {
				// move all bigger values to the back
				toSort[j] = toSort[j - 1];
				j--;
			}
			// appoint m to a free field
			toSort[j] = m;
		}
		return toSort;
		}
}

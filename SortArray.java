package com.hs_ma.tpe.thuerauf_barsalou.blatt_2;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		System.out.println("Bitte wählen Sie ihr Sortierverfahren aus: \n1: BubbleSort\n2: insertionSort");
		Scanner UI = new Scanner(System.in);
		int Sortierverfahren = UI.nextInt();
		Comparable[] toSort = null;
		System.out.println("Bitte geben Sie das zu sortierensde Array ein. + beendet die Eingabe");
		Scanner array = new Scanner(System.in);
		while(!array.next().equals("+")){
			if(toSort==null){
				toSort = new Comparable[1];
				toSort[0] = array.next();
			}
			toSort = insert(toSort, (Comparable)array.next());
		}
		sortArray(toSort, Sortierverfahren);
		UI.close();
		array.close();
	}
	
	@SuppressWarnings("rawtypes")
	public static void sortArray(Comparable[] toSort, int Sortierverfahren){
		System.out.println(Arrays.toString(toSort));
		if(Sortierverfahren==1){
			System.out.println(Arrays.toString(bubleSortComparable(toSort)));
		}System.out.println(Arrays.toString(insertionSortComparable(toSort)));
	}
	@SuppressWarnings("rawtypes")
	private static Comparable[] insert(Comparable[] inserted, Comparable toInsert){
		int h= inserted.length;
		Comparable[] help = new Comparable[h];
		for(int i=0; i<h;i++){
			help[i]=inserted[i];
		}
		inserted = new Comparable[h+1];
		for(int i=0; i<h; i++){
			inserted[i]=help[i];
		}
		inserted[h+1]=toInsert;
		return inserted;
	}
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static Comparable[] bubleSortComparable(Comparable[] toSort){
			for(int i=1; i<toSort.length;i++){
				for(int j=0; j<toSort.length-i;j++){
					if(toSort[j].compareTo(toSort[j+1])>0){
						Comparable h = toSort[j];
						toSort[j]=toSort[j+1];
						toSort[j+1]=h;
					}
				}
			}
			return toSort;
		}
	@SuppressWarnings({"rawtypes", "unchecked"})
	public static Comparable[] insertionSortComparable(Comparable[] toSort){
		for (int i = 1; i < toSort.length; i++) {
			int j = i;
			Comparable m = toSort[i]; // Marker-Feld
			while (j > 0 && toSort[j - 1].compareTo(m)>0) {
				// Verschiebe alle größeren Elemente nach hinten
				toSort[j] = toSort[j - 1];
				j--;
			}
			// Setze m auf das freie Feld
			toSort[j] = m;
		}
		return toSort;
		}
}

package com.hs_ma.tpe.thuerauf_barsalou.blatt_2;

import java.util.Arrays;

public class Comparable_Tut {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		
		Comparable[] toSort = new Comparable[6];
		toSort[0]="1";
		toSort[2]="2";
		toSort[1]="3";
		toSort[3]="6";
		toSort[4]="5";
		toSort[5]="4";
		
		System.out.println(Arrays.toString(bubleSortComparable(toSort)));
		System.out.println(Arrays.toString(insertionSortComparable(toSort)));
	
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

package com.hs_ma.tpe.thuerauf_barsalou.blatt_2;

public class InsertoinSort {
	protected int[] insertionSort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			int j = i;
			int m = array[i]; // Marker-Feld
			while (j > 0 && array[j - 1] > m) {
				// Verschiebe alle größeren Elemente nach hinten
				array[j] = array[j - 1];
				j--;
			}
			// Setze m auf das freie Feld
			array[j] = m;
		}
		return array;
	}
}

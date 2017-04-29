package com.hs_ma.tpe.thuerauf_barsalou.blatt_2;

public class InsertoinSort {
	// Insertoinsort as portraied in ADS
	protected int[] insertionSort(int[] array) {
		for (int i = 1; i < array.length; i++) {	
			int j = i;
			int m = array[i]; // Marker field
			while (j > 0 && array[j - 1] > m) {
				// push all values bigger than m to the right
				array[j] = array[j - 1];
				j--;
			}
			// appoint m to a free field.
			array[j] = m;
		}
		return array;
	}
}

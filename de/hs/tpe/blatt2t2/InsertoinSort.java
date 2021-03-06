package de.hs.tpe.blatt2t2;

public class InsertoinSort {
	// Insertoinsort as portraied in ADS
	protected int[] insertionSort(int[] array) {
		for (int i = 1; i < array.length; i++) {	
			int j = i;
			int m = array[i]; //current index
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

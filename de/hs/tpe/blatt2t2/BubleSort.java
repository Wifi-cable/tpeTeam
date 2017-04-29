package de.hs.tpe.blatt2t2;


public class BubleSort {
	// integer Bublesort
	
	protected int[] bubleSort(int[] toSort){ 
		for(int i=1;i<toSort.length;i++){	//for loop to go through the array
			for(int j=0;j<toSort.length-i; j++){	//for loop to mark the length of each bubble correlating with the first loop
				if(toSort[j]>toSort[j+1]){ 		// check if the element in the current point is bigger than in the next one
					int h = toSort[j];			// pointer swap 
					toSort[j]=toSort[j+1];
					toSort[j+1]=h;
				}
			}
		}
		return toSort;		// return the sorted array.
	}
}

package com.hs_ma.tpe.thuerauf_barsalou.blatt_2;

public class BubleSort {
	
	
	protected int[] bubleSort(int[] toSort){ 
		for(int i=1;i<toSort.length;i++){
			for(int j=0;j<toSort.length-i; j++){
				if(toSort[j]>toSort[j+1]){
					int h = toSort[j];
					toSort[j]=toSort[j+1];
					toSort[j+1]=h;
				}
			}
		}
		return toSort;
	}
}

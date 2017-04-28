package com.hs_ma.tpe.thuerauf_barsalou.blatt_2;

import java.util.Arrays;

public class test {
	
	public static void main(String[] args) {
//		String Klartext = "Schnittstellen";
//		CrypterReverse Rev = new CrypterReverse();
//		CrypterCaesar Cae = new CrypterCaesar();
//		Cae.quickInit(5);
//		// 1st Step:
//			String first = Rev.encrypt(Klartext);
//		// 2nd Step:
//			String second = Cae.encrypt(first);
//		// 3rd Step:
//			String third = Rev.encrypt(second);
//		// print:
//			System.out.println(third);
		
		int[] toSort = {1,4,2,6,7,17,25,3,-5};
		InsertoinSort IS = new InsertoinSort();
		System.out.println(Arrays.toString(IS.insertionSort(toSort)));
		BubleSort BS = new BubleSort();
		System.out.println(Arrays.toString(BS.bubleSort(toSort)));
		
	}
}

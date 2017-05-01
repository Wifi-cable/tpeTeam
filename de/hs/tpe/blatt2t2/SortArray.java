package de.hs.tpe.blatt2t2;

import java.util.Arrays;
import java.util.Scanner;
	// Sorter class as wanted in the exercise
public class SortArray {
	
//	@SuppressWarnings("rawtypes")			// mandatory if comparable is used.
	public static void main(String[] args) {
		Crypter reverse=new CrypterReverse();
		String hi="Hallo Welt!";
		String ih=reverse.encrypt(hi);
		System.out.println(reverse.encrypt(hi));
		System.out.println(reverse.decrypt(ih));
		
		Crypter caeser=new CrypterCaesar(5);
		String blink="blink blink!";
		String knilb=caeser.encrypt(blink);
		System.out.println(caeser.encrypt(blink));
		System.out.println(caeser.decrypt(knilb));

		String botschaft="XHMSNYYXYJQQJS";
		System.out.println("Gehime Botschaft: " + botschaft + " -> " + reverse.decrypt(caeser.decrypt(reverse.decrypt(botschaft))));
		Crypter brutus= new CrypterCaesar();
		System.out.println(brutus.encrypt("abc"));
		
		
		System.out.println("Bitte wählen Sie ihr Sortierverfahren aus: \n1: BubbleSort\n2: InsertionSort");
		Scanner UI = new Scanner(System.in);		// Console menu to choose the Sorting algorithm
		int Sortierverfahren = UI.nextInt();
		
		//Comparable<MyInt> toCompare = new MyInt(2);	//random Array to be sorted
		Comparable<MyInt> toComp[]=new Comparable [5];
		toComp[0] = new MyInt(2); 
		toComp[1] = new MyInt(0); 
		toComp[2] = new MyInt(5); 
		toComp[3] = new MyInt(1); 
		toComp[4] = new MyInt(10); 
		
		Comparable[] myStringArray= new Comparable[8];
		
		myStringArray[0]=new MyString("zebra ");
		myStringArray[1]= new MyString("cat ");
		myStringArray[2]= new MyString("monkey ");
		myStringArray[3]= new MyString("hamster ");
		myStringArray[4]= new MyString("bird ");
		myStringArray[5]= new MyString("parrot ");
		myStringArray[6]= new MyString("anthilope "); 
		myStringArray[7]= new MyString("eisbear");
		
		
		
		//= new MyInt(2);	//random Array to be sorted
		
		sortArray(toComp, Sortierverfahren);	// Method to choose the Algorithm with the array should be sorted
		sortArray(myStringArray, Sortierverfahren);
		UI.close();
	}

	//@SuppressWarnings("rawtypes")
	public static void sortArray(Comparable[] toSort, int Sortierverfahren){	// Method that chooses the correct algorithm and prints the unsorted and sorted array 
		System.out.println("prior to sorting");
		System.out.println(Arrays.toString(toSort));			
		if(Sortierverfahren==1){
			System.out.println(" sorted with bubblesort ");
			System.out.println(Arrays.toString(bubbleSortComparable(toSort)));
		
		}else{
			System.out.println("after sorting with Insertion sort");
			System.out.println(Arrays.toString(insertionSortComparable(toSort)));
		
		}
	}
	//@SuppressWarnings({ "rawtypes", "unchecked" })			// BubbleSort with comparable objects instead of integers
	public static Comparable<Object>[] bubbleSortComparable(Comparable<Object>[] toSort){
			for(int i=1; i<toSort.length;i++){
				for(int j=0; j<toSort.length-i;j++){		// for loops to set the bubbles
					if(toSort[j].compareTo(toSort[j+1])>0){	// compareTo to check which value is larger
						Comparable<Object> h = toSort[j];			// marker swap block
						toSort[j]=toSort[j+1];
						toSort[j+1]=h;
					}
				}
			}
			return toSort;
		}
	//@SuppressWarnings({"rawtypes", "unchecked"})		// InsertionSort with comparable objects instead of integers.
	public static Comparable<Object>[] insertionSortComparable(Comparable<Object>[] toSort){
		for (int i = 1; i < toSort.length; i++) {
			int j = i;
			Comparable<Object> m = toSort[i]; 
			while (j > 0 && toSort[j - 1].compareTo(m)>0) {
				
				toSort[j] = toSort[j - 1];
				j--;
			}
			
			toSort[j] = m;
		}
		return toSort;
		}

}

package de.hs.tpe.team15.ex1tree;

import gdi.MakeItSimple;

public class Btree {
	int m;// the order
	int maximum;
	public BtreeNode root;
	public Btree(int m) {
		this.m =m;
		this.maximum = (m*2)+1;

		// size comes from the main.
		root= new BtreeNode(m);
	}

	
	void insert(int value){// wrapper method for BtreeNode insert.
		root.insert(value);
	}
	boolean insert(String filename){// wrapper method for BtreeNode insert.
			String dates="";//places file into an array,
			if (MakeItSimple.isFilePresent(filename) == true) {
				Object file = MakeItSimple.openInputFile(filename);

				while (MakeItSimple.isEndOfInputFile(file) == false) {

					dates +=MakeItSimple.readLine(file) + " ";

				}

				MakeItSimple.closeInputFile(file);
				convert(dates);
				return true;
			}else{
				return false;

			}
	}

		void convert(String date) {	// untested by me
			String[] toConvert = date.split(" ");
			int val;
			Integer[] data = new Integer[toConvert.length];
			for (int i = 0; i < data.length; i++) {
				val = Integer.parseInt(toConvert[i]);
				root.insert(val);
				System.out.println("got "+ val +"");
			}
		}

	
	boolean contains(Integer e){
		return root.contains(e);
	}

	int size(){
		return root.size();
	}
	
	// Wrapper methode for Btreenodes height
	int height(){
	int level=root.height(0);
		return level+1;
	}

	public Integer getMax(){
		return root.getMax();
	}
	
	public Integer getMin(){
		
		return root.getMin();
	}

	public boolean isEmpty(){
		return root.ISempty();
	}

	
	// addAll(Btree otherTree);
	
	void printInorder(){
		root.printInorder();
	}
	
	protected void printLevelorder(){	// is level order :)
		String spacer= "";// for graphical representation place root node in center
		int spaceCount=40;
		for (int i=0; i<=this.height(); i++){
				spacer= "";
				for (int k= 0; k<spaceCount; k++){
					spacer=spacer+" ";
				}
				spaceCount = spaceCount - (spaceCount/2);	//next level reduce spaces by half
				System.out.print(spacer);
		    System.out.print("Level- " + i + ": ");
			root.print(i);
			System.out.println();
		}
		System.out.println("---------------------------------------------------------------------------------------------");
		System.out.println("");
	}
	

	public void printPostorder(){
		root.printPostorder(m);
	}

	void printPreorder(){
		root.printPreorder();
	}
	//Btree clone(oneTree);

	
	
	
	
	
	
	
	
	
	
	public void intfromString(String numbers){
		root.intFromString(numbers);
	}

	public BtreeNode insertSeach(int key){
//		BtreeNode theChild=new BtreeNode(m);
//		theChild= root.insertSearch(key);
//		return theChild;	// winds up being null.
		return root.insertSearch(key);	// result is the same
	}


}





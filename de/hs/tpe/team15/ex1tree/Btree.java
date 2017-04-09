package de.hs.tpe.team15.ex1tree;

	public interface Btree{

				BtreeNode root=null;
			
		//		int maximum;//the actual lenght of both arrays

			

				public  boolean insert(Integer elementToInsert);
				//public  Integer[]read(String Filename);
				public boolean insert(String filename);
				public boolean contains(Integer element);
				public int size();
				int height();
				public Integer getMax();
				public Integer getMin(); 
				public boolean ISempty();
				// addAll(Btree otherTree);
				void printInorder();
				void printLevelorder();
				void printPostorder();
				void printPreorder();
			//Btree clone(oneTree);
				
					
					
					
				
		

					//public Integer[] convert(String date); 

			
					
				
				


		
}

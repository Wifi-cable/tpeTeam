package de.hs.tpe.team15.ex1tree;

import gdi.MakeItSimple;

//import hs.tpe.baltt1.BtreeNode;

public class BtreeNode implements Btree{

			int max;
			Integer val[];// array of values
			BtreeNode[]children;//pointers zeiger to lower nodes.
			int maximum;//the actual lenght of both arrays

			BtreeNode parent=null;// the parent node of the current node.

			BtreeNode(int max){	// constuctor
				this.max=max;
				this.val=new Integer[(max*2)+1];
				this.maximum=(max*2)+1;
				this.children= new  BtreeNode[maximum+1]; // +1 to save the right (higher) pointer of overflow
					}
			/*@pram the int/Integer value to be inserted in the tree
			*/
			public  boolean insert(Integer elementToInsert){
				boolean canInsert= true;
				int last=lastIndex();// find end
				//place search here. use returned value as node to insert.

				if(ISempty()){	//empty tree== insert at first (val[0])
					val[0]=elementToInsert;
				}
				else if (insertSearch(elementToInsert)==null){// is duplicate
					canInsert=false;
					System.out.println("insert("+ elementToInsert +"): Sorry, I will NOT insert any duplicates!");
				}
				else{ BtreeNode node= insertSearch(elementToInsert);
					node.TheRealInsert(elementToInsert, null, null);
				}
				updateParentPointer();
				return canInsert;// dummy value
			}
			void TheRealInsert(Integer element, BtreeNode lowerNr, BtreeNode higherNr){
				System.out.println("TheRealInsert("+element+")");
				if(ISempty()){	//empty tree== insert at first (val[0])
					val[0]=element;
					children[0]=lowerNr;
					children[1]=higherNr;
				}else if(isBiggest(element)){
					//System.out.println("TheRealInsert("+element+"): Simply add as last element at index" + (lastIndex()+1));
					int x = lastIndex();
					val[x+1]=element;
					children[x+1] = lowerNr;
					children[x+2] = higherNr;
					//nodePrint();
					//System.out.println("after is Biggest");

				}
				else{//not biggest
					int insertpos = shiftValues(element);
					children[insertpos] = lowerNr;
					children[insertpos+1] = higherNr;
				}
				//System.out.println("TheRealInsert("+element+"): lastindex= "+lastIndex() +", maximum="+maximum);
				if(lastIndex()==(maximum-1)){//insert one higher
					BtreeNode theParent=getParent();

					if (theParent!=null){//than it is not the root. but does that matter?
						System.out.println("I'am not the root node ;-(  (theParent!=null))");
//						theParent.TheRealInsert(val[maximum-1]);//try insert one higher
//						val[maximum-1]=null;// set to null.
						bustRoot();
						System.out.print("value that was inserted was "+element+ " in node ");
						nodePrint();
						System.out.println("");
					}
					else{
						// Works!
						System.out.println("I'am root! Yeah! (theParent==null))");
						bustRoot();// no need to free the last element if the root grows.
					}

//					if (higherNr != null){
//						// Node is bust, search in children....
//						System.out.println("After bust of value "+element+", I have:");
//						System.out.print("lowerNr = ");
//						lowerNr.nodePrint();
//						System.out.println("");
//						System.out.print("higerNr = ");
//						higherNr.nodePrint();
//						System.out.println("");
//					}
				}
				else{


//					}
				}
				System.out.print("TheRealInsert done with parent = ");
				if (parent != null){
					parent.nodePrint();
					System.out.println();
				}else{
					System.out.println(" null");
				}
			}

			/* shift array content pack one space, to make room for new value to be inserted
			 *@pram  n= value to be inserted
			 *swapPos index were to inserted new number.*/
			int shiftValues(int n){
				//System.out.println("shiftValues("+ n +"): Begin" );
				int current=lastIndex(),
					swapPos=0;//array position to insert into.  zero is a dummy value to make compiler happy.
					//nodePrint();
					//System.out.println("(before)");
					while((current>=0)){	//
					//nodePrint();
					//System.out.println("shiftValues("+ n +"): current=" + current  );
						int end=current+1;
					if (n<val[current]){
						swapPos=current;
						val[end]=val[current];	//out of bounds.... need more rubber balls!
						children[end+1]=children[current+1];
						children[end]=children[current];
					}
					current--;
				}
					val[swapPos]=n;
					children[swapPos]=null;
					//nodePrint();
					//System.out.println("(after)");
					return swapPos;
				}

			public boolean ISempty(){//is node empty? helper function
				boolean nodeFill;
				if (val[0]==null){// if first is empty, rest is empty.
					nodeFill=true;
				}
				else {
					nodeFill=false;
				}
				//System.out.println("isEmpty() =  "+nodeFill);	// debug option
				return nodeFill;
			}
			//@pram value to be inserted
			public boolean isBiggest(Integer in){//helper function to check if the "in" the biggest in the array?
				boolean biggest=false;
				 int last=lastIndex();
				   if (val[last]< in){
					   biggest=true;

				   }
				return biggest;
			}
			//method to check the fill degree or a node via checking the fill of the values array
			int lastIndex(){
				int index=maximum-1;

				while((index>=0)&&(val[index]==null)){
					index--;
				}
				if (index<0){
					index = 0;
				}
				return index;
//				int last=0,i=0;
//				while (i<val.length){
//					if (val[last]!=null){
//						//last++;
//						last=i;
//					}
//					i++;
//					}
		//
//				return last;
			}
			// helper function to debugg,  and to have all values of a single node printed
			void nodePrint(){
				//System.out.print("NODEPRINT");

				System.out.print("[");
				for(int i=0; i<=lastIndex(); i++){
					System.out.print(val[i]+" ");
				}
				System.out.print("] ");
			}
			public void print(int level){
				if (level==0){

					this.nodePrint();
					}

				else{
					//print(level -1);
					int c=0;
					while ((c <= maximum) && (children[c]!= null)){
						children[c].print(level-1);
						c++;
					}
				}
			}

				boolean isDuplicate(int element){// checks if the element(int value) exists already in one  node
					boolean duplicate=false;
					for (int i=0; i<lastIndex();i++){
						if (val[i]==element){	// nullpointer
							duplicate=true;
						}
					}
				return duplicate;
			}

				boolean isLeaf(){
					boolean leaf= true;
					int pointerCounter=0;
					for(int i=0;i< maximum;i++){
						if (children[i]!=null){
							pointerCounter++;
						}
						}

					if (pointerCounter>0){
						leaf=false;
					}
					return leaf;
				}
				
				public int height() {
					// TODO Auto-generated method stub
					return height(0);
				}

		//@pram int level you want to start from, so zero to start at the top.
				public int height(int level){
					int levelAdd=level;

					if (isLeaf()==false){
						int i;
						for ( i=0;i<maximum;i++){
							if(children [i]!=null){
								levelAdd=this.children[i].height(level+1);
							}
		//:				levelAdd=this.children[pointer].height(level+1);
						}
						//levelAdd=this.children[pointer].height(level+1);
					}
//					else{
//						levelAdd=1;
//					}
					return levelAdd;	// counts from zero, to get hight  levelAdd+1;
				}

		//returns an exakt coppy of a node with all pointers (if anny)
				protected BtreeNode clone(int m){	// tested works
					m=this.max;
					BtreeNode newer=new BtreeNode(m);

					for (int i=0;i<val.length;i++){
						newer.val[i]=this.val[i];
					}
					for (int j=0;j<children.length;j++){
						newer.children[j]=this.children[j];
					}
					return newer;
					}
				 void intFromString(String inputString){	// tested works as long as last char is semicolon
					//String inputString="7;4;6;666;12;1;8;9;2;11;3;4;12;15;5;13;";
					int i=0,
						e=0;
					while(i<inputString.length()){
						char c=	inputString.charAt(i);
						if(c!=';'){
							int ce=(int)c;
							ce=ce-48;
							 e=((int)e*10)+ce;

							 i++;
						}
						else {
							insert(e);
							//System.out.println(e+" ");
							e=0;
							i++;
							}
						}
					}//end of intFromString
				protected int printPostorder(int index){// call on root.
						// if i call on nodeprint again it will resett index to zero. no good for recursion
					//BtreeNode theParent=this.getParent();	// the parent of root is null.
					if (index>=maximum){
						// end the recursion //d e b f g c a
						this.nodePrint();
						return maximum; // dummy value. no clue what else to return for a functin that would be void if not for recursion
					}
					else{
						BtreeNode theParent=this.getParent();
						if(isLeaf() && (theParent != null)){

							for(int i=0; i<maximum; i++){
								if(theParent.children[i]!=null){
								theParent.children[i].nodePrint();
								}
							}
							theParent.nodePrint();
						}
						else{
							if(children[index]!=null){
							children[index].printPostorder(index);
							}
						}
						return index+=1;
					}
					
				}
				
				public boolean contains(Integer element){
					
					boolean content;
					if (insertSearch(element)!=null){
						content=false;
					}
					else{
						content=true;
					}

					return content;
					}//
				
				
				
				private void bustRoot(){
					System.out.println("bustRoot() begin");
					//BtreeNode newRoot= new BtreeNode(max);
					BtreeNode topNode= this.clone(max);	// the new parent
					BtreeNode smallerValues= this.clone(max);
					BtreeNode biggerValues=new BtreeNode(max);
					Integer	  saveParentVal;
					int counter=maximum-1;
					saveParentVal=this.val[max];

					if(getParent()==null){	//in root :)	//
						System.out.println("bustRoot() in root");

						for(int i=0;i<maximum;i++){	// delete all values but center one
							val[i]=null;
							children[i]=null;
						}
						children[maximum]=null;
						val[0]=saveParentVal;

						children[1]=biggerValues;
						children[0]=smallerValues;
						//biggerValues.patentSetter(this);
						//smallerValues.patentSetter(this);	// but does the tree still find the new top node?
					}
					else{// insert parent
						System.out.println("bustRoot() not in root");
						//biggerValues.patentSetter(parent);	// parent relationship
						//smallerValues.patentSetter(parent);
//						if (parent.lastIndex() == (maximum-2)){
//							biggerValues.patentSetter(this);	// parent relationship
//							smallerValues.patentSetter(this);
//						}
						parent.TheRealInsert(saveParentVal, smallerValues, biggerValues);//insert value one higer
//						while((counter>0)&&(parent.val[counter]!=saveParentVal)){// find the first array index in the parent that does not contain children
//							counter--;
//						}

						System.out.print("parent after TheRealInsert is ");
						parent.nodePrint();
						System.out.println();


//						for (int i=(maximum-2);i>counter;i--){
//							parent.children[i+1] = parent.children[i];//out of bounds-1
//						}

//						while((counter>=0)&&(parent.children[counter]==null)){// find the first array index in the parent that does not contain children
//							counter--;
//						}
//						System.out.println("bustRoot() counter=" + counter);
//						parent.children[counter]=smallerValues;	//set the pointers
//						parent.children[counter+1]=biggerValues;
					}// end of else

					 	int index=0;
						for(int i=max+1;i<val.length;i++){// get the old bigger values in the new array at the front.
							//System.out.println("Insert biggerValues["+ i +"]");
//							biggerValues.TheRealInsert(topNode.val[i],null,null);// what about the pointers
//							biggerValues.children[index]=topNode.children[i];

								biggerValues.TheRealInsert(topNode.val[i],topNode.children[i],topNode.children[i+1]);// what about the pointers
								index++;
							}//



						for(int i=(maximum-1);i>=max;i--){	//empty the children of duplicate values and pointers
							//System.out.println("Scrub smallerValues["+ i +"]");
							smallerValues.val[i]=null;
							smallerValues.children[i+1]=null; // children is m+1, so index must be bigger
						}


					System.out.println("bustRoot() end");

				}
			
				public  Integer[]read(String Filename){	// untested by me
					String dates="";//places file into an array,
					if (MakeItSimple.isFilePresent(Filename) == true) {
						Object file = MakeItSimple.openInputFile(Filename);
		
						while (MakeItSimple.isEndOfInputFile(file) == false) {
		
							dates +=MakeItSimple.readLine(file) + " ";
		
						}
		
						MakeItSimple.closeInputFile(file);
						return convert(dates);
					}else{
						Integer[] fail = new Integer[1];
						fail[0]=0;
						return fail;

					}
			}

				public  Integer[] convert(String date) {	// untested by me
					String[] toConvert = date.split(" ");
					Integer[] data = new Integer[toConvert.length];
					for (int i = 0; i < data.length; i++) {
						data[i] = Integer.parseInt(toConvert[i]);
					}
					// System.out.println(Arrays.toString(data));
					return data;
				}
				/*sets a pointer from the child to the parent, so that the tree can be traversed from leafs to root
				or bottom to top too.
				@pram parent node, or this
				*/
				public void patentSetter(BtreeNode theParent){
					this.parent=theParent;
				}
				public BtreeNode getParent(){
					return this.parent;
				}

				/* seaches the tree and returns the key should be inserted into. not placed into the insert structure yet*/
			protected BtreeNode insertSearch(int key){
				int e=0;
				BtreeNode placeForKey=null;
				if (!isDuplicate(key)){
					while ((val[e]!=null)&&(val[e]<key)&&(e<=maximum)){
						e++;
					}
					if(isLeaf()){
					placeForKey=this;
						}
					else{
					//children[e].insertSearch(key);
					placeForKey=children[e].insertSearch(key);
					}
				}
					return placeForKey;
				}
				
			
				public int size() {		//returns the Size of the Tree. 
					int size = 0;		//will be incrementet for each element contained within the tree.
					for (int i = 0; i < val.length; i++) {
						if (val[i] != null) {
							size++;		//incremented for each element in the current node.
						}
					}
					for (int i = 0; i < children.length; i++) {
						if (children[i] != null) {
							size += children[i].size();	//the size of the childrenNodes is added to the original size recoursively.
						}
					}
					return size;
				}

				public Integer getMin() {			//marches to the out most left element of the tree. Since the tree is sortet, the smallest element should be there.
					if (this.children[0] == null) {
						return val[0];				//if the currently checked node is the smallest one, the minimum value must be the one in the first field of this node. 
					} else {
						return children[0].getMin();	//else it must be in one of the nodes further down.
					}
				}

				public Integer getMax() {	
					// see above but change smallest for largest and left to right.
				//	if (this.children[maximum ] == null) {
						int counter=maximum;
						while ((counter>0)&&(children[counter]==null)){
							counter--;
						}
						if (!isLeaf()){
							
							return children[counter].getMax();
						}
						else{
							return val[lastIndex()];
						}
					//}
					
					
					//else {}
				}
						private void updateParentPointer(){
				
							for(int i=0; i<children.length; i++){
								if (children[i] != null){
									if (children[i].parent != this){
										System.out.print("Child "+i+": Fixed parent node ");
										children[i].nodePrint();
										System.out.print("-> set to ");
										this.nodePrint();
										System.out.println();
									}
									children[i].patentSetter(this);
									children[i].updateParentPointer();
								}
							}
						}
						public boolean insert(String filename) {
							// TODO Auto-generated method stub
							System.out.println("Not implemented yet...");
							return false;
						}
						public void printLevelorder() {
							// TODO Auto-generated method stub
							print(0);
						}
						public void printPostorder() {
							// TODO Auto-generated method stub
							printPostorder(0);
							
						}
						public void printInorder() {
							// TODO Auto-generated method stub
							System.out.println("Not implemented yet...");
							
						}
						public void printPreorder() {
							// TODO Auto-generated method stub
							System.out.println("Not implemented yet...");
						}
				
			

		} 
		  




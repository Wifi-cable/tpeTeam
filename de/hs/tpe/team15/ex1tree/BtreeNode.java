package de.hs.tpe.team15.ex1tree;

import gdi.MakeItSimple;

public class BtreeNode{

			int max;
			Integer val[];// array of values
			BtreeNode[]children;//pointers zeiger to lower nodes.
			int maximum;//the actual lenght of both arrays

			BtreeNode parent=null;// the parent node of the current node.

			BtreeNode(int max){	
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
				
				if(ISempty()){	//empty tree== insert at first (val[0])
					val[0]=elementToInsert;
				}
				else if (insertSearch(elementToInsert)==null){// is duplicate, can not insert
					canInsert=false;
					System.out.println("insert("+ elementToInsert +"): Sorry, I will NOT insert any duplicates!");
				}
				else{ BtreeNode node= insertSearch(elementToInsert);
					node.TheRealInsert(elementToInsert, null, null);
				}
				updateParentPointer();
				return canInsert;
			}
			//private helper method of insert, to incorperate burst nodes
		private	void TheRealInsert(Integer element, BtreeNode lowerNr, BtreeNode higherNr){
				System.out.println("TheRealInsert("+element+")");
				if(ISempty()){	//empty tree== insert at first (val[0])
					val[0]=element;
					children[0]=lowerNr;
					children[1]=higherNr;
				}else if(isBiggest(element)){
					int x = lastIndex();
					val[x+1]=element;
					children[x+1] = lowerNr;
					children[x+2] = higherNr;
			

				}
				else{//not biggest
					int insertpos = shiftValues(element);
					children[insertpos] = lowerNr;
					children[insertpos+1] = higherNr;
				}
			
				if(lastIndex()==(maximum-1)){//insert one higher
					BtreeNode theParent=getParent();

					if (theParent!=null){//it is not the root. 
						//System.out.println("I'am not the root node ;-(  (theParent!=null))");
						bustRoot();
//						System.out.print("value that was inserted was "+element+ " in node ");
//						nodePrint();
//						System.out.println("");
					}
					else{
						
						//System.out.println("I'am root! Yeah! (theParent==null))");
						bustRoot();
					}


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
			
				int current=lastIndex(),
					swapPos=0;//array position to insert into.  zero is a dummy value to make compiler happy.
				
					while((current>=0)){	//
					//nodePrint();
					//System.out.println("shiftValues("+ n +"): current=" + current  );
						int end=current+1;
					if (n<val[current]){
						swapPos=current;
						val[end]=val[current];
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

			public boolean ISempty(){
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

			}
			
			void nodePrint(){
	

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
						if (val[i]==element){	
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
		
						}
						
					}
				
					return levelAdd;	// counts from zero, to get hight  levelAdd+1;
				}

		//returns an exakt coppy of a node with all pointers (if anny)
				protected BtreeNode clone(int m){
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
							
							e=0;
							i++;
							}
						}
					}//end of intFromString
				protected int printPostorder(int index){// call on root.
					
					if (index>=maximum){
						
						this.nodePrint();
						return maximum;
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
					System.out.println("contains("+ element +"...");
					boolean content;
					if((getParent()==null)&&(isLeaf())){
						content=isDuplicate(element);
						
					}
					else{
					
					if (insertSearch(element)!=null){
						content=false;
						System.out.println("false");
					}
					else{
						content=true;
						System.out.println("true");
					}
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
			
					}
					else{// insert parent
						//System.out.println("bustRoot() not in root");
									parent.TheRealInsert(saveParentVal, smallerValues, biggerValues);//insert value one higer

						System.out.print("parent after TheRealInsert is ");
						parent.nodePrint();
						System.out.println();



					}// end of else

					 	int index=0;
						for(int i=max+1;i<val.length;i++){// get the old bigger values in the new array at the front.
							
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
				
					
					
					
				}
						private void updateParentPointer(){
				
							for(int i=0; i<children.length; i++){
								if (children[i] != null){
//									if (children[i].parent != this){
//										//System.out.print("Child "+i+": Fixed parent node ");
//										children[i].nodePrint();
//										System.out.print("-> set to ");
//										this.nodePrint();
//										System.out.println();
//									}
									children[i].patentSetter(this);
									children[i].updateParentPointer();
								}
							}
						}
						public void printLevelorder() {
							
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
									this.print(i);
									System.out.println();
								}
								System.out.println("---------------------------------------------------------------------------------------------");
								System.out.println("");
						//	print(1);
						}
						public void printPostorder() {
						
							printPostorder(0);
							
						}
						public void printInorder() {
							
							System.out.println("Not implemented yet...");
							
						}
						public void printPreorder() {
						
							System.out.println("Not implemented yet...");
						}
				

		} 
		  
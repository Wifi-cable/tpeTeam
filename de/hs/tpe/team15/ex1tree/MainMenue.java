package de.hs.tpe.team15.ex1tree;
import gdi.MakeItSimple.*;
import java.util.Scanner;
public class MainMenue {

//	public MainMenue() {
	static Btree tree;
			
			public static void main(String[] args) {
				/*the solution to the interface dilemma. next time build an interface first, than let eclipse complain
				 * and create an implementation. 
				 * in the main build this contstruct to house other objects.*/
			//	Btree name= new BtreeNode(2);// würde funzen wenn Btree ein interface wäre				tree = init();
				
				do{
				}while(execute()!=0);
			}
			private static int Menue(){
				System.out.println("----------M   E   N    U----------");
				System.out.println("Please choose further options: ");
				System.out.println("Option 1: Insert single values");
				System.out.println("Option 2: Insert values from file");
				System.out.println("Option 3: Search for value");
				System.out.println("Option 4: size");
				System.out.println("Option 5: hight");
				System.out.println("Option 6: Find the biggest Value");
				System.out.println("Option 7: Find the smalest Value");
				System.out.println("Option 8: is the tree empty");
				System.out.println("Option 9: Print the tree");
				System.out.println("Option 10 clone");
				System.out.println("Option 0: Exit");
				Scanner Ui = new Scanner(System.in); 
				System.out.print("Please enter your chosen Option: ");
				int ret = Ui.nextInt();
				System.out.println();
				return ret;
			}
			
			private static Btree init(){
				Scanner UI = new Scanner(System.in);
				System.out.print("Please enter the order of the tree: ");
				int order = UI.nextInt();
				Btree treeRoot = new Btree(order);
				return treeRoot;
			}
			
			private static int execute(){
				int i= Menue();
				switch(i){
				case 1: System.out.print("Please enter value to insert: ");
						Scanner val = new Scanner(System.in);
						tree.insert(val.nextInt());
						System.out.println();
						return 1;
						
				case 2: System.out.print("Please enter filepath: ");
						Scanner datapath = new Scanner(System.in);
						String filename = datapath.next();
						System.out.println();
						if(tree.insert(filename)==false){
							System.out.println("Errorr 404 file not found!");
						}
						return 2;
				case 3: System.out.print("Please enter a vlaue: ");
					Scanner searchint = new Scanner(System.in);
					if (tree.contains(searchint.nextInt())){
						System.out.println("Found Value!");
					}
					else{
						System.out.println("Sorry, not found :-(");
					}
					return 3;
				case 4: System.out.println("Size is: "+tree.size());
					return 4;
				case 5: System.out.println("The tree is "+ (tree.height() + 1) +" high.");
					return 5;
				case 6: System.out.println("The Biggest Value is: "+tree.getMax());
					return 6;
				case 7: System.out.println("The Smalest Value is: "+tree.getMin());
					return 7;
				case 8: 
				if (tree.isEmpty()){
					System.out.println("Sorry, the tree is empty");
				}
				else{
					System.out.println("You have a (not empty) tree");
				}
				return 8;
					
				case 9:
					System.out.println("---------Submenu---------");
					System.out.println("Option 1: print in Preorder");
					System.out.println("Option 2: print in Inorder");
					System.out.println("Option 3: print in Postorder");
					System.out.println("Option 4: print in Levelorder");
					Scanner Input = new Scanner(System.in);
					int input = Input.nextInt();
					
					switch(input){
					case 1: tree.printPreorder();
							break;
					case 2: tree.printInorder();
							break;
					case 3: tree.printPostorder();
							break;
					case 4: tree.printLevelorder();
							break;
					default: System.out.println("Please enter a valid option!");
					}
					return 9;
				
				case 10: 
					Btree neo ;
					neo = tree.clone(tree.root);
					neo.printLevelorder();
						
				return 10;
				
				case 0: System.out.println("Thank You and good bye");
					return 0;
				default: System.out.println("please enter a valid option!");
					return -1;
				}
			}
		
	}

// /home/wifi-cable/Desktop/eclipseWorkspace/TPE/src/de/hs/tpe/team15/ex1tree

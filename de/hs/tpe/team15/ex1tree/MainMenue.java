package de.hs.tpe.team15.ex1tree;
import gdi.MakeItSimple.*;
import java.util.Scanner;
public class MainMenue {

//	public MainMenue() {
	static Btree tree;
			
			public static void main(String[] args) {
				tree = init();
				do{
				}while(execute()!=0);
			}
			private static int Menue(){
				System.out.println("----------M   E   N    U----------");
				System.out.println("Please choose further options: ");
				System.out.println("Option 1: Insert single values");
				System.out.println("Option 2: Insert values from file");
				System.out.println("Option 3: Print the tree");
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
				BtreeNode treeRoot = new BtreeNode(order);
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
				case 3:
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
					return 3;
				
				
				
				case 0: System.out.println("Thank You and good bye");
					return 0;
				default: System.out.println("please enter a valid option!");
					return -1;
				}
			}
		
	}



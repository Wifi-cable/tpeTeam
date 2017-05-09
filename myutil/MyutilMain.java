package myutil;

import java.util.Stack;

public class MyutilMain {

	public static void main(String[] args) {
		// this main method exists just to test and debugg funcitons
		
		// use String and Integer to put in the data structure. no extra nodes are created. .
		StackInterface stack=new StackList(3);
		try {
			stack.push("!!");
			stack.push(" welt");
			stack.push("Hallo ");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		stack.PrintStack();
	}

}

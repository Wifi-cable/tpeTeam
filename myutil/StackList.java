/**
 * 
 */
package myutil;

/**
 * @author wifi-cable
 *
 */
class StackList implements StackInterface {
	int maximum;
	LinkedList stack=new LinkedList();
	Node top;
	Node head;
	
	StackList(){
		maximum=10;
	} 
	StackList (int max){
		this.maximum=max;
	}

	public void push(Object in)throws Exception{
		if(this.size()<maximum){
			stack.addLast(in);
		}
		else{
			throw new  Exception();
		}
		
		
	}

	public Object pop()throws Exception {
		Object ret;
		top=(Node) stack.getLast();
		if (stack.size()>1){
			ret=top.content;
		}
		else{
			ret=null;
			throw new Exception();
			
		}
		return ret;
	}

	public int size() {
		int counter=stack.size();
//		Node current=(Node) stack.getFirst();
//		while( current.getNext()!=null){
//			counter++;
//		}
		return counter;
	}

	public void PrintStack() {// is backwards. 
		stack.backWardprint();
		
	}
	


}

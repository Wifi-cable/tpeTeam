/**
 * 
 */
package myutil;

/**
 * @author wifi-cable
 *
 */
public  class Node {
	Object content; // contains nodes of any kind
	Node next;

	// >>>>>>>>>> constructors <<<<<<<<<<<<<<<

	public Node(Object val, Node n) {
		this.content = val;
		this.next = n;
	}

	public Node() {
		this.content = null;
		this.next = null;
	}

	// --------------- public methods

	public void setNode(Object val) {
		this.content = val;
	}

	public String toString() {
		return " " + content;
	}

	public Object getNode() {
		return content;
	}

	public void setNext(Node n) {
		this.next = n;
	}

	public Node getNext() {
		return next;
	}


//	Node next;
//	Node previous;
//	Object content;
//	int size;
//	Node(Object next, Object content){
//		this.content=content;
//		this.next= (Node) next;
//	}
//	Node(){}
//	
//	Node getNext(){
//		return next;
//	}
//	public void setNext(Node n) {
//		next=n;
//		
	
	
//	
//	abstract Object contentGetter();
//	
//	abstract void setNext(Object next);
//	// add overrides to nodes
//
//	public void setContent(Object content) {
//		
//		
//	}
//
//	public void setPrevious(StringListNode previous) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	public void setNext(StringListNode next) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	public StringListNode getPrevious() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public StringListNode getNext() {
//		// TODO Auto-generated method stub
//		return null;
//	}
	
	// remove all fields in children
	
	// add all implemented methods in Node.

}

/**
 * 
 */
package myutil;

/**
 * @author wifi-cable
 *
 */
class StringListNode extends Node{
	//fields

	private String content;

	StringListNode next, previous;

	//private StringListNode next=(StringListNode) super.next;
	//private StringListNode previous=(StringListNode) super.previous;
	
	/**
	 * constructor with all possible parameters
	 * */
	StringListNode (String content, StringListNode next,StringListNode previous){
		super.content=content;
		super.next=next;
		super.previous=previous;
	}
	/**
	 * constructor to bild and link an empty node
	 * */
	StringListNode (StringListNode next,StringListNode previous){
		
		super.next=next;
		super.previous=previous;
	}
	//no parameter constructor for empty nodes that point to null, twice-
	StringListNode(){
	}
	
	/**
	 * @return content
	 */
	//@Override
	public String contentGetter(){
		return content;
	}
	/**
	 * @return next node 
	 */
	//@Override
	 public StringListNode getNext(){
		return next;
	} 

/**
 * @return previous node 
 */
	//@Override
	public StringListNode getPrevious(){
	return previous;
} 
	/**
	 * @Pram content
	 */

	//@Override
	public void setContent(Object content){
		super.content=(String) content;
	}
	/**
	 * @Pram next node 
	 * links the current node to the one intended to be next 
	 */
	//@Override
	 public void setNext( StringListNode next){
		super.next=next;
	} 

/**
 *  @Pram previous node 
	 * links the current node to the one behind it concatinates at the end
 */
	//@Override
	public void setPrevious (StringListNode previous){
		super.previous=previous;
}
//@Override
void setNext(Object next) {
	this.next=(StringListNode) next;
	
}

	
}

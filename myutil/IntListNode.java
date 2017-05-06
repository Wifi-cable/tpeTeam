package myutil;

public class IntListNode extends Node {

	//fields
		private int  value;
		private StringListNode next;
		private StringListNode previous;
		/**
		 * constructor with all possible parameters
		 * */
		IntListNode (int value, StringListNode next,StringListNode previous){
			super.content=value;
			super.next=next;
			super .previous=previous;
		}
		/**
		 * constructor to bild and link an empty node
		 * */
		IntListNode (StringListNode next,StringListNode previous){
			
			super.next=next;
			super.previous=previous;
		}
		//no parameter constructor for empty nodes that point to null, twice-
		IntListNode(){
		}
		
		/**
		 * @return content
		 */
	//	@Override 
		public Object contentGetter(){
			return value;
		}
		/**
		 * @return next node 
		 */
	//	@Override
		 public StringListNode getNext(){
			return next;
		} 

	/**
	 * @return previous node 
	 */
	//	@Override
		public StringListNode getPrevious(){
		return previous;
	} 
		/**
		 * @Pram content
		 */
		//@Override
		public void setContent(Object value){
			super.content=(Integer) value;
		}
		/**
		 * @Pram next node 
		 * links the current node to the one intended to be next 
		 */
		//@Override
		 public void setNext( Object next){
			super.next=(Node) next;
		} 

	/**
	 *  @Pram previous node 
		 * links the current node to the one behind it concatinates at the end
	 */
		//@Override
		public void setPrevious (StringListNode previous){
			super.previous=previous;
	}

	
	

}

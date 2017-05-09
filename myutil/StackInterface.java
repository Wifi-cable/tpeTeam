/**
 * 
 */
package myutil;

/**
 * @author wifi-cable
 *
 */
public interface StackInterface {
	//public StackInterface (){}
//no constructors in interfaces. must be in the classes that implement them
	public void  push(Object in) throws Exception;	// enters an element
	
	public Object pop() throws Exception;// removes element
	
	public int size();// to allow for overlfowns size must be checkable
	
	public void PrintStack();// to debug and to show functions stack is printable
	
}

/**
 * 
 */
package myutil;

/**
 * @author wifi-cable
 *
 */
public interface QueueInterface {
	//method stubs and no construcors because this is an interface. think of it as a content table. 
	public void  enter(Object in);// the equivalent of push, but to the front
	
	public void leave(Object out);// the equivalent of pop
	
	public int size();	//necarry to show overflows
	
	public void printQueue();// debugger method, to show the content of the ring Que
}

/**
 * 
 */
package myutil;

/**
 * @author wifi-cable
 *
 */
public class MyutilError extends Exception {

	/**
	 * 
	 */
	public MyutilError() {
		// TODO Auto-generated constructor stub
	}
	public MyutilError(Object in) {
		super.printStackTrace();
		System.err.println(in+ " - was one item to many.");
		
	}
	/**
	 * @param arg0
	 */
	public MyutilError(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param arg0
	 */
	public MyutilError(Throwable arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public MyutilError(String arg0, Throwable arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param arg0
	 * @param arg1
	 * @param arg2
	 * @param arg3
	 */
	public MyutilError(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
		// TODO Auto-generated constructor stub
	}

}

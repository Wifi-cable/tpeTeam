/**
 * 
 */
package myutil;

/**
 * @author wifi-cable
 *
 */
public class LinkedList {
	int size;
	Node head;
	Node last;
// >>>>>>>>>> constructors <<<<<<<<<<<<<<<

		public LinkedList() {
			head = null;
		}

		// --------------- public methods
		// --------------------------------------------

		public void addLast(Object val) {
			

			// inserts val at a new element at tail of the list
			// element is created inside method addFirst
			
			//needs to know if object == string or object
			
			if (head == null)
				head = new Node(val, null);
			else {
				Node l = head;
				while (l.getNext() != null)
					l = l.getNext();

				Node n = new Node(val, null); // create a new element
				l.setNext(n); // link the new element
			}
		}

		public boolean isEmpty() {
			return head == null;
		}

		public Object removeFirst() {

			// removes first element of the list

			Node p = head;

			if (!isEmpty()) {
				head = head.next;
				return p.content;
			} else
				return null;
		}

		public Object getFirst() {

			// gets first element of the list

			if (!isEmpty())
				return head.content;
			else
				return null;
		}
		
		public Object getLast(){
			Node current= head;
			while(current.getNext()!=null){
				current=current.getNext();
			}
			last=current;
			return last;
		}
		public void backWardprint(){
			Node current= (Node) this.getLast();
			int index=this.size();
			while ((index>0)&&current!=head){
				Node toPrint=current;
				
				for (int i=0 ; i<index ;i++){
					//System.out.println("from zero to " +index);
					if (toPrint.getNext()!=null){
					toPrint=toPrint.getNext();
					}
				//ok and where do i do something with current? such as decrese it? 	
				}
				System.out.print(toPrint.toString());
				index--;
			}
		// heas is "!!"
			System.out.print(head.toString()+" ");
		}

		public int printList() { // returns no. of printed elements

			Node nodePointer = head;
			int count = 0;
			int numberOfElements = this.size();
			
			if (numberOfElements == 0){ 
				System.out.println("number of elements==0");
				return 0;
				} // nothing to print

			while (count < numberOfElements - 1) { // print all elements but last
				System.out.print(nodePointer + ", ");
				nodePointer = nodePointer.getNext();
				count++;
			}
		
			System.out.println(nodePointer); // print last element

			return numberOfElements;

		}

		public int size() {

			Node p = head;
			int cnt = 0;

			while (p != null) {
				cnt++;
				p = p.getNext();
			}

			return cnt;

		}
	
	}

	// ////////////end of list class ///////////////////////////////////////



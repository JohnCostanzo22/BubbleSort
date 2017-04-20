public class LinkedList {

	private Node head;
	private Node tail;
	private Node placeHolder;
	private int size;
	
	public LinkedList() {
		head = null;
		tail = null;
		placeHolder = null;
		size = 0;
	}
	
	public Node getHead() {
		return head;
	}
	
	public Node getTail() {
		return tail;
	}
	
	public void add(Node newNode) {
		if(head == null) {
			newNode = head;
		}
		else if(tail == null) {
			tail = newNode;
			head.setNext(newNode);
		}
		else {
			tail.setNext(newNode);
			tail = newNode;
		}
			
	}
	
	public void print() {
		if(head == null) {
			System.out.println("The list is empty");
		}
		else {
			placeHolder = head;
			for(int i = 0; i < size-1; i++) {
				System.out.println(placeHolder.getValue());
				placeHolder = placeHolder.getNext();
			}
		}
	}
}
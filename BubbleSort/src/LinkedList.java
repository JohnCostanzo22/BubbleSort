public class LinkedList {

	private Node head;
	private Node tail;
	private Node placeHolder;
	private Node beforeNode;
	private Node afterPlaceHolder;
	
	public LinkedList() {
		head = null;
		tail = null;
		placeHolder = null;
	}
	
	public Node getHead() {
		return head;
	}
	
	public Node getTail() {
		return tail;
	}
	
	public void add(Node newNode) {
		if(newNode == null) {
			return;
		}
		if(head == null) {
			head = newNode;
		}
		else if(tail == null) {
			tail = newNode;
			tail.setPrevious(head);
			head.setNext(newNode);
		}
		else {
			tail.setNext(newNode);
			newNode.setPrevious(tail);
			tail = newNode;
		}
			
	}
	
	public boolean find(Node node) {
		//list is empty
		if(head == null) {
			return false;
		}
		else {
			placeHolder = head;
			while(placeHolder != null) {
				if(placeHolder == node) {
					return true;
				}
				placeHolder = placeHolder.getNext();
			}
		}
		return false;
	}
	
	//add swap class to deal with setNext and setPrevious and head/tail
	//swaps this node with the next
	public void swap(Node node) {
		if(node == null) {
			System.out.println("Cant swap a null Node");
			return;
		}
		else if(!this.find(node)) {
			System.out.println("Cant swap a Node that isn't in the list");
			return;
		}
		if(node == head) {
			placeHolder = head.getNext();
			head.setNext(placeHolder.getNext());
			head.setPrevious(placeHolder);
			placeHolder.setNext(head);
			placeHolder.setPrevious(null);
			head = placeHolder;
		}
		else if(node.getNext() == tail) {
			node.setNext(null);
			beforeNode = node.getPrevious();
			beforeNode.setNext(tail);
			tail.setPrevious(node.getPrevious());
			tail.setNext(node);
			node.setPrevious(tail);
			tail = node;
			
		}
		else {
			placeHolder = node.getNext();
			beforeNode = node.getPrevious();
			afterPlaceHolder = placeHolder.getNext();
			placeHolder.setPrevious(beforeNode);
			beforeNode.setNext(placeHolder);
			afterPlaceHolder.setPrevious(node);
			placeHolder.setNext(node);
			node.setPrevious(placeHolder);
			node.setNext(afterPlaceHolder);
			
		}
	}
	
	public void print() {
		int counter = 0;
		if(head == null) {
			System.out.println("The list is empty");
		}
		else {
			System.out.print("LinkedList: ");
			placeHolder = head;
			while (placeHolder != null) {
				System.out.print(placeHolder.getValue() + " ");
				placeHolder = placeHolder.getNext();
				//formatting
				counter++;
				if(counter % 10 == 0)
					System.out.println();
			}
			System.out.println();
		}
	}
}
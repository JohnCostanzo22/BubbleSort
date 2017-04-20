/*
 * Class that creates a doubly linked list of Nodes
 */
public class LinkedList {

	//properties
	private Node head;
	private Node tail;
	private Node placeHolder;
	private Node beforeNode;
	private Node afterPlaceHolder;
	
	/**
	 * Default Constructor
	 */
	public LinkedList() {
		head = null;
		tail = null;
		placeHolder = null;
	}
	/**
	 * Accessor method
	 * @return the head of the LinkedList
	 */
	public Node getHead() {
		return head;
	}
	
	/**
	 * Accessor method
	 * @return tail of the LinkedList
	 */
	public Node getTail() {
		return tail;
	}
	
	/**
	 * Adds a new Node to the List
	 * and maintains head & tail 
	 * @param newNode - added Node
	 */
	public void add(Node newNode) {
		if(newNode == null) {
			return;
		}
		//is the list empty?
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
	
	/**
	 * Checks if a node is in the LinkedList
	 * @param node being looked for
	 * @return true if the Node is found, otherwise false
	 */
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
	
	/**
	 * swaps the node with the next node and
	 * maintains head, tail, and previous/next 
	 * @param node - the node to flip with the next Node
	 */
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
	
	/**
	 * prints the LinkedList Node values
	 */
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
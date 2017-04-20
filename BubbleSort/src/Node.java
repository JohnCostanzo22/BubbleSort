public class Node {
	
	private int num;
	private Node next;
	private Node previous;
	
	public Node(int num) {
		this.num = num;
		this.next = null;
		this.previous = null;
	}
	
	public Node getNext() {
		return next;
	}

	public void setPrevious(Node node) {
		this.previous = node;
	}

	public Node getPrevious() {
		return previous;
	}

	public void setNext(Node node) {
		this.next = node;
	}

	public int getValue() {
		return num;
	}
}
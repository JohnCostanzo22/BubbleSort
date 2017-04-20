public class Main {

	public static void main(String args[]) {
		
		BubbleSort sort = new BubbleSort();
		LinkedList list = new LinkedList();
	 
		list.add(new Node(10));
		list.add(new Node(4));
		list.add(new Node(3));
		
		list.print();
		
		sort.BubbleSort(list);
		
		list.print();
	}
}

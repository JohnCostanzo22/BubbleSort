import java.util.Random;
/**
 * Test class for LinkedList and BubbleSort
 */
public class Main {

	public static void main(String args[]) {
		
		//test properties
		BubbleSort sort = new BubbleSort();
		LinkedList list = new LinkedList();
		LinkedList randomList = new LinkedList();
		Random random = new Random();
		int num;
		//trying to print an empty list
		list.print();
		//trying to sort an empty list
		sort.Sort(list);
	 
		list.add(new Node(10));
		list.add(new Node(4));
		list.add(new Node(8));
		list.add(new Node(3));
		
		list.print();
		
		list = sort.Sort(list);
		
		list.print();
		
		for(int i = 0; i < 100; i++) {
			//1 - 100
			num = random.nextInt(1000) + 1; 
			randomList.add(new Node(num));
		}
		
		randomList.print();
		sort.Sort(randomList);
		randomList.print();
		
	}
}

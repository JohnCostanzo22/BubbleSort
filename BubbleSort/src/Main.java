import java.util.Random;

public class Main {

	public static void main(String args[]) {
		
		BubbleSort sort = new BubbleSort();
		LinkedList list = new LinkedList();
		LinkedList randomList = new LinkedList();
		Random random = new Random();
		int num;
	 
		list.add(new Node(10));
		list.add(new Node(4));
		list.add(new Node(8));
		list.add(new Node(3));
		
		list.print();
		
		list = sort.Sort(list);
		
		list.print();
		
		for(int i = 0; i < 100; i++) {
			//1 - 1000
			num = random.nextInt(1000) + 1; 
			randomList.add(new Node(num));
		}
		
		randomList.print();
		sort.Sort(randomList);
		randomList.print();
		
	}
}

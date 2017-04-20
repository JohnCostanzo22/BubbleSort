/**
 * Class that contains a method to BubbleSort a 
 * LinkedList using methods in the LinkedList class.
 * It is in a seperate class just for easy access
 * in case I need to reuse the method
 *
 */
public class BubbleSort {

	//properties
	private boolean moved;
	private Node placeOne;
	private Node placeTwo;

	/**
	 * Bubbles sorts the LinkedList using swap method to 
	 * move Nodes around in the LinkedList
	 * @param list - LinkedList to be sorted
	 * @return the LinkedList
	 */
	public LinkedList Sort(LinkedList list) {
		moved = true;
		while(moved) {
			try {
				placeOne = list.getHead();
				placeTwo = placeOne.getNext();
			} catch (NullPointerException e) {
				System.out.println("The list is empty");
				break;
			}
			moved = false;
			while(placeTwo != null) {
				if(placeOne.getValue() > placeTwo.getValue()) {
					list.swap(placeOne);
					placeTwo = placeOne.getNext();
					moved = true;
				}
				else {
					placeOne = placeTwo;
					placeTwo = placeTwo.getNext();
				}
			}
		}
		return list;
	}
	//code graveyard
	
	/*public LinkedList Sort(LinkedList list) {
		placeOne = list.getHead();
		placeTwo = placeOne.getNext();
		moves = 0;
		while(placeTwo != null) {
			if(placeOne.getValue() > placeTwo.getValue()) {
				tempList.add(placeTwo);
				//tempList.add(placeOne);  //dont add placeOne yet before we compare it to the next one
				moves++;
				placeTwo = placeTwo.getNext();
				if(placeTwo.getNext() == null) {
					if(placeOne.getValue() > placeTwo.getValue()) {
						tempList.add(placeTwo);
						tempList.add(placeOne);
					}
					else {
						tempList.add(placeOne);
						tempList.add(placeTwo);
					}
					placeTwo = null;
				}
			}
			else {
				tempList.add(placeOne);
				placeOne = placeTwo;
				placeTwo = placeOne.getNext();
				//check for last sort
				if(placeTwo.getNext() == null) {
					if(placeOne.getValue() > placeTwo.getValue()) {
						tempList.add(placeTwo);
						tempList.add(placeOne);
					}
					else {
						tempList.add(placeOne);
						tempList.add(placeTwo);
					}
					placeTwo = null;
				}
			}
		}
		if(moves > 0) {
			Sort(tempList);
		}
		return tempList;
	}*/
	
	/*public LinkedList Sort(LinkedList list) {
		
		placeOne = list.getHead();
		placeTwo = placeOne.getNext();
		tempList = new LinkedList();
		moves = 1;
		
		while(placeOne != null) {
			moves = 0;
			if(placeOne.getValue() > placeTwo.getValue()) {
				tempList.add(placeTwo);
				moves++;
				placeTwo = placeTwo.getNext();
				//check if this is at the end of the list
				if(placeTwo.getNext() == null) {
					if(placeOne.getValue() > placeTwo.getValue()) {
						tempList.add(placeTwo);
						tempList.add(placeOne);
					}
					else {
						tempList.add(placeOne);
						tempList.add(placeTwo);
					}
					placeOne = null;
				}
			}
			else {
				tempList.add(placeOne);
				placeOne = placeTwo;
				placeTwo = placeOne.getNext();
				//check for last sort
				if(placeTwo.getNext() == null) {
					if(placeOne.getValue() > placeTwo.getValue()) {
						tempList.add(placeTwo);
						tempList.add(placeOne);
					}
					else {
						tempList.add(placeOne);
						tempList.add(placeTwo);
					}
					placeOne = null;
				}
			}
		}
		if(moves > 0) {
			Sort(tempList);
		}
		list = tempList;
		return list;
	}
	*/
}

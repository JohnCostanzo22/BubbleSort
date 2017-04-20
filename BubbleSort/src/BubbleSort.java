public class BubbleSort {

	private int moves;
	private Node placeOne;
	private Node placeTwo;
	private LinkedList tempList = new LinkedList();
	
	public LinkedList BubbleSort(LinkedList list) {
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
			BubbleSort(tempList);
		}
		return tempList;
	}
	
}

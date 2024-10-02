
public class UniqueList extends IntegerList{

	public UniqueList() {
		super();
	}
	
	public UniqueList(int capacity) {
		super(capacity);
	}
	
	public void add(int integer) {
		
		super.add(integer);
	}
	
	public void insert(int index, int integer) {
		if(super.indexOf(integer) != -1) {
			throw new IllegalArgumentException("The integer " + integer + " is already in the list.");
		}
		else {
			super.insert(index, integer);
		}
	}
}

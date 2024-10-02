
public class SortedList extends IntegerList{

	public SortedList() {
		super();
	}
	
	public SortedList(int capacity) {
		super(capacity);
	}
	
	public void add(int integer) {
		int i = 0;
		while(i < super.size() && super.get(i) < integer) {
			i++;
		}
		super.insert(i, integer);
	}
	
	public void insert(int index, int integer) {
		
			throw new UnsupportedOperationException();
	}
}

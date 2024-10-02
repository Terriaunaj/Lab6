
public class RangeList extends IntegerList{

	public RangeList() {
		super();
	}
	
	public RangeList(int lowerBound, int upperBound) {
		super();
		if(lowerBound > upperBound) {
			throw new IllegalArgumentException("The upper bound must be greater than or equal to the lower bound.");
		}
		int index = 0;
		for(int i = lowerBound; i <= upperBound; i++) {
			super.insert(index, i);
			index++;
		}
	}
	
	public void add(int lowerBound, int upperBound) {
		if(lowerBound > upperBound) {
			throw new IllegalArgumentException("The upper bound must be greater than or equal to the lower bound.");
		}
		int index;
		if(super.size() == 0) {
			index =0;
			for(int i = lowerBound; i <= upperBound; i++) {
					super.insert(index, i);
					index++;
			}
		}
		if(lowerBound < super.get(0)) {
			index = 0;
			int num = super.get(0);
			for(int i = lowerBound; i <= num; i++) {
				super.insert(index, i);
				index++;
			}
		}
		if(upperBound > super.size() - 1) {
			index = super.size();
			int num = super.get(super.size());
			for(int i = num; i <= upperBound; i++) {
				super.insert(index, i+1); 
				index++;
			}
		}
	}
	
	public void remove(int lowerBound, int upperBound) {
		if(lowerBound > upperBound) {
			throw new IllegalArgumentException("The upper bound must be greater than or equal to the lower bound.");
		}
		if(super.size() == 0) {
			throw new UnsupportedOperationException("Cannot remove range from an empty list.");
		}
		
		if(lowerBound < super.get(0) || upperBound > super.get(super.size() - 1)) {
			throw new IllegalArgumentException("Lower and/or upper bounds are out of the current list range.");

		}
			//throw new IllegalArgumentException("Cannot remove non-terminal ranges.");
		else {
			int i = 0;
			while(i < size()) {
				int num = super.get(i);
				if(num >= lowerBound && num <= upperBound) {
					super.remove(i);
				}
				else {
					i++;
				}
			}
		}
		
	}
	
	public void insert(int index, int integer) {
		throw new UnsupportedOperationException();
	}
	
	public void add(int integer) {
		throw new UnsupportedOperationException();
	}
}

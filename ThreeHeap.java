import java.util.List;

//ThreeHeap creates a trinary heap structure
public class ThreeHeap implements PriorityQueue {
	private double[] threeHeap;
	private int size;
	
	//Creates a new empty ThreeHeap structure
	public ThreeHeap() {
		this.threeHeap = new double[10];
		this.size = 0;
	}
	
	//Returns true or false based on if the structure is empty
	public boolean isEmpty() {
		return size() == 0;
	}
	
	//Returns the size of the heap
	public int size() {
		return this.size;
	}
	
	//Throws IllegalArgumentException if the heap is empty
	//Returns the smallest value in the heap
	public double findMin() {
		if(isEmpty()) {
			throw new IllegalStateException("Heap is empty");
		}
		
		return this.threeHeap[1];
	}
	
	//Given a double, inserts a new value into the heap
	public void insert(double x) {
		if(this.size == this.threeHeap.length - 2) {
			resize();
		}
		
		this.size++;
		int i = percolateUp(this.size, x);
		this.threeHeap[i] = x;
	}
	
	//Given a double and positioning, locates and returns the location of the appropriate
	//position of the value
	private int percolateUp(int placement, double value) {
		int i = (int) Math.round(placement / 3.0);
		
		while(placement > 1 && value < this.threeHeap[i]) {
			this.threeHeap[placement] = this.threeHeap[i];
			placement = i;
			i = (int) Math.round(placement / 3.0);
		}
		return placement;
	}
	
	//Throws IllegalStateException if heap is empty
	//Returns and removes from the heap the smallest value
	public double deleteMin() {
		if(isEmpty()) {
			throw new IllegalStateException("Heap is empty");
		}
		
		double min = this.threeHeap[1];
		int placement = percolateDown(1, this.threeHeap[this.size]);
		this.threeHeap[placement] = this.threeHeap[this.size];
		this.size--;
		return min;
	}
	
	//Given a double and positioning, locates and returns the location of the appropriate
	//position of the value
	private int percolateDown(int placement, double value) {
		while (3 * placement - 1 <= this.size) {
			int target;
			int left = 3 * placement - 1;
			int mid = 3 * placement;
			int right = 3 * placement + 1;
			
			if((mid > this.size && right > size) || (right > size && this.threeHeap[left] <= this.threeHeap[mid]) 
					|| this.threeHeap[left] == Math.min(this.threeHeap[left], Math.min(this.threeHeap[mid], this.threeHeap[right]))) {
				target = left;
			}else if((this.threeHeap[mid] <= this.threeHeap[left] && right > size) 
					|| this.threeHeap[mid] == Math.min(this.threeHeap[left], Math.min(this.threeHeap[mid], this.threeHeap[right]))) {
				target = mid;
			}else {
				target = right;
			}
			
			if(this.threeHeap[target] < value) {
				this.threeHeap[placement] = this.threeHeap[target];
				placement = target;
			}else {
				break;
			}
		}
		
		return placement;
	}
	
	//Builds a new heap from a provided list of values
	public void buildQueue(List<Double> list) {
		this.size = list.size();
		this.threeHeap = new double[list.size() * 2];
		
		for(int i = 1; i <= list.size(); i++) {
			this.threeHeap[i] = list.get(i - 1);
		}
		
		
		for(int i = (int) Math.round(this.size / 3.0); i > 0; i--) {
			double value = this.threeHeap[i];
			int placement = percolateDown(i, value);
			this.threeHeap[placement] = value;
		}
	}
	
	//Reduces the size of the heap to 0
	public void makeEmpty() {
		this.size = 0;
	}
	
	//Increases the size and overall available space of the heap
	private void resize() {
		double[] holder = this.threeHeap;
		this.threeHeap = new double[this.threeHeap.length * 2];
		
		for(int i = 0; i < holder.length; i++) {
			this.threeHeap[i] = holder[i];
		}
	}
	
	//Returns a string representation of the heap
	public String toString() {
		String s = "";
		
		for(int i = 1; i <= this.size; i++) {
			s += this.threeHeap[i] + " ";
		}
		
		return s.trim();
	}
}

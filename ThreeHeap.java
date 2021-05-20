import java.util.List;

public class ThreeHeap implements PriorityQueue {
	private double[] threeHeap;
	private int size;
	
	public ThreeHeap() {
		this.threeHeap = new double[10];
		this.size = 0;
	}
	
	public boolean isEmpty() {
		return size() == 0;
	}
	
	public int size() {
		return this.size;
	}
	
	public double findMin() {
		if(isEmpty()) {
			throw new IllegalStateException("Heap is empty");
		}
		
		return this.threeHeap[1];
	}
	
	public void insert(double x) {
		if(this.size == this.threeHeap.length - 2) {
			resize();
		}
		
		this.size++;
		int i = percolateUp(this.size, x);
		this.threeHeap[i] = x;
	}
	
	private int percolateUp(int placement, double value) {
		int i = (int) Math.round(placement / 3.0);
		
		while(placement > 1 && value < this.threeHeap[i]) {
			this.threeHeap[placement] = this.threeHeap[i];
			placement = i;
			i = (int) Math.round(placement / 3.0);
		}
		return placement;
	}
	
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
	
	public void makeEmpty() {
		this.size = 0;
	}
	
	private void resize() {
		double[] holder = this.threeHeap;
		this.threeHeap = new double[this.threeHeap.length * 2];
		
		for(int i = 0; i < holder.length; i++) {
			this.threeHeap[i] = holder[i];
		}
	}
	
	public String toString() {
		String s = "";
		
		for(int i = 1; i <= this.size; i++) {
			s += this.threeHeap[i] + " ";
		}
		
		return s.trim();
	}
}

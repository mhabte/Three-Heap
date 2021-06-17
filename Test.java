import java.util.*;

//Used for testing ThreeHeap.java methods
public class Test {
	public static void main(String[] args) {
		ThreeHeap test = new ThreeHeap();
		System.out.println("Expected size = 0. Actual size = " + test.size());
		System.out.println("Expected result = true. Actual result = " + test.isEmpty());
		
		System.out.println();
		
		test.insert(10.0);
		
		System.out.println("Expected size = 1, expected result = 10.0, expected result = false, expected output = 10.0");
		System.out.println("  Actual size = " + test.size() + ",   actual result = " + test.findMin() + ",   actual result = " + test.isEmpty() + ",   actual output = " + test);
		
		System.out.println();

		test.insert(3.0);
		
		System.out.println("Expected size = 2, expected result = 3.0, expected result = false, expected output = 3.0 10.0");
		System.out.println("  Actual size = " + test.size() + ",   actual result = " + test.findMin() + ",   actual result = " + test.isEmpty() + ",   actual output = " + test);
		
		System.out.println();

		test.insert(5.0);
		
		System.out.println("Expected size = 3, expected result = 3.0, expected result = false, expected output = 3.0 10.0 5.0");
		System.out.println("  Actual size = " + test.size() + ",   actual result = " + test.findMin() + ",   actual result = " + test.isEmpty() + ",   actual output = " + test);
		
		System.out.println();

		test.insert(16);
		
		System.out.println("Expected size = 4, expected result = 3.0, expected result = false, expected output = 3.0 10.0 5.0 16.0");
		System.out.println("  Actual size = " + test.size() + ",   actual result = " + test.findMin() + ",   actual result = " + test.isEmpty() + ",   actual output = " + test);
		
		System.out.println();

		test.insert(1);
		
		System.out.println("Expected size = 5, expected result = 1.0, expected result = false, expected output = 1.0 3.0 5.0 16.0 10.0");
		System.out.println("  Actual size = " + test.size() + ",   actual result = " + test.findMin() + ",   actual result = " + test.isEmpty() + ",   actual output = " + test);

		System.out.println();

		test.insert(2);
		
		System.out.println("Expected size = 6, expected result = 1.0, expected result = false, expected output = 1.0 2.0 5.0 16.0 10.0 3.0 ");
		System.out.println("  Actual size = " + test.size() + ",   actual result = " + test.findMin() + ",   actual result = " + test.isEmpty() + ",   actual output = " + test);
		
		System.out.println();

		test.insert(11);
		
		System.out.println("Expected size = 7, expected result = 1.0, expected result = false, expected output = 1.0 2.0 5.0 16.0 10.0 3.0 11.0");
		System.out.println("  Actual size = " + test.size() + ",   actual result = " + test.findMin() + ",   actual result = " + test.isEmpty() + ",   actual output = " + test);
		
		System.out.println();

		test.insert(9);
		
		System.out.println("Expected size = 8, expected result = 1.0, expected result = false, expected output = 1.0 2.0 5.0 16.0 10.0 3.0 11.0 9.0");
		System.out.println("  Actual size = " + test.size() + ",   actual result = " + test.findMin() + ",   actual result = " + test.isEmpty() + ",   actual output = " + test);
		
		System.out.println();

		test.insert(16);
		
		System.out.println("Expected size = 9, expected result = 1.0, expected result = false, expected output = 1.0 2.0 5.0 16.0 10.0 3.0 11.0 9.0 16.0");
		System.out.println("  Actual size = " + test.size() + ",   actual result = " + test.findMin() + ",   actual result = " + test.isEmpty() + ",   actual output = " + test);
		
		System.out.println();

		test.insert(12);
		
		System.out.println("Expected size = 10, expected result = 1.0, expected result = false, expected output = 1.0 2.0 5.0 16.0 10.0 3.0 11.0 9.0 16.0 12.0");
		System.out.println("  Actual size = " + test.size() + ",   actual result = " + test.findMin() + ",   actual result = " + test.isEmpty() + ",   actual output = " + test);
		
		
		test.makeEmpty();	
		
		
		test.insert(10);
				
		test.insert(3);
				
		test.insert(5);		
		
		test.insert(16);		
		
		test.insert(1);
		
		test.insert(2);
				
		test.insert(11);
				
		test.insert(9);		
		
		test.insert(16);
		
		test.insert(12);
		


		
		System.out.println();

		test.deleteMin();
		
		System.out.println("Expected size = 9, expected result = 2.0, expected result = false, expected output = 2.0 3.0 5.0 16.0 10.0 12.0 11.0 9.0 16.0");
		System.out.println("  Actual size = " + test.size() + ",   actual result = " + test.findMin() + ",   actual result = " + test.isEmpty() + ",   actual output = " + test);
		
		System.out.println();

		test.deleteMin();
		
		System.out.println("Expected size = 8, expected result = 3.0, expected result = false, expected output = 3.0 10.0 5.0 16.0 16.0 12.0 11.0 9.0");
		System.out.println("  Actual size = " + test.size() + ",   actual result = " + test.findMin() + ",   actual result = " + test.isEmpty() + ",   actual output = " + test);
		
		System.out.println();

		test.deleteMin();
		
		System.out.println("Expected size = 7, expected result = 5.0, expected result = false, expected output = 5.0 10.0 9.0 16.0 16.0 12.0 11.0");
		System.out.println("  Actual size = " + test.size() + ",   actual result = " + test.findMin() + ",   actual result = " + test.isEmpty() + ",   actual output = " + test);
		
		System.out.println();

		test.deleteMin();
		
		System.out.println("Expected size = 6, expected result = 9.0, expected result = false, expected output = 9.0 10.0 11.0 16.0 16.0 12.0");
		System.out.println("  Actual size = " + test.size() + ",   actual result = " + test.findMin() + ",   actual result = " + test.isEmpty() + ",   actual output = " + test);
		
		System.out.println();

		test.deleteMin();
		
		System.out.println("Expected size = 5, expected result = 10.0, expected result = false, expected output = 10.0 12.0 11.0 16.0 16.0");
		System.out.println("  Actual size = " + test.size() + ",   actual result = " + test.findMin() + ",   actual result = " + test.isEmpty() + ",   actual output = " + test);
		
		System.out.println();

		test.deleteMin();
		
		System.out.println("Expected size = 4, expected result = 11.0, expected result = false, expected output = 11.0 12.0 16.0 16.0");
		System.out.println("  Actual size = " + test.size() + ",   actual result = " + test.findMin() + ",   actual result = " + test.isEmpty() + ",   actual output = " + test);
		
		System.out.println();

		test.deleteMin();
		
		System.out.println("Expected size = 3, expected result = 12.0, expected result = false, expected output = 12.0 16.0 16.0");
		System.out.println("  Actual size = " + test.size() + ",   actual result = " + test.findMin() + ",   actual result = " + test.isEmpty() + ",   actual output = " + test);
		
		System.out.println();

		test.deleteMin();
		
		System.out.println("Expected size = 2, expected result = 16.0, expected result = false, expected output = 16.0 16.0");
		System.out.println("  Actual size = " + test.size() + ",   actual result = " + test.findMin() + ",   actual result = " + test.isEmpty() + ",  actual output = " + test);
		
		System.out.println();

		test.deleteMin();
		
		System.out.println("Expected size = 1, expected result = 16.0, expected result = false, expected output = 16.0");
		System.out.println("  Actual size = " + test.size() + ",   actual result = " + test.findMin() + ",   actual result = " + test.isEmpty() + ",   actual output = " + test);
		
		System.out.println();

		test.deleteMin();
		
		System.out.println("Expected size = 0,  expected result = true, expected output = ");
		System.out.println("  Actual size = " + test.size() + ",   actual result = " + test.isEmpty() + ",   actual output = " + test);
		
		List<Double> l= new ArrayList<>();
		l.add(10.0);
		l.add(3.0);
		l.add(5.0);
		l.add(16.0);
		l.add(1.0);
		l.add(2.0);
		l.add(11.0);
		l.add(9.0);
		l.add(16.0);
		l.add(12.0);
		l.add(57.0);
		
		test.buildQueue(l);
		
		System.out.println();

		System.out.println("Expected size = 11, expected result = 1.0, expected result = false, expected output = 1.0 2.0 5.0 16.0 3.0 10.0 11.0 9.0 16.0 12.0 57.0");
		System.out.println("  Actual size = " + test.size() + ",   actual result = " + test.findMin() + ",   actual result = " + test.isEmpty() + ",   actual output = " + test);
		
		System.out.println();

		test.deleteMin();
		
		System.out.println("Expected size = 10, expected result = 2.0, expected result = false, expected output = 2.0 3.0 5.0 16.0 57.0 10.0 11.0 9.0 16.0 12.0");
		System.out.println("  Actual size = " + test.size() + ",   actual result = " + test.findMin() + ",   actual result = " + test.isEmpty() + ",   actual output = " + test);

		test.makeEmpty();
		
		System.out.println();
		
		System.out.println("Threeheap also works with doubles that have values other than 0 after the decimal place (ex 3.5 6.8).");
		System.out.println("The numbers above were used to keep the results of the tests cleaner and easier to read.");

		System.out.println();
		
		System.out.println("Next line expected to throw error");
		test.deleteMin();
	}
}

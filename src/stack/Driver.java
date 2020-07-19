package stack;

public class Driver {

	public static void main(String[] args) {
		
		Stack stack = new Stack();		
		
		for (int i = 0; i < 1000; i++) {
			stack.push(i);
		}
		
		stack.print();
		System.out.println();
		System.out.println();
		System.out.println();
		
		for (int i = 0; i < 920; i++) {
			stack.pop();
		}
		
		stack.print();

	}

}

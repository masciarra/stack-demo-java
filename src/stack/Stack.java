package stack;

import java.util.Arrays;

public class Stack {

	private int size;
	private int length;
	private int[] stack;
	
	public Stack() {
		this.length = 10;
		this.size = 0;
		this.stack = new int[this.length];
	}
	
	/* Pushes element onto stack
	 * 
	 */
	public void push(int elem) {
		expandCapacity();
		this.stack[this.size] = elem;
		this.size++;
	}
	
	/* Removes element from stack and returns the value
	 * 
	 */
	public int pop() {
		int result = this.stack[this.size - 1];
		this.size--;
		reduceCapacity();
		return result;
	}
	
	/* Checks if array is full, doubles capacity if so.
	 * 
	 */
	private void expandCapacity() {
		if (this.size == this.length) {
			this.stack = Arrays.copyOf(this.stack, this.length * 2);
			this.length *= 2;
			
		}
	}
	
	/* Checks if array is 10 times greater than the size of queue,
	 * then reduces the size to 2x the size of the queue.
	 */
	
	private void reduceCapacity() {
		if (this.length > (this.size * 10)) {
			this.stack = Arrays.copyOf(this.stack, (this.size * 2));
			this.length = this.size * 2;	
		}
	}
	
	/* Prints the stack
	 * 
	 */
	public void print() {
		for (int i = 0; i < this.size; i++) {
			System.out.println(this.stack[i]);
		}
	}
	
	/* Debugging tool to print array that supports the stack
	 * 
	 */
	private void printArray() {
		for (int i = 0; i < this.stack.length; i++) {
			System.out.println(this.stack[i]);
		}
	}	
}

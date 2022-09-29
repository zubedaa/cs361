/**
 * 
 */
package mystack;

/**
 * @author Zubeda Newaz 
 *
 */

// Stack using generics

// Complete the provided code

public class MyStack<T> {

	private class MyNode<T1> {
		T1 val;
		MyNode<T1> next;

		MyNode(T1 v, MyNode<T1> n) {
			val = v;
			next = n;
		}
	}

	private MyNode<T> theStack = null;

	/**
	 * 
	 */
	public MyStack() {
		top=null;
		bottom=null;
		stackSize=0;
	}
	@SuppressWarnings("rawtypes")
	private MyNode top;
	private int stackSize;
	@SuppressWarnings("rawtypes")
	private MyNode bottom;
	
	public T pop() {
		// TODO To complete
		MyNode temp;
        if (stackSize == 0) {
        	bottom = top = null;
       	// this sets the second element as the new node
       	}else {
       	temp = top.next;
      	top = temp;	
       	stackSize--;
       	}
		return null;
	}

	public void push(T v) {
		// TODO To complete
    	// if list is empty
    	if (stackSize == 0) {
    		bottom = top = null;
    	// this sets the first element as the new node
    	}else {
    	top.next=(MyNode) v;
    	top=(MyNode) v;		
    	stackSize++;
    	}
    }
	

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO To complete
		// Create a stack of Integer
		MyStack<Integer> intStack = new MyStack<Integer>();
		// Push 1 and 2
		MyNode num1= new MyNode<Integer>;
		MyNode num2= new MyNode<Integer>;
		push(num1);
		push(num2);
		// Pop
		pop();
		// Push 5
		MyNode num5= new MyNode<Integer>;
		push(num5);
		// TODO To complete
		// Create a stack of Person
		MyStack<Person> humanStack = new MyStack<Person>();
		// Push a person p1 with your name
		Person p1= new Person("Zubeda", "Newaz");
		push(p1);
		// Push a person p2 with my name
		Person p2= new Person("Christelle", "Scharff");
		push(p2);
	}

}

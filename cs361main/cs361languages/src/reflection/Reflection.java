/**
 * 
 */
package reflection;

/**
 * @author Zubeda Newaz
 *
 */

// Reflection: https://docs.oracle.com/javase/tutorial/reflect/class/

// Demonstration of Reflection

// Given an object o, we want to know what class corresponds to o, the inheritance chain for o
// and the list of methods of the class

// Complete the code

import java.lang.reflect.Method;

import circle.ColoredCircle;

public class Reflection {

	/**
	 * Print the class corresponding to the object
	 * @param o the object
	 */
	public void correspondingClass(Object o) {
		if (o == null)
			throw new IllegalArgumentException("Object passesd is null");

		System.out.println("Inspecting class: " + o.getClass().getName());
	}

	/**
	 * Print the chain of super classes of the object 
	 * Format of the output:
	 * Inheritance chain:
	 * Cn inherits from Cn-1 inherits ... inherits from java.lang.Object
	 * @param o the object
	 */
	public void inheritanceChain(Object o) {
		if (o == null)
			throw new IllegalArgumentException("Object passesd is null");

		// TODO To complete
		// You need to use the EXACT format of the output
		// Hint: Use the method getSuperClass()
		Object chain = o.getClass().getSuperclass();
		System.out.println(o.getClass()+" inherits from"+chain);
		while(chain!=(chain.getClass().getSuperclass())) {
			System.out.println(" inherits from"+chain.getClass().getSuperclass());
			chain = chain.getClass().getSuperclass();
		}
		System.out.println();
	}
	
	/**
	 * Print the list of methods of the object
	 * @param o an object
	 */
	public void listMethods(Object o) {
		if (o == null)
			throw new IllegalArgumentException("Object passesd is null");

		Method[] m = o.getClass().getMethods();

		// List of methods
		// TODO To complete
		// Print each method on one line
		// Use this EXACT format
	
	for(Method method: m) {
		System.out.println(method+"\n");
	}
	
	}
	/**
	 * Constructor
	 */
	public Reflection() {
	}

	/**
	 * Demonstration
	 * @param args
	 */
	public static void main(String[] args) {

		Reflection r = new Reflection();		
		
		// Demonstration of the methods on an object of type String
		// TODO To complete
		String demo="Kitty Newaz"; //using Kitty Newaz as demo string because I love cats and that's my cat's name
		System.out.println("Methods of a String type object:\n");
		r.correspondingClass(demo+"\n");
		r.inheritanceChain(demo+"\n");
		r.listMethods(demo+"\n");
		// Demonstration of the methods on an object of type ColoredCircle
		// TODO To complete		
		ColoredCircle demo2= new ColoredCircle();
		System.out.println("Methods of a ColoredCircle type object:\n");
		r.correspondingClass(demo2+"\n");
		r.inheritanceChain(demo2+"\n");
		r.listMethods(demo2+"\n");
		
	}

}

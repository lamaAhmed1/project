/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab008;

/**
 *
 * @author lenovo
 */
public class StackArrayString {
    
private String[] stack; //stack String 
	private int maxSize; //index
	private int top; //index
	
	// Constructor
	public StackArrayString (int size) {
		maxSize = size;             // set array size
		stack = new String[maxSize];   // create array for stack
		top = -1;                   // set top to -1 (no items in stack yet) -> index 
	}
	
	
	//
	// boolean | isFull()
	//
	public boolean isFull () {
		return (top==maxSize-1);
	}
	
	
	//
	// boolean | isEmpty()
	//
	public boolean isEmpty() {
		return (top == -1);
	}
	
	
	//
	// int | pop()
	//
	public String pop() {
		return stack[top--];
	}
	
	
	//
	// int | peek()
	//
	public String peek() {
		return stack[top];
	}
	
	
	//
	// void | push(int)
	//
	public void push(String value) {
		stack[++top] = value;
	}
	
	
	//
	// boolean | search(int)
	//
	public boolean search(int value) {
		for(int i=0; i<=top; i++) {
			// if the value is found at stack[i], return true
			if (stack[i].equals(value) )
				return true;
		}
		// If we make it till here, the value was not found in the array.
		return false;
	}
	
	
	//
	// void | PrintStack()
	//
	public void PrintStack() {
		for(int i=0; i<=top; i++) {
			System.out.print(stack[i] + ", ");
		}
		// print a newline
		System.out.println();
	}

    public int getMaxSize() { //array size
        return maxSize;
    }

    public int getTop() {
        return top;
    }
        
        
        
}
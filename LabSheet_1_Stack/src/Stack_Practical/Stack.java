package Stack_Practical;

public class Stack {
	
	//to define the maxSize
	private int maxSize;
	
	private double[] stackArray;
	
	//the top of the array
	private int top;
	
	// Constructor
	public Stack(int maxSize) {
		this.maxSize = maxSize; //set the array size
		stackArray = new double[maxSize]; 
		top = -1; // no items
	}
	
	public void push(double x) {
		//check the Stack is empty
		if(top == maxSize - 1) {
			System.out.println("Stack is Full!");
		}else {
			stackArray[++top] = x;
		}
	}

}

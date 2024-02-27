package Stack_Practical;

public class Stack_char {
	
	//declaring the variables
	private int top;
	private char[] charArray;
	private int maxSize;

	// declaring the methods
	public Stack_char(int maxSize) {
		this.maxSize = maxSize;
		this.top = -1;
		this.charArray = new char[maxSize];
	}
	
	public void Push(char s) {
		if(top == maxSize - 1) {
			System.out.println("Stack is Full!");
		}else {
			charArray[++top] = s;
		}
	}
	
	public char Pop() {
		if(top == -1) {
			System.out.println("Stack id Empty!");
		}
		return charArray[top--];
	}
	
	public char Peek() {
		if(top == -1) {
			System.out.println("Stack is Empty!");
		}
		return charArray[top];
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public boolean isFull() {
		return top == maxSize - 1;
	}

}

package StackLab1;

public class Stack {
	
	// Declaring the variables
	private char[] stackArr;
	private int top;
	private int maxSize;

	// Declaring the methods
	public Stack(int s) {
		maxSize = s;
		stackArr = new char[maxSize];
		top = -1;
	}
	
	public void Push(char s) {
		if(top == maxSize - 1)
			System.out.println("Stack is full");
		else	
			stackArr[++top] = s;
	}
	
	public char Pop() {
		if(top == -1)
			return (char) -99; 
		else
			return stackArr[top--];
	}
	
	public char Peek() {
		if(top == -1)
			return (char) -99;
		else
			return stackArr[top];
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public boolean isFull() {
		return top == maxSize - 1;
	}
	
	public static boolean isValidExpression(String expression) {
		
		// checking the length
		Stack s = new Stack(expression.length());
		
		// checking the expression valid || not
		for(int i = 0; i < expression.length(); i++) {
			
			// getting the char At the i index
			char ch = expression.charAt(i);
			
			if(ch == '(') {
				s.Push(ch);
			}else if(ch == ')') {
				if(s.isEmpty()) 
					return false; // Closing parenthesis encountered without corresponding opening parenthesis 
				else
					s.Pop(); // Matching pair found, pop opening parenthesis
			}			
		}
		
		return s.isEmpty(); // If stack is empty at the end, expression is valid
	}
	
}

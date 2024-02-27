package StackLab1;

public class Main {

	public static void main(String[] args) {

		// create a object from Stack
		Stack s = new Stack(10);
		
		// push some characters
		s.Push('H');
		s.Push('S');
		s.Push('U');
		s.Push('P');
		
		// displaying the elements of the Stack
		System.out.println("Elements before Pop");
		System.out.println();
		
		// display the elements
		while (!s.isEmpty()) {
			System.out.print(s.Pop());			
		}
		
		System.out.println();
		
		// checking the expression is valid
		String expression1 = "3+((6*2)-3)";
		String expression2 = "5*6+(2-5";
		
		System.out.println(expression1 + " is " + (s.isValidExpression(expression1) ? "valid" : "not valid"));
		System.out.println(expression2 + " is " + (s.isValidExpression(expression2) ? "valid" : "not valid"));
		
	}

}

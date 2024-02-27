package Stack_Practical;

public class Main {

	public static void main(String[] args) {

		//define a Stack
		Stack_char s = new Stack_char(4);

		//insert Characters to the stack using push() method
		s.Push('P'); // when passing a char to a method we have to ''
		s.Push('u'); // if it is a String ""
		s.Push('s');
		s.Push('h');

		while(!s.isEmpty()) {
			s.Peek();
		}

		// Remove content
		while(!s.isEmpty()) {
			s.Pop();
		}

		System.out.println("Hello world");

	}

}

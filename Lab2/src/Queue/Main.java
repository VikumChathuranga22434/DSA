package Queue;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// create a Queue
		QueueX mainQueue = new QueueX(5);
		QueueX printerQueue = new QueueX(5);
		
		// allow user to input the 5 id's
		Scanner myScn = new Scanner(System.in);
		
		for(int i = 1; i <= 5; i++) {
			
			// getting the user inputs
			System.out.print("Enter transaction ID "+i+" : ");
			int id = myScn.nextInt();
			
			// insert the ids to the Queue
			printerQueue.insert(id);
			
		}
		
		// create new objects
		QueueX evenQueue = new QueueX(5);
		QueueX oddQueue = new QueueX(5);
		
		int tempId;
		
		while(!printerQueue.isEmpty()) {
			tempId = printerQueue.remove();
			
			if(tempId % 2 == 0) {
				System.out.println("ID "+tempId+" is sent to PC1");
				evenQueue.insert(tempId);
			}
			else {
				System.out.println("ID "+tempId+" is sent to PC2");
				oddQueue.insert(tempId);
			}
			
		}
		
		// printing PC 1 elements
		System.out.println("PC1");
		while(!evenQueue.isEmpty()) {
			System.out.println("\tTransaction " + evenQueue.remove());
		}
		
		// printing PC 2 elements
		System.out.println("PC2");
		while(!oddQueue.isEmpty()) {
			System.out.println("\tTransaction " + oddQueue.remove());
		}
		
	}

}

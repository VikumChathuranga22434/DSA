package Queue;

public class QueueX {

	// Declaring the properties
	private int[] queueArr;
	private int front;
	private int rear;
	private int maxSize;
	private int nItems;
	
	// declaring the methods
	public QueueX(int s) {
		this.maxSize = s;
		this.queueArr = new int[maxSize];
		this.front = 0;
		this.rear = -1;
		this.nItems = 0;
	}
	
	// insert method
	public void insert(int j) {
		if(nItems == maxSize)
			System.out.println("Queue is Full!!");
		else {
			queueArr[++rear] = j;
			nItems++;
		}
	}
	
	// remove method
	public int remove() {
		if(nItems == 0)
			return -99;
		else {
			int temp = queueArr[front++];
			if(front == maxSize)
				front = 0;
			nItems--;
			return temp;
		}
	}
	
	// peekFront method
	public int peekFront() {
		if(nItems == 0)
			return -99;
		else
			return queueArr[front];
	}
	
	// isEmpty method
	public boolean isEmpty() {
		return nItems == 0;
	}
	
	// isFull method
	public boolean isFull() {
		return nItems == maxSize;
	}
	
		
}

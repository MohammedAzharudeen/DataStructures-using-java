package QueueJava;
public class Runner {

	public static void main(String[] args) {
		Queue q = new Queue();
		System.out.println(q.isEmpty());
		q.enQueue(5);
		q.enQueue(2);
		q.enQueue(7);
		q.enQueue(3);
		
		q.deQueue();
		q.deQueue();
		
		q.enQueue(9);
		q.enQueue(1);
		System.out.println(q.isFull());
		System.out.println("Size : "+q.getSize());
		q.show();

	}

}




                    /*---------------------------------------------------------------------------------------------------------------------------------*/




public class Queue {
	int[] queue = new int[5];
	int size;
	int front;
	int rear;
	
	public void enQueue(int data) {
		
		if(!isFull()) {
			queue[rear] = data;
			rear = (rear + 1) % 5;
			size = size + 1;
		}else {
			System.out.println("Queue is full!");
		}
	}
	
	public int deQueue() {
		int data = queue[front];
		if(!isEmpty()) {
			front = (front + 1) % 5;
			size = size - 1;
		}else {
			System.out.println("Queue is empty!");
		}
		return data;
	}
	
	public int getSize() {
		return size;
	}
	
	public boolean isEmpty() {
		return getSize() == 0;
	}
	
	public boolean isFull() {
		return getSize() == 5;
	}
	
	public void show() {
		System.out.print("Elements : ");
		for(int i=0;i<size;i++) {
			System.out.print(queue[(front+i)%5]+" ");
		}
		System.out.println();
	}
}

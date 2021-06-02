package QueueJava;
public class Runner {

	public static void main(String[] args) {
		Queue q = new Queue();
		q.enQueue(5);
		q.enQueue(7);
		q.enQueue(9);
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
		queue[rear] = data;
		rear++;
		size++;
	}
	
	public void show() {
		System.out.print("Elements : ");
		for(int i=0;i<size;i++) {
			System.out.print(queue[front+i]+" ");
		}
	}
}

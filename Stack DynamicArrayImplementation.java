package DSstack;

public class RunnerDstack {

	public static void main(String[] args) {
		DStack nums = new DStack();
		//System.out.println("Empty : "+nums.isEmpty());
		nums.push(15);
		nums.show();
		nums.push(8);
		nums.show();
		nums.push(10);
		nums.show();
		nums.push(45);
		nums.show();
		nums.push(82);
		nums.show();
		
		nums.pop();
		nums.show();
		nums.pop();
		nums.show();
		nums.pop();
		nums.show();
	}

}



                  /*---------------------------------------------------------------------------------------------------------------------------------------*/



package DSstack;

public class DStack {
	
	int capacity = 2;
	int stack[] = new int[capacity];
	int top = 0;
	
	public void push(int data) {
		if(size()==capacity) {
			expand();
	}
		stack[top] = data;
		top++;
	}
	
	private void expand() {                                                        //to expand the size of the array
		int length = size();
		int newStack[] = new int[capacity*2];
		System.arraycopy(stack, 0, newStack, 0, length);                             //to copy the array elements to the new enlarged array
		stack = newStack;
		capacity *=2;
		
	}

	public int pop() {
		int data=0;
		if(isEmpty()) {
			System.out.println("Stack is empty,cannot pop");
		}else {
			top--;
			data = stack[top];
			stack[top] = 0;
			shrink();
		}
		return data;
	}
	
	private void shrink() {                                                          //to shrink the size of the array
		int length = size();
		if(length<=(capacity/2)/2) {
			capacity = capacity/2;
		}
		int newStack[] = new int[capacity];
		System.arraycopy(stack, 0, newStack, 0, length);
		stack = newStack;
		
		
	}

	public int peek() {
		int data;
		data = stack[top-1];
		return data;
	}
	
	public int size() {
		return top;
	}
	
	public boolean isEmpty() {
		return top<=0;
	}
	
	public void show() {
		for( int n : stack) {
			System.out.print(n + " ");
		}System.out.println();
	}
}

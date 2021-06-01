package DSstack;

public class Runner {

	public static void main(String[] args) {
		Stack nums = new Stack();
		System.out.println("Empty : "+nums.isEmpty());
		nums.push(15);
		nums.push(8);
		nums.show();
		nums.push(10);
		nums.show();
		System.out.println("\nPeek element is : " + nums.peek());
		System.out.println("\nPopped element is : " + nums.pop());
		System.out.println("\nSize is : "+nums.size());                      //size
		System.out.println("Popped element is : " + nums.pop());
		System.out.println("Empty : "+nums.isEmpty());                        //empty or not
		nums.show();
	}

}


                  /*--------------------------------------------------------------------------------------------------------------------------------------*/



public class Stack {

	int stack[] = new int[5];
	int top = 0;
	
	public void push(int data) {
		if(top == 5) {
			System.out.println("Stack is full!");
			return;
		}
		stack[top] = data;
		top++;
	}
	
	public int pop() {
		int data=0;
		if(isEmpty()) {
			System.out.println("Stack is empty,cannot pop");
		}else {
			top--;
			data = stack[top];
			stack[top] = 0;
		}
		return data;
	}
	
	public int peek() {
		int data;
		data = stack[top-1];
		return data;
	}
	
	public int size() {                                   //to check size.
		return top;
	}
	
	public boolean isEmpty() {                             //check whether the stack is empty by returning true or false
		return top<=0;
	}
	
	public void show() {
		for( int n : stack) {
			System.out.print(n + " ");
		}
		System.out.println();
	}
}

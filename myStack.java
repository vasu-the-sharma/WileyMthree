package july19;

public class myStack {
    static final int MAX = 100;
	int top;
	int a[] = new int[MAX];
	
	myStack(){
		top=-1;
	}
	
	boolean isEmpty(){
		return top==-1?true:false;
	}
	
	int size(){
		return top+1;
	}
	
	void push(int x) {
		if(top==MAX-1)return;
		
		a[++top]=x;
	}
	
	int pop() {
		if(top==-1)return -1;
		
		int temp=a[top--];
		return temp;
	}
	
	int peek() {
		if(top==-1)return -1;
		
		int temp=a[top];
		return temp;
	}
	
	public static void main(String[] args) {
		
		myStack st = new myStack();
		st.push(10);
		st.push(20);
		st.push(30);
		System.out.println("Size of the stack is " + st.size());
		System.out.println("Popped element is "  + st.pop());
		System.out.println("Popped element is " + st.pop());
		System.out.println("Top element is " + st.peek());
		System.out.println("Popped element is " + st.pop());
		System.out.println("Top element is " + st.peek());
	}

}

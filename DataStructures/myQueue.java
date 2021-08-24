package july19;

public class myQueue {

	private static int front, rear, capacity;
	private static int arr[];
	
	myQueue(int size){
		front=rear=0;
		capacity=size;
		arr = new int[size];
	}
	
	void enqueue(int x) {
		if(rear==capacity-1)return;
		
		arr[rear++]=x;
	}
	
	int dequeue() {
		if(front==rear)return -1;
		
		int temp=arr[0];
		
		for(int i=0; i<rear-1; i++) {
			arr[i]=arr[i+1];
		}
		rear--;
		return temp;
	}
	
	boolean isEmpty() {
		return front==rear?true:false;
	}
	
	int size() {
		return rear;
	}
	
	int getFront() {
		if(front==rear)return -1;
		
	return arr[front];	
	}
	
	void queueDisplay()
    {
        if (front == rear) {
            System.out.println("Queue is Empty");
            return;
        }
  
        System.out.println("My Queue Implementation is: ");
        for(int i = front; i < rear; i++) {
            System.out.println(arr[i]);
        }
        return;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myQueue q = new myQueue(10);
		
		System.out.println("Front of the queue is " + q.getFront());
		
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.queueDisplay();
		
		System.out.println("Size of the queue is " + q.size());

		System.out.println("Front of the queue is " + q.getFront());
		
		System.out.println("Popped element is " + q.dequeue());
		System.out.println("Popped element is " + q.dequeue());
		System.out.println("Popped element is " + q.dequeue());
		System.out.println("Popped element is " + q.dequeue());
		System.out.println("Popped element is " + q.dequeue());
		
		System.out.println("Size of the queue is " + q.size());

		System.out.println("Queue is empty? " + q.isEmpty());


	}

}

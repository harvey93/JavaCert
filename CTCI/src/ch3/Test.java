package ch3;



public class Test {
	
	
	
	public static void main(String[] args) throws StackEmptyException{
		StackQueue<Integer> queue = new StackQueue<>();
		queue.queue(10);
		queue.queue(20);
		queue.queue(30);
		queue.queue(40);
		queue.queue(50);
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		System.out.println(queue.toString());
	}
	
	
}

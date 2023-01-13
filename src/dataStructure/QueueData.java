package dataStructure;
import java.util.LinkedList;
import java.util.Queue;

public class QueueData {
	public static void main(String[] args) {
		
		Queue<Integer> queue = new LinkedList();
		queue.add(10);
		queue.add(45);
		queue.add(23);
		
		System.out.println("Front element" + queue.peek());
		
		System.out.println("Dequeued element: " + queue.remove());
		System.out.println("Dequeued elementL " + queue.remove());
		
		if(queue.isEmpty())
			System.out.println("The queue is empty");
		else
			System.out.println("Queue not empty");
		
		System.out.println("Size of queue: "+queue.size());
		
	}
	
}

package dataStructure;

public class QueueUsingLinkedList {
	static Node head;
	static Node tail;
	public static void main(String[] args) {
		Node front;
		Node back;
		addQueue(4);
		
	}
	
	public static void addQueue(int data) {
		Node newNode = new Node(data);
		if(head==null && tail==null) {
			head = newNode;
			tail = newNode;
		}
		else {
			Node temp = head;
			head = newNode;
			head.next = temp;
		}
	}
	class Node {
		int data;
		Node next = null;
		
		public Node(int data)
		{
			this.data = data;
			this.next = null;
		}
	}
	
	
}

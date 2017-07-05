package ch2;
import java.util.*;

public class Test {
	
	public static void main(String[] args) {
		Node[] nodes = createList();	
		printList(nodes[0]);
		System.out.println("------------------");
		MiddleDelete.remove(nodes[1]);
		printList(nodes[0]);
		
	}
	
	public static void printList(Node head){
		Node current = head;
		while(current != null){
			System.out.println(current.getData());
			current = current.getNext();
		}
	}
	
	public static Node[] createList(){
		Node one = new Node(10);
		Node two = new Node(15);
		Node three = new Node(10);
		Node four = new Node(5);
		Node five = new Node(10);
		Node six = new Node(20);
		Node seven = new Node(5);
		Node eight = new Node(30);
		
		one.setNext(two);
		two.setNext(three);
		three.setNext(four);
		four.setNext(five);
		five.setNext(six);
		six.setNext(seven);
		seven.setNext(eight);
		
		return new Node[] {one, four};
	}
}

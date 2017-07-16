package ch2;
import java.util.*;

public class Test {
	static Integer i;
	public static void main(String[] args) {
		Node one = createList(new int[] {5,2,1,0,1,2,5});
		Node two = createList(new int[] {6,2,1,1,2,6});
		
		
		
//		ListSum.backwardSum(head);
		System.out.println("----------------");
		
		
		
		
	}
	
	public static void printList(Node head){
		Node current = head;
		while(current != null){
			System.out.println(current.getData());
			current = current.getNext();
		}
	}
	
	public static Node createList(int[] arr){
		Node head = new Node(arr[0]);
		Node current = head;
		for(int i = 1; i < arr.length; i++){
			Node nextNode = new Node(arr[i]);
			current.setNext(nextNode);
			nextNode.setPrev(current);
			current = nextNode;
		}
		return head;
	}
}

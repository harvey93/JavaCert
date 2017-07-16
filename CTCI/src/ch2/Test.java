package ch2;
import java.util.*;

public class Test {
	static Integer i;
	public static void main(String[] args) {
		Node one = createList(new int[] {7,1,6,2});
		Node two = createList(new int[] {5,9,2});
		printList(one);
		ListSum.reverseList(one);
//		ListSum.backwardSum(head);
		System.out.println("----------------");
		printList(one);
//		Node sumHead = ListSum.backwardSum(one, two);
//		printList(sumHead);
		
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

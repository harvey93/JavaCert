package ch2;

public class ListSum {
	
	public static Node forwardSum(Node first, Node second){
		Node sum = null;
		return sum;
	}
	
	public static Node backwardSum(Node first, Node second){
		Node last = null;
		Node head = null;
		int carry = 0;
		while(first != null || second != null){
			int currentSum = carry;
			int firstVal;
			int secondVal;
			
			if(first == null){
				firstVal = 0;
			}else {
				firstVal = first.getData();
				first = first.getNext();
			}
			
			if(second == null){
				secondVal = 0;
			}else {
				secondVal = second.getData();
				second = second.getNext();
			}
			
			currentSum += firstVal;
			currentSum += secondVal;
			carry = currentSum / 10;
			currentSum = currentSum % 10;
			
			if(last == null){
				head = new Node(currentSum);
				last = head;
			}else{
				Node next = new Node(currentSum);
				last.setNext(next);
				last = next;
			}
		}
		
		return head;
	}

}
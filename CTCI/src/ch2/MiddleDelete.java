package ch2;

public class MiddleDelete {
	
	public static void remove(Node node){
		Node nextNode = node.getNext();
		node.setData(nextNode.getData());
		node.setNext(nextNode.getNext());
	} 
	
	public static void partition(Node node){
		
	}
}

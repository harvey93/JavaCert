package ch2;
import java.util.*;

public class Test {
	
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		fillList(list);
		System.out.println(list);
	}
	
	public static void fillList(LinkedList<Integer> list){
		list.add(10);
		list.add(5);
		list.add(10);
		list.add(15);
		list.add(11);
		list.add(5);
	}
}

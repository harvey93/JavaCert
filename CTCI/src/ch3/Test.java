package ch3;

import java.util.Stack;

public class Test {
	
	public static void main(String[] args) {
		NodeStack<Integer> stack = new NodeStack<>();
//		stack.push(10);
		try {
			stack.pop();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
	}
}

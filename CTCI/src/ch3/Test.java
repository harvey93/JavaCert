package ch3;

import java.util.Stack;

public class Test {
	
	public static void main(String[] args) {
		MyStack<Double> stack = new MyStack<>();
		stack.push(10.0);
		stack.push(15.3);
		stack.push(9.1);
		stack.push(12.);
		System.out.println(stack);
	}
}

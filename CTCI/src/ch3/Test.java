package ch3;


public class Test {
	
	public static void main(String[] args) throws StackEmptyException{
		ArrStack<Double> stack = new ArrStack<>();
		stack.push(12.4);
		stack.push(8.6);
		stack.push(14.9);
		stack.pop();
		stack.pop();
		stack.pop();
		
		
		System.out.println(stack);
	}
	
}

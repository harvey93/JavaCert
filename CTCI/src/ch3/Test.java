package ch3;

public class Test {

	
	public static void main(String[] args) throws StackEmptyException{
		Plates<Integer> stacks = new Plates<>(4);
		stacks.push(1);
		stacks.push(2);
		stacks.push(3);
		stacks.push(4);
		stacks.push(5);
		stacks.pop();
		stacks.push(20);
		stacks.pop();
		stacks.pop();
		stacks.pop();
		stacks.pop();
		stacks.pop();
		stacks.pop();
		System.out.println(stacks);
	}
	
}

package ch8;
import java.util.*;

public class TowersOfHanoi {
	
	
	
	public TowersOfHanoi(int n){
		
	}
	
	public void buildTowers(int n){
		
	}
}

class Tower{
	Stack<Disk> stack = new Stack<>();
	
	public Disk get(){
		return stack.pop();
	}
	
	public void add(Disk disk){
		stack.push(disk);
	}
}

class Disk{

	int size;
	public Disk(int size){
		this.size = size;
	}
}

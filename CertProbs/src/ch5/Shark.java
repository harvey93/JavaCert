package ch5;

public class Shark extends Fish{
	
	private int numberOfFins = 8;
	
	public Shark(int age) {
		super(age);
		this.size = 4;
	}
	
	public void display(){
		System.out.println("Shark Age: " + getAge());
		System.out.println("Size: " + this.size + " meters");
		System.out.println("Finsh: " + numberOfFins);
	}
}

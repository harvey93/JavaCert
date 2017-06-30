package ch5;

public abstract class Mammal {
	protected int age;
	public void eat(){
		System.out.println("Mammal is eating");
	}
	
	public abstract String getName();
}

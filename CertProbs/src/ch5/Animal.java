package ch5;

public class Animal {

	private int age;
	private String name;
	
	public Animal(int age){
//		super();
		this.age = age;
		this.name = null;
	} 
	
	public Animal(int age, String name){
		this.age = age;
		this.name = name;
	}
	
	public Animal(){
		
	}
	
	public int getAge(){
		return this.age;
	}
	
	public void setAge(int age){
		this.age = age;
	}

}

package ch3;



public class Test {
	
	public static void main(String[] args) {
		AnimalShelter shelter = new AnimalShelter();
		shelter.enqueue(new Dog("Hrant"));
		shelter.enqueue(new Dog("Fredo"));
		shelter.enqueue(new Dog("Paul"));
		shelter.dequeuDog();
		System.out.println(shelter);
	}

}

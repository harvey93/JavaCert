package ch3;



public class Test {
	
	public static void main(String[] args) {
		AnimalShelter shelter = new AnimalShelter();
		shelter.enqueue(new Dog("Hrant"));
		shelter.enqueue(new Dog("Fredo"));
		shelter.enqueue(new Dog("Paul"));
		shelter.dequeuDog();
		shelter.enqueue(new Cat("Mittens"));
		shelter.enqueue(new Cat("Kat"));
		shelter.dequeuCat();
		System.out.println(shelter);
	}

}

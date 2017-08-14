package strategy;

public class Test {

	public static void main(String[] args) {
		Animal d = new Dog();
		Animal b = new Bird();
		System.out.println(d.tryToFly());
		System.out.println(b.tryToFly());
		
		d.setFlyingType(new ItFlys());
		
		System.out.println(d.tryToFly());
	}
}
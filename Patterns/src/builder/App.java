package builder;

public class App {

	public static void main(String[] args) {
		Coffee c = new Coffee.CoffeeBuilder().milkType("Skim").beans(5).beanType("african").build();
		System.out.println(c);
	}
}

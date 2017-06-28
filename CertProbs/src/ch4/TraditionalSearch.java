package ch4;
import java.util.*;

public class TraditionalSearch {
	
	public static void main(String[] args) {
		ArrayList<Animal> list = new ArrayList<>();
		list.add(new Animal("fish", false, true));
		list.add(new Animal("kangaroo", true, false));
		list.add(new Animal("rabbit", true, false));
		list.add(new Animal("turtle", false, true));
		
//		print(list, new CheckIfHopper());
//		print(list, a -> a.canHop());
		print(list, new CheckIfSwimmer());
		print(list, a -> a.canSwim());
	}
	
	public static void print(ArrayList<Animal> animals, CheckTrait checker){
		for(Animal a : animals){
			if(checker.test(a)){
				System.out.println(a);
			}
		}
	}
}

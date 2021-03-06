package ch4;
import java.util.*;
import java.util.function.*;

public class TraditionalSearch {
	
	public static void main(String[] args) {
		ArrayList<Animal> list = new ArrayList<>();
		list.add(new Animal("fish", false, true));
		list.add(new Animal("kangaroo", true, false));
		list.add(new Animal("rabbit", true, false));
		list.add(new Animal("turtle", false, true));
		
//		list.forEach(a -> {
//			if(a.canHop()){
//				System.out.println(a);
//			}
//		});
//		print(list, new CheckIfHopper());
		print(list, 
				(Animal a) -> {
					return a.canHop();
				}
				);
//		print(list, new CheckIfSwimmer());
//		print(list, a -> a.canSwim());
	}
	
	public static void print(ArrayList<Animal> animals, Predicate<Animal> checker){
//		for(Animal a : animals){
//			if(checker.test(a)){
//				System.out.println(a);
//			}
//		}
		animals.forEach(a -> {
			if(checker.test(a)){
				System.out.println(a);
			}
		});
	}
}

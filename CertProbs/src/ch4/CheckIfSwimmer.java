package ch4;

public class CheckIfSwimmer implements CheckTrait{
	public boolean test(Animal a){
		return a.canSwim();
	}
}
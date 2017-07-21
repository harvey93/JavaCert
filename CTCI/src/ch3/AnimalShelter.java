package ch3;

import java.util.HashMap;
import java.util.LinkedList;

public class AnimalShelter {

	private int count;
	private LinkedList<AnimalNode> dogList;
	private LinkedList<AnimalNode> catList;
	
	public AnimalShelter(){
		this.dogList = new LinkedList<>();
		this.catList = new LinkedList<>();
	}
	
	public void enqueue(Animal a){
		if(a instanceof Dog){
			this.dogList.add(new AnimalNode(a, this.count));
		}else if(a instanceof Cat){
			this.catList.add(new AnimalNode(a, this.count));
		}
		count++;
	}
	
	public Dog dequeuDog(){
		return (Dog)this.dogList.removeFirst().animal;
	}
	
	public String toString(){
		return "Dogs: " + this.dogList.toString() + "\n" +
				"Cats: " + this.catList.toString();
	}
	

	private class AnimalNode{
		
		private Animal animal;
		private int count;
		
		private AnimalNode(Animal animal, int count){
			this.animal = animal;
			this.count = count;
		}
				
	}

}

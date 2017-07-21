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
	

	private class AnimalNode{
		
		private String name;
		private int count;
		
		private AnimalNode(String name, int count){
			this.name = name;
			this.count = count;
		}

		public String getName() {
			return name;
		}

		public int getCount() {
			return count;
		}
		
		
	}

}

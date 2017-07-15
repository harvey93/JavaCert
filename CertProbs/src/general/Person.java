package general;

public class Person implements Comparable{
	
	String name;
	public Person(String name){
		this.name = name;
	}
	
	public boolean equals(Person p2){
		if(this.name.equals(p2.getName())){
			return true;
		}else {
			return false;
		}
	}
	
	public String getName(){
		return this.name;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
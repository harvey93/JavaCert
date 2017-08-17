package singleton;

public class Singleton {
	
	private static Singleton instance;
	
	public static Singleton getIntance(){
		if(instance == null){
			instance = new Singleton();
		}
		
		return instance;
	}

	private Singleton(){
		
	}
}

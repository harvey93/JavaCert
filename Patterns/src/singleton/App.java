package singleton;

public class App {
	
	public static void main(String[] args) {
		
		Singleton a = Singleton.getIntance();
		Singleton b = Singleton.getIntance();
		
		System.out.println(a == b);
	}

}



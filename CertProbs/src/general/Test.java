package general;

public class Test {

	public static void main(String[] args) {
		Double d = 3.0;
		System.out.println(d);
	}
	
	public static void nxt(Object o) {
		String [] y = (String[]) o;
		for(int i = 0; i < y.length; ++i){
			System.out.println(y[i]);
		}
	}
	
	public static void switchTest(int i){
		switch(i){
		case 10: System.out.println(10);
		case 1: System.out.println(1);
		default: System.out.println("default");break;
		case 5: System.out.println(5);
		}
	}
}

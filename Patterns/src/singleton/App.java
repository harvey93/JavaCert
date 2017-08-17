package singleton;

public class App {
	
	public static void main(String[] args) {
		Runnable u1  = new User();
		Runnable u2  = new User();
		Runnable u3  = new User();
		new Thread(u1).start();
		new Thread(u2).start();
		new Thread(u3).start();
	}

}

class User implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Singleton.getIntance());
	}
	
}
